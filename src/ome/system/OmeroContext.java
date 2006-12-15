/*
 * ome.system.OmeroContext
 *
 *   Copyright 2006 University of Dundee. All rights reserved.
 *   Use is subject to license terms supplied in LICENSE.txt
 */

package ome.system;

// Java imports
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

// Third-party libraries
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

// Application-internal dependencies
import ome.api.ServiceInterface;
import ome.conditions.ApiUsageException;

/**
 * Provides static access for the creation of singleton and non-singleton
 * application contexts. Also provides context names as constant fields which
 * can be used for the lookup of particular contexts, through either
 * {@link #getInstance(String)} or
 * {@link ome.system.ServiceFactory#ServiceFactory(String)}.
 * 
 * By passing a {@link java.util.Properties} instance into the
 * {@link #getClientContext(Properties)} method, a non-static version is
 * created. Currently this is only supported for the client context.
 * 
 * @author <br>
 *         Josh Moore &nbsp;&nbsp;&nbsp;&nbsp; <a
 *         href="mailto:josh.moore@gmx.de"> josh.moore@gmx.de</a>
 * @version 1.0 <small> (<b>Internal version:</b> $Revision: $ $Date: $)
 *          </small>
 * @since OME3.0
 */
public class OmeroContext extends ClassPathXmlApplicationContext {
    /**
     * identifier for an OmeroContext configured in
     * classpath*:beanRefContext.xml for use by remote (via JNDI/RMI) clients.
     */
    public final static String CLIENT_CONTEXT = "ome.client";

    /**
     * identifier for an OmeroContext configured in
     * classpath*:beanRefContext.xml for use by server-side processes. All
     * objects obtained from the context are in a state for immediate use.
     */
    public final static String MANAGED_CONTEXT = "ome.server";

    private static OmeroContext _client;

    private static OmeroContext _managed;;

    // ~ Constructors
    // =========================================================================

    public OmeroContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    public OmeroContext(String[] configLocations) throws BeansException {
        super(configLocations);
    }

    public OmeroContext(String[] configLocations, boolean refresh)
            throws BeansException {
        super(configLocations, refresh);
    }

    public OmeroContext(String[] configLocations, ApplicationContext parent)
            throws BeansException {
        super(configLocations, parent);
    }

    public OmeroContext(String[] configLocations, boolean refresh,
            ApplicationContext parent) throws BeansException {
        super(configLocations, refresh, parent);
    }

    // ~ Creation
    // =========================================================================

    private final static Object mutex = new Object();

    /**
     * create (if necessary) and return the single default client OmeroContext.
     * Any two calls to this method will return the same (==) context instance.
     * 
     * @see #CLIENT_CONTEXT
     */
    public static OmeroContext getClientContext() {
        synchronized (mutex) {
            if (_client == null) {
                _client = getInstance(CLIENT_CONTEXT);
            }

            return _client;
        }
    }

    /**
     * initialize a new client OmeroContext (named {@link #CLIENT_CONTEXT}),
     * using the {@link Properties} provided as a values for property (e.g.
     * ${name}) replacement in Spring. Two calls to this method with the same
     * argument will return different ( =! ) contexts.
     * 
     * @see #CLIENT_CONTEXT
     * @see ServiceFactory#ServiceFactory(Login)
     * @see ServiceFactory#ServiceFactory(Properties)
     */
    public static OmeroContext getClientContext(Properties props) {
        if (props == null) {
            throw new ApiUsageException("Properties argument may not be null.");
        }

        Properties copy = new Properties(props);
        ConstructorArgumentValues ctorArg = new ConstructorArgumentValues();
        ctorArg.addGenericArgumentValue(copy);
        BeanDefinition definition = new RootBeanDefinition(Properties.class,
                ctorArg, null);
        StaticApplicationContext staticContext = new StaticApplicationContext();
        staticContext.registerBeanDefinition("properties", definition);
        staticContext.refresh();

        OmeroContext ctx = new Locator().lookup(CLIENT_CONTEXT);
        ctx.setParent(staticContext);
        ctx.refresh();
        return ctx;
    }

    /**
     * create (if necessary) and return the single default managed OmeroContext.
     * Any two calls to this method will return the same (==) context instance.
     * Managed means that the services are fully wrapped by interceptors, and
     * are essentially the services made available remotely.
     * 
     * @see #INTERNAL_CONTEXT
     */
    public static OmeroContext getManagedServerContext() {
        synchronized (mutex) {
            if (_managed == null) {
                _managed = getInstance(MANAGED_CONTEXT);
            }

            return _managed;
        }

    }

    /**
     * create (if necessary) and return the single default OmeroContext named by
     * the beanFactoryName parameter. Any two calls to this method with the same
     * parameter will return the same (==) context instance.
     * 
     * @see #getClientContext()
     * @see #getInternalServerContext()
     * @see #getManagedServerContext()
     */
    public static OmeroContext getInstance(String beanFactoryName) {
        OmeroContext ctx = (OmeroContext) ContextSingletonBeanFactoryLocator
                .getInstance().useBeanFactory(beanFactoryName).getFactory();
        try {
            ctx.getBeanFactory();
        } catch (IllegalStateException ise) {
            ctx.refresh();
        }
        return ctx;
    }

    // ~ Utilities
    // =========================================================================

    /**
     * uses the methods of this context's {@link BeanFactory} to autowire any
     * Object based on the given beanName. This is used by
     * {@link SelfConfigurableService} instances to acquire dependencies.
     * 
     * @see SelfConfigurableService
     * @see org.springframework.beans.factory.config.AutowireCapableBeanFactory#applyBeanPropertyValues(java.lang.Object,
     *      java.lang.String)
     */
    public void applyBeanPropertyValues(Object target,
            Class<? extends ServiceInterface> beanInterface) {
        // TODO: it would be better to have this as <? extends
        // SelfConfigurableService>
        // but there are issues because of the ApplicationContextAware. Perhaps
        // we can combine them later.
        this.getAutowireCapableBeanFactory().applyBeanPropertyValues(target,
                "internal:" + beanInterface.getName());
    }

    /**
     * refreshes all the nested OmeroContexts within this instance. This is
     * useful when using a static context, and {@link Properties} which were
     * pulled from {@link System#getProperties()} have been changed.
     * 
     * If this is a server-side instance ({@link OmeroContext#MANAGED_CONTEXT}
     * or {@link OmeroContext#INTERNAL_CONTEXT}), this may take a significant
     * amount of time.
     * 
     * @see org.springframework.context.ConfigurableApplicationContext#refresh()
     */
    public void refreshAll() {
        ApplicationContext ac = this;
        List<ConfigurableApplicationContext> list = new LinkedList<ConfigurableApplicationContext>();
        while (ac instanceof ConfigurableApplicationContext) {
            list.add((ConfigurableApplicationContext) ac);
            ac = ac.getParent();
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            list.get(i).refresh();
        }

    }

    public String getProperty(String propertyName) {
        return null;
    }

    // ~ Non-singleton locator
    // =========================================================================

    /**
     * provides access to the protected methods of
     * {@link org.springframework.context.access.ContextSingletonBeanFactoryLocator}
     * which cannot be used externally.
     */
    protected static class Locator extends ContextSingletonBeanFactoryLocator {
        // copied from ContextSingletonBeanFactoryLocator
        private static final String BEANS_REFS_XML_NAME = "classpath*:beanRefContext.xml";

        public Locator() {
            super();
        }

        /**
         * uses
         * {@link ContextSingletonBeanFactoryLocator#createDefinition(java.lang.String, java.lang.String)}
         * and
         * {@link ContextSingletonBeanFactoryLocator#initializeDefinition(org.springframework.beans.factory.BeanFactory)}
         * to create a new context from a given definition.
         */
        public OmeroContext lookup(String selector) {
            BeanFactory beanRefContext = createDefinition(BEANS_REFS_XML_NAME,
                    "manual");
            initializeDefinition(beanRefContext);
            return (OmeroContext) beanRefContext.getBean(selector);
        }

    }

}

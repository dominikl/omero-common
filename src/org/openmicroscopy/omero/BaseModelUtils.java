/*
 * org.openmicroscopy.omero.BaseModelUtils
 *
 *------------------------------------------------------------------------------
 *
 *  Copyright (C) 2004 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *------------------------------------------------------------------------------
 */

package org.openmicroscopy.omero;

import java.util.Set;

//Java imports

//Third-party libraries

//Application-internal dependencies

/**
 * Default model utility which will be available in all model objects.
 * Provides null-operation methods for all necessary tasks. The static fields 
 * in the model classes can be set by the container as necessary.
 * 
 * @author  <br>Josh Moore &nbsp;&nbsp;&nbsp;&nbsp;
 * 				<a href="mailto:josh.moore@gmx.de">
 * 					josh.moore@gmx.de</a>
 * @version 1.0
 * <small>
 * (<b>Internal version:</b> $Revision: $ $Date: $)
 * </small>
 * @since 1.0
 */
public class BaseModelUtils {

    public void clean(Object o) {
        // null-op
    }

    public void clean(Object o, Set done) {
        //null-op
        done.add(o);//TODO
    }
}
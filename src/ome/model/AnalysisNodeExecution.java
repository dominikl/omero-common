package ome.model;

import ome.util.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * AnalysisNodeExecution generated by hbm2java
 */
public class
AnalysisNodeExecution 
implements java.io.Serializable ,
ome.api.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer analysisNodeExecutionId;
     private AnalysisChainExecution analysisChainExecution;
     private AnalysisChainNode analysisChainNode;
     private ModuleExecution moduleExecution;


    // Constructors

    /** default constructor */
    public AnalysisNodeExecution() {
    }
    
    /** constructor with id */
    public AnalysisNodeExecution(Integer analysisNodeExecutionId) {
        this.analysisNodeExecutionId = analysisNodeExecutionId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getAnalysisNodeExecutionId() {
        return this.analysisNodeExecutionId;
    }
    
    public void setAnalysisNodeExecutionId(Integer analysisNodeExecutionId) {
        this.analysisNodeExecutionId = analysisNodeExecutionId;
    }

    /**
     * 
     */
    public AnalysisChainExecution getAnalysisChainExecution() {
        return this.analysisChainExecution;
    }
    
    public void setAnalysisChainExecution(AnalysisChainExecution analysisChainExecution) {
        this.analysisChainExecution = analysisChainExecution;
    }

    /**
     * 
     */
    public AnalysisChainNode getAnalysisChainNode() {
        return this.analysisChainNode;
    }
    
    public void setAnalysisChainNode(AnalysisChainNode analysisChainNode) {
        this.analysisChainNode = analysisChainNode;
    }

    /**
     * 
     */
    public ModuleExecution getModuleExecution() {
        return this.moduleExecution;
    }
    
    public void setModuleExecution(ModuleExecution moduleExecution) {
        this.moduleExecution = moduleExecution;
    }





	/** utility methods. Container may re-assign this. */	
	protected static ome.util.BaseModelUtils _utils = 
		new ome.util.BaseModelUtils();
	public BaseModelUtils getUtils(){
		return _utils;
	}
	public void setUtils(BaseModelUtils utils){
		_utils = utils;
	}

  public boolean acceptFilter(Filter filter){


	  // Visiting: AnalysisNodeExecutionId ------------------------------------------
	  Integer _AnalysisNodeExecutionId = null;
	  try {
	     _AnalysisNodeExecutionId = getAnalysisNodeExecutionId();
	  } catch (Exception e) {
		 setAnalysisNodeExecutionId(null);
	  }
// TODO catch class cast?
	  setAnalysisNodeExecutionId((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisNodeExecution):AnalysisNodeExecutionId",_AnalysisNodeExecutionId)); 

	  // Visiting: AnalysisChainExecution ------------------------------------------
	  AnalysisChainExecution _AnalysisChainExecution = null;
	  try {
	     _AnalysisChainExecution = getAnalysisChainExecution();
	  } catch (Exception e) {
		 setAnalysisChainExecution(null);
	  }
// TODO catch class cast?
	  setAnalysisChainExecution((AnalysisChainExecution) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisNodeExecution):AnalysisChainExecution",_AnalysisChainExecution)); 

	  // Visiting: AnalysisChainNode ------------------------------------------
	  AnalysisChainNode _AnalysisChainNode = null;
	  try {
	     _AnalysisChainNode = getAnalysisChainNode();
	  } catch (Exception e) {
		 setAnalysisChainNode(null);
	  }
// TODO catch class cast?
	  setAnalysisChainNode((AnalysisChainNode) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisNodeExecution):AnalysisChainNode",_AnalysisChainNode)); 

	  // Visiting: ModuleExecution ------------------------------------------
	  ModuleExecution _ModuleExecution = null;
	  try {
	     _ModuleExecution = getModuleExecution();
	  } catch (Exception e) {
		 setModuleExecution(null);
	  }
// TODO catch class cast?
	  setModuleExecution((ModuleExecution) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisNodeExecution):ModuleExecution",_ModuleExecution)); 
   	 return true;
  }
  
  public String toString(){
	return "AnalysisNodeExecution"+(analysisNodeExecutionId==null ? ":Hash"+this.hashCode() : ":"+analysisNodeExecutionId);
  }
  


}
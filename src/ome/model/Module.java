package ome.model;

import ome.util.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * Module generated by hbm2java
 */
public class
Module 
implements java.io.Serializable ,
ome.api.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer moduleId;
     private String location;
     private String name;
     private String executionInstructions;
     private String description;
     private String moduleType;
     private String defaultIterator;
     private String newFeatureTag;
     private Set formalOutputs;
     private Set formalInputs;
     private Set moduleExecutions;
     private Set analysisChainNodes;


    // Constructors

    /** default constructor */
    public Module() {
    }
    
    /** constructor with id */
    public Module(Integer moduleId) {
        this.moduleId = moduleId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 
     */
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getExecutionInstructions() {
        return this.executionInstructions;
    }
    
    public void setExecutionInstructions(String executionInstructions) {
        this.executionInstructions = executionInstructions;
    }

    /**
     * 
     */
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    public String getModuleType() {
        return this.moduleType;
    }
    
    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    /**
     * 
     */
    public String getDefaultIterator() {
        return this.defaultIterator;
    }
    
    public void setDefaultIterator(String defaultIterator) {
        this.defaultIterator = defaultIterator;
    }

    /**
     * 
     */
    public String getNewFeatureTag() {
        return this.newFeatureTag;
    }
    
    public void setNewFeatureTag(String newFeatureTag) {
        this.newFeatureTag = newFeatureTag;
    }

    /**
     * 
     */
    public Set getFormalOutputs() {
        return this.formalOutputs;
    }
    
    public void setFormalOutputs(Set formalOutputs) {
        this.formalOutputs = formalOutputs;
    }

    /**
     * 
     */
    public Set getFormalInputs() {
        return this.formalInputs;
    }
    
    public void setFormalInputs(Set formalInputs) {
        this.formalInputs = formalInputs;
    }

    /**
     * 
     */
    public Set getModuleExecutions() {
        return this.moduleExecutions;
    }
    
    public void setModuleExecutions(Set moduleExecutions) {
        this.moduleExecutions = moduleExecutions;
    }

    /**
     * 
     */
    public Set getAnalysisChainNodes() {
        return this.analysisChainNodes;
    }
    
    public void setAnalysisChainNodes(Set analysisChainNodes) {
        this.analysisChainNodes = analysisChainNodes;
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


	  // Visiting: ModuleId ------------------------------------------
	  Integer _ModuleId = null;
	  try {
	     _ModuleId = getModuleId();
	  } catch (Exception e) {
		 setModuleId(null);
	  }
// TODO catch class cast?
	  setModuleId((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):ModuleId",_ModuleId)); 

	  // Visiting: Location ------------------------------------------
	  String _Location = null;
	  try {
	     _Location = getLocation();
	  } catch (Exception e) {
		 setLocation(null);
	  }
// TODO catch class cast?
	  setLocation((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):Location",_Location)); 

	  // Visiting: Name ------------------------------------------
	  String _Name = null;
	  try {
	     _Name = getName();
	  } catch (Exception e) {
		 setName(null);
	  }
// TODO catch class cast?
	  setName((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):Name",_Name)); 

	  // Visiting: ExecutionInstructions ------------------------------------------
	  String _ExecutionInstructions = null;
	  try {
	     _ExecutionInstructions = getExecutionInstructions();
	  } catch (Exception e) {
		 setExecutionInstructions(null);
	  }
// TODO catch class cast?
	  setExecutionInstructions((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):ExecutionInstructions",_ExecutionInstructions)); 

	  // Visiting: Description ------------------------------------------
	  String _Description = null;
	  try {
	     _Description = getDescription();
	  } catch (Exception e) {
		 setDescription(null);
	  }
// TODO catch class cast?
	  setDescription((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):Description",_Description)); 

	  // Visiting: ModuleType ------------------------------------------
	  String _ModuleType = null;
	  try {
	     _ModuleType = getModuleType();
	  } catch (Exception e) {
		 setModuleType(null);
	  }
// TODO catch class cast?
	  setModuleType((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):ModuleType",_ModuleType)); 

	  // Visiting: DefaultIterator ------------------------------------------
	  String _DefaultIterator = null;
	  try {
	     _DefaultIterator = getDefaultIterator();
	  } catch (Exception e) {
		 setDefaultIterator(null);
	  }
// TODO catch class cast?
	  setDefaultIterator((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):DefaultIterator",_DefaultIterator)); 

	  // Visiting: NewFeatureTag ------------------------------------------
	  String _NewFeatureTag = null;
	  try {
	     _NewFeatureTag = getNewFeatureTag();
	  } catch (Exception e) {
		 setNewFeatureTag(null);
	  }
// TODO catch class cast?
	  setNewFeatureTag((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):NewFeatureTag",_NewFeatureTag)); 

	  // Visiting: FormalOutputs ------------------------------------------
	  Set _FormalOutputs = null;
	  try {
	     _FormalOutputs = getFormalOutputs();
	  } catch (Exception e) {
		 setFormalOutputs(null);
	  }
// TODO catch class cast?
	  setFormalOutputs((Set) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):FormalOutputs",_FormalOutputs)); 

	  // Visiting: FormalInputs ------------------------------------------
	  Set _FormalInputs = null;
	  try {
	     _FormalInputs = getFormalInputs();
	  } catch (Exception e) {
		 setFormalInputs(null);
	  }
// TODO catch class cast?
	  setFormalInputs((Set) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):FormalInputs",_FormalInputs)); 

	  // Visiting: ModuleExecutions ------------------------------------------
	  Set _ModuleExecutions = null;
	  try {
	     _ModuleExecutions = getModuleExecutions();
	  } catch (Exception e) {
		 setModuleExecutions(null);
	  }
// TODO catch class cast?
	  setModuleExecutions((Set) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):ModuleExecutions",_ModuleExecutions)); 

	  // Visiting: AnalysisChainNodes ------------------------------------------
	  Set _AnalysisChainNodes = null;
	  try {
	     _AnalysisChainNodes = getAnalysisChainNodes();
	  } catch (Exception e) {
		 setAnalysisChainNodes(null);
	  }
// TODO catch class cast?
	  setAnalysisChainNodes((Set) filter.filter("org.hibernate.mapping.RootClass(ome.model.Module):AnalysisChainNodes",_AnalysisChainNodes)); 
   	 return true;
  }
  
  public String toString(){
	return "Module"+(moduleId==null ? ":Hash"+this.hashCode() : ":"+moduleId);
  }
  


}
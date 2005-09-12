package ome.model;

import ome.util.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * AnalysisChainLink generated by hbm2java
 */
public class
AnalysisChainLink 
implements java.io.Serializable ,
ome.api.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer analysisChainLinkId;
     private AnalysisChain analysisChain;
     private AnalysisChainNode analysisChainNodeByToNode;
     private AnalysisChainNode analysisChainNodeByFromNode;
     private FormalOutput formalOutput;
     private FormalInput formalInput;


    // Constructors

    /** default constructor */
    public AnalysisChainLink() {
    }
    
    /** constructor with id */
    public AnalysisChainLink(Integer analysisChainLinkId) {
        this.analysisChainLinkId = analysisChainLinkId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getAnalysisChainLinkId() {
        return this.analysisChainLinkId;
    }
    
    public void setAnalysisChainLinkId(Integer analysisChainLinkId) {
        this.analysisChainLinkId = analysisChainLinkId;
    }

    /**
     * 
     */
    public AnalysisChain getAnalysisChain() {
        return this.analysisChain;
    }
    
    public void setAnalysisChain(AnalysisChain analysisChain) {
        this.analysisChain = analysisChain;
    }

    /**
     * 
     */
    public AnalysisChainNode getAnalysisChainNodeByToNode() {
        return this.analysisChainNodeByToNode;
    }
    
    public void setAnalysisChainNodeByToNode(AnalysisChainNode analysisChainNodeByToNode) {
        this.analysisChainNodeByToNode = analysisChainNodeByToNode;
    }

    /**
     * 
     */
    public AnalysisChainNode getAnalysisChainNodeByFromNode() {
        return this.analysisChainNodeByFromNode;
    }
    
    public void setAnalysisChainNodeByFromNode(AnalysisChainNode analysisChainNodeByFromNode) {
        this.analysisChainNodeByFromNode = analysisChainNodeByFromNode;
    }

    /**
     * 
     */
    public FormalOutput getFormalOutput() {
        return this.formalOutput;
    }
    
    public void setFormalOutput(FormalOutput formalOutput) {
        this.formalOutput = formalOutput;
    }

    /**
     * 
     */
    public FormalInput getFormalInput() {
        return this.formalInput;
    }
    
    public void setFormalInput(FormalInput formalInput) {
        this.formalInput = formalInput;
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


	  // Visiting: AnalysisChainLinkId ------------------------------------------
	  Integer _AnalysisChainLinkId = null;
	  try {
	     _AnalysisChainLinkId = getAnalysisChainLinkId();
	  } catch (Exception e) {
		 setAnalysisChainLinkId(null);
	  }
// TODO catch class cast?
	  setAnalysisChainLinkId((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):AnalysisChainLinkId",_AnalysisChainLinkId)); 

	  // Visiting: AnalysisChain ------------------------------------------
	  AnalysisChain _AnalysisChain = null;
	  try {
	     _AnalysisChain = getAnalysisChain();
	  } catch (Exception e) {
		 setAnalysisChain(null);
	  }
// TODO catch class cast?
	  setAnalysisChain((AnalysisChain) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):AnalysisChain",_AnalysisChain)); 

	  // Visiting: AnalysisChainNodeByToNode ------------------------------------------
	  AnalysisChainNode _AnalysisChainNodeByToNode = null;
	  try {
	     _AnalysisChainNodeByToNode = getAnalysisChainNodeByToNode();
	  } catch (Exception e) {
		 setAnalysisChainNodeByToNode(null);
	  }
// TODO catch class cast?
	  setAnalysisChainNodeByToNode((AnalysisChainNode) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):AnalysisChainNodeByToNode",_AnalysisChainNodeByToNode)); 

	  // Visiting: AnalysisChainNodeByFromNode ------------------------------------------
	  AnalysisChainNode _AnalysisChainNodeByFromNode = null;
	  try {
	     _AnalysisChainNodeByFromNode = getAnalysisChainNodeByFromNode();
	  } catch (Exception e) {
		 setAnalysisChainNodeByFromNode(null);
	  }
// TODO catch class cast?
	  setAnalysisChainNodeByFromNode((AnalysisChainNode) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):AnalysisChainNodeByFromNode",_AnalysisChainNodeByFromNode)); 

	  // Visiting: FormalOutput ------------------------------------------
	  FormalOutput _FormalOutput = null;
	  try {
	     _FormalOutput = getFormalOutput();
	  } catch (Exception e) {
		 setFormalOutput(null);
	  }
// TODO catch class cast?
	  setFormalOutput((FormalOutput) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):FormalOutput",_FormalOutput)); 

	  // Visiting: FormalInput ------------------------------------------
	  FormalInput _FormalInput = null;
	  try {
	     _FormalInput = getFormalInput();
	  } catch (Exception e) {
		 setFormalInput(null);
	  }
// TODO catch class cast?
	  setFormalInput((FormalInput) filter.filter("org.hibernate.mapping.RootClass(ome.model.AnalysisChainLink):FormalInput",_FormalInput)); 
   	 return true;
  }
  
  public String toString(){
	return "AnalysisChainLink"+(analysisChainLinkId==null ? ":Hash"+this.hashCode() : ":"+analysisChainLinkId);
  }
  


}
package com.s8.pkgs.ui.slate.structures;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.ui.slate.SlateWebSources;



/**
 * 
 */
public class SlateLeftColumn extends S8WebObject {
	
	
	public SlateLeftColumn(S8WebFront front) {
		super(front, SlateWebSources.ROOT_WEBPATH + "/structures/PaperLargeColumn");
	}
	

	
	/**
	 * 
	 * @param options
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	

	/**
	 * 
	 * @param options
	 */
	public void setElements(List<S8WebObject> elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	

	

}

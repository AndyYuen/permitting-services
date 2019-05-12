package com.myspace.permitting.structuralpermit;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;


public class submitPermitRequest implements WorkItemHandler {
	static int currentId = 20001;

    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {

    	String id = String.format("RSP-%d", currentId++);


        Map<String, Object> results = new HashMap<String, Object>();
        results.put("applicationID", id);
        manager.completeWorkItem(workItem.getId(), results);
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        // TODO Auto-generated method stub
    }
    
    

}

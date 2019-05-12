package com.myspace.permitting.structuralpermit;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class getPermitStatus implements WorkItemHandler {
	static Random rand = new Random();

    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    	String status = "DENIED";
    	
    	int num = rand.nextInt(100);
        if (num < 33) {
        	status = "IN_PROGRESS";
        }
        else if (num < 66) {
        	status = "APPROVED";
        }


        Map<String, Object> results = new HashMap<String, Object>();
        results.put("result", status);
        manager.completeWorkItem(workItem.getId(), results);
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        // TODO Auto-generated method stub
    }
    
    

}

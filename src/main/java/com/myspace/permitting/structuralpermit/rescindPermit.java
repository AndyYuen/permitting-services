package com.myspace.permitting.structuralpermit;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;


public class rescindPermit implements WorkItemHandler {


    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {

        Map<String, Object> results = new HashMap<String, Object>();
        results.put("result", "SUCCESS");
        manager.completeWorkItem(workItem.getId(), results);
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        // TODO Auto-generated method stub
    }
    
    

}

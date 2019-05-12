package com.myspace.permitting.electricpermit;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.myspace.permitting.Applicant;

public class submitPermitRequest implements WorkItemHandler {
	static int currentId = 10001;

    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    	String id = "DENIED";
        Applicant applicant = (Applicant) workItem.getParameter("applicant");
        if (!applicant.getName().equals("DENIED")) {
           id = String.format("REP-%d", currentId++);
        }

        Map<String, Object> results = new HashMap<String, Object>();
        results.put("applicationID", id);
        manager.completeWorkItem(workItem.getId(), results);
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        // TODO Auto-generated method stub
    }
    
    

}

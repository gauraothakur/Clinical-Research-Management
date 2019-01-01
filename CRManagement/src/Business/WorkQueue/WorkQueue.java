/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<SpecimenTransferRequest> specimenTransferRequests;

    public WorkQueue() {
        workRequestList = new ArrayList();
        specimenTransferRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
     public ArrayList<SpecimenTransferRequest> getSpecimentTransferRequestList() {
        return specimenTransferRequests;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.Date;
import Business.Stakeholders.ConsentQueations;

/**
 *
 * @author harish
 */
public class Patients {
    
     private String patientName;
    private String mrn;
    private Date patientDOB;
    private Date pCreatedDate;
    private String viewStatus;
    private String activityStatus;
    private String studyID;
    ConsentQueations consentQueations;
    VisitsDirectory visitsDirectory;

    public Patients() {
        consentQueations = new ConsentQueations();
        visitsDirectory =  new VisitsDirectory();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public Date getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = patientDOB;
    }

    public Date getpCreatedDate() {
        return pCreatedDate;
    }

    public void setpCreatedDate(Date pCreatedDate) {
        this.pCreatedDate = pCreatedDate;
    }

    public String getViewStatus() {
        return viewStatus;
    }

    public void setViewStatus(String viewStatus) {
        this.viewStatus = viewStatus;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }
    
      public String getStudyID() {
        return studyID;
    }

    public void setStudyID(String studyID) {
        this.studyID = studyID;
    }
    
    @Override
    public String toString(){
        return this.patientName;
    }

    public ConsentQueations getConsentQueations() {
        return consentQueations;
    }

    public VisitsDirectory getVisitsDirectory() {
        return visitsDirectory;
    }

    public void setVisitsDirectory(VisitsDirectory visitsDirectory) {
        this.visitsDirectory = visitsDirectory;
    }
    
    

  
    
}

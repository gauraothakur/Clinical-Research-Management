/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.Date;
//import Business.Stakeholders.ConsentQuestionsDirectory;
import Business.Stakeholders.VisitsDirectory;
/**
 *
 * @author harish
 */
public class studies {
    private String studyTitle;
    private String shortTitle;
    private Date startDate;
    private String irbID;
    private String activityStatus;
    private String principleInvestigator;
    private String sponsorship;
    
     String question1;
    String question2;
    String question3;
    String question4;
    String question5;
//    String respose1;
//    String respose2;
//    String response3;
//    String reponse4;
//    String reponse5;
//    ConsentQuestionsDirectory consentQuestionsDirectory;
    VisitsDirectory visitDirectory;
    KitDirectory kitdirectory;

    public studies() {
       // consentQuestionsDirectory = new ConsentQuestionsDirectory();
        visitDirectory = new VisitsDirectory();
        kitdirectory = new KitDirectory();
        
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public void setStudyTitle(String studyTitle) {
        this.studyTitle = studyTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getIrbID() {
        return irbID;
    }

    public void setIrbID(String irbID) {
        this.irbID = irbID;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getPrincipleInvestigator() {
        return principleInvestigator;
    }

    public void setPrincipleInvestigator(String principleInvestigator) {
        this.principleInvestigator = principleInvestigator;
    }

    public String getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(String sponsorship) {
        this.sponsorship = sponsorship;
    }
    
    @Override
    public String toString(){
        return this.studyTitle;
    }
    
//     public ConsentQuestionsDirectory getConsentQuestionsDirectory() {
//        return consentQuestionsDirectory;
//    }
//    
     
      public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public VisitsDirectory getVisitDirectory() {
        return visitDirectory;
    }

    public void setVisitDirectory(VisitsDirectory visitDirectory) {
        this.visitDirectory = visitDirectory;
    }

    public KitDirectory getKitdirectory() {
        return kitdirectory;
    }

    public void setKitdirectory(KitDirectory kitdirectory) {
        this.kitdirectory = kitdirectory;
    }

    
    
    
    
}

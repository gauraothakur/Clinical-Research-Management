/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Enterprise.Enterprise;
//import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.MaterialAdminOrganization;
import Business.Organization.OncologyDepartment;
import Business.Organization.Organization;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import Business.Stakeholders.studiesDirectory;
import Business.Stakeholders.studies;
import userinterface.LabTechnicianRole.LabtechnicianWorkarea;


/**
 *
 * @author harish
 */



public class LabTechnicianRole extends Role{
    
    
    

    private PatientsDirectory patientsDirectory;
    private  SpecimenTypeDirectory specimenTypeDirectory;
    private ClinicalLabEnterprise clinicalLabEnterprise;
    private studiesDirectory studiesDirectory;
        private LabOrganization labOrganization;

    
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        clinicalLabEnterprise =(ClinicalLabEnterprise)enterprise;
//             oncologyDepartment =(OncologyDepartment)organization;
         labOrganization =(LabOrganization)organization;
        
       if(patientsDirectory == null)  
        patientsDirectory = clinicalLabEnterprise.getPatientsDirectory();//new PatientsDirectory();
        
       if(specimenTypeDirectory==null) 
       specimenTypeDirectory = clinicalLabEnterprise.getSpecimenTypeDirectory();
       
        if(studiesDirectory==null) 
       studiesDirectory = clinicalLabEnterprise.getStudiesdirectory();
        
//          if(studiesDirectory==null)
//        studiesDirectory = oncologyDepartment.getStudiesdirectory();
          
        return new LabtechnicianWorkarea(userProcessContainer,enterprise, account,(LabOrganization)organization, business,patientsDirectory,specimenTypeDirectory, studiesDirectory);

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.OncologyDepartment;
import Business.Organization.Organization;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.Stakeholders.studiesDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.SuperAdmin.SuperAdminWorkAreaPanel;

//import userinterface.SuperAdmin.SuperAdminWorkAreaPanel_old;

/**
 *
 * @author harish
 */
public class SuperAdminRole extends Role {
        private studiesDirectory studiesdirectory;
    private PatientsDirectory patientsDirectory;
    private SpecimenTypeDirectory SpecimenTypeDirectory;
    private OncologyDepartment oncologyDepartment;
    private ClinicalLabEnterprise clinicalLabEnterprise;
    private  SpecimenTypeDirectory specimenTypeDirectory;
        private studiesDirectory studirectory;


    int count = 0;

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
          
          
        
        clinicalLabEnterprise =(ClinicalLabEnterprise)enterprise;
        
       if(patientsDirectory == null)  
        patientsDirectory = clinicalLabEnterprise.getPatientsDirectory();//new PatientsDirectory();
        
       if(specimenTypeDirectory==null) 
       specimenTypeDirectory = clinicalLabEnterprise.getSpecimenTypeDirectory();
        
               if(studirectory==null) 
       studirectory = clinicalLabEnterprise.getStudiesdirectory();
        
//        if(count ==0){
//         patientsDirectory = new PatientsDirectory();
//        specimenTypeDirectory = new  SpecimenTypeDirectory();
//        }
//        count++;
        return new SuperAdminWorkAreaPanel(userProcessContainer, enterprise,patientsDirectory,specimenTypeDirectory,studirectory);

    }
    
}

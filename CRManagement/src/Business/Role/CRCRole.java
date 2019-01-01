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
import Business.Organization.OncologyDepartment;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.CRCAdminRole.CRCadminWorkareaPanel;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.SuperAdmin.SuperAdminWorkAreaPanel;
import Business.Stakeholders.studiesDirectory;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
/**
 *
 * @author harish
 */
public class CRCRole extends Role{
    
    private studiesDirectory studiesdirectory;
    private PatientsDirectory patientsDirectory;
    private SpecimenTypeDirectory SpecimenTypeDirectory;
    private OncologyDepartment oncologyDepartment;
    private ClinicalLabEnterprise clinicalLabEnterprise;
    private  SpecimenTypeDirectory specimenTypeDirectory;

     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//         return new SuperAdminWorkAreaPanel(userProcessContainer, enterprise);
         
//                  return new CRCadminWorkareaPanel(userProcessContainer, enterprise);
//        this.patientsDirectory = organization.getPatientsDirectory();
//        this.SpecimenTypeDirectory = organization.getSpecimenTypeDirectory();
        
        
        clinicalLabEnterprise =(ClinicalLabEnterprise)enterprise;
        
       if(patientsDirectory == null)  
        patientsDirectory = clinicalLabEnterprise.getPatientsDirectory();//new PatientsDirectory();
        
       if(specimenTypeDirectory==null) 
       specimenTypeDirectory = clinicalLabEnterprise.getSpecimenTypeDirectory();
        
        
        
        
        oncologyDepartment =(OncologyDepartment)organization;
        
//       if(patientsDirectory == null)  
//        patientsDirectory = clinicalLabEnterprise.getPatientsDirectory();//new PatientsDirectory();
//        
        
        
        
//        
//        if(studiesdirectory==null)
//        studiesdirectory = oncologyDepartment.getStudiesdirectory();
//        
        
           
        if(studiesdirectory==null)
        studiesdirectory = clinicalLabEnterprise.getStudiesdirectory();
        
        
        
        
        
//     return new CRCadminWorkareaPanel(userProcessContainer, account,(OncologyDepartment)organization, enterprise, studiesdirectory,patientsDirectory,specimenTypeDirectory);

     return new CRCadminWorkareaPanel(userProcessContainer, account,(OncologyDepartment)organization, enterprise, studiesdirectory,patientsDirectory,specimenTypeDirectory);

         
    }
    
    
}

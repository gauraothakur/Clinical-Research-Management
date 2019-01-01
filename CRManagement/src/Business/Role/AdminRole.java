/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.SuperAdmin.SuperAdminWorkAreaPanel;
import javax.swing.JPanel;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Stakeholders.studiesDirectory;
/**
 *
 * @author raunak
 */
public class AdminRole extends Role{
  private PatientsDirectory patientsDirectory;
    private  SpecimenTypeDirectory specimenTypeDirectory;
    private ClinicalLabEnterprise clinicalLabEnterprise;
    private studiesDirectory studirectory;
    int count = 0;
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//        
        
        
        clinicalLabEnterprise =(ClinicalLabEnterprise)enterprise;
        
       if(patientsDirectory == null)  
        patientsDirectory = clinicalLabEnterprise.getPatientsDirectory();//new PatientsDirectory();
        
       if(specimenTypeDirectory==null) 
       specimenTypeDirectory = clinicalLabEnterprise.getSpecimenTypeDirectory();
       
       if(studirectory==null) 
       studirectory = clinicalLabEnterprise.getStudiesdirectory();
       
//        count ++;
        
        return new SuperAdminWorkAreaPanel(userProcessContainer, enterprise,patientsDirectory,specimenTypeDirectory, studirectory);

    }

    
    
}

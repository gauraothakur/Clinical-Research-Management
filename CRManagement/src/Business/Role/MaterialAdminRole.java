/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Stakeholders.KitDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MaterialsManager.MaterialsManagementWorkAreaPanel;

/**
 *
 * @author harish
 */
public class MaterialAdminRole extends Role {
       private KitDirectory kitdirectory;
   private ClinicalLabEnterprise clinicalLabEnterprise;
   EcoSystem business;


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
           
        
        this. clinicalLabEnterprise =(ClinicalLabEnterprise)enterprise;
        
//       if(kitdirectory == null)  
//        kitdirectory = clinicalLabEnterprise.getKitDirectory();//new PatientsDirectory();
        
        
        return new MaterialsManagementWorkAreaPanel(userProcessContainer, account, organization, enterprise,business);//,kitdirectory);

    
    
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Enterprise.Enterprise;
//import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.MaterialsManager.MaterialsManagementWorkAreaPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Stakeholders.KitDirectory;
/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{
//   private Enterprise clinicalLabEnterprise;
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

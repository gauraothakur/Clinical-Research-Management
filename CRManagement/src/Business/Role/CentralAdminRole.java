/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MaterialsManager.MaterialsManagementWorkAreaPanel;
import Business.Stakeholders.KitDirectory;
//import Business.Enterprise.MaterialEnterprise;
import userinterface.CentralRepositoryAdminRole.CentralRepoAdminWorkArea;
import Business.Enterprise.CentralRepositoryEnterprise;


/**
 *
 * @author harish
 */
public class CentralAdminRole extends Role {
    EcoSystem busness;
    KitDirectory kitdirectory;
//    private MaterialEnterprise materialEnterprise;
    private CentralRepositoryEnterprise centralRepositoryEnterprise;
    

    
    
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
//    materialEnterprise= (MaterialEnterprise)enterprise;
        centralRepositoryEnterprise= (CentralRepositoryEnterprise)enterprise;

    
//            return new SuperAdminWorkAreaPanel(userProcessContainer, enterprise,patientsDirectory,specimenTypeDirectory);
       
//       if(kitdirectory==null) 
//       kitdirectory = materialEnterprise.getKitDirectory();
               
//       return new MaterialsManagementWorkAreaPanel(userProcessContainer,account, organization,enterprise,business);//,kitdirectory);
       return new CentralRepoAdminWorkArea(userProcessContainer,account, organization,centralRepositoryEnterprise,business);//,kitdirectory);

    
//        public MaterialsManagementWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business,KitDirectory kitdirectory) {

    }
    
}
    


 

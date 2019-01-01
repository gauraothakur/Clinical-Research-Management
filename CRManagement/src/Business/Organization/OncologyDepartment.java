/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.CRCRole;
import Business.Role.LabTechnicianRole;
import Business.Role.Role;
import Business.Stakeholders.studiesDirectory;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class OncologyDepartment extends Organization{
             private studiesDirectory studiesdirectory;

     public OncologyDepartment() {
        super(Type.ClinicalResearch.getValue());
//         if(studiesdirectory==null)
//        studiesdirectory = new studiesDirectory();
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CRCRole());
//        roles.add(new LabTechnicianRole());
        return roles;
    }

//    public studiesDirectory getStudiesdirectory() {
//        return studiesdirectory;
//    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Stakeholders.KitDirectory;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.Stakeholders.studiesDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class ClinicalLabEnterprise extends Enterprise {
    private PatientsDirectory patientsDirectory;
    private SpecimenTypeDirectory specimenTypeDirectory;
    private studiesDirectory studiesdirectory;
    private KitDirectory kitdirectory;
    
    public ClinicalLabEnterprise(String name){
        super(name,EnterpriseType.ClinicalLab);
        if(patientsDirectory==null)
        patientsDirectory=new PatientsDirectory();
        
        if(specimenTypeDirectory == null)
        specimenTypeDirectory= new SpecimenTypeDirectory();
        
         if(studiesdirectory==null)
        studiesdirectory = new studiesDirectory();
         
         if(kitdirectory==null)
             kitdirectory=new KitDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public PatientsDirectory getPatientsDirectory() {
        return patientsDirectory;
    }

    public SpecimenTypeDirectory getSpecimenTypeDirectory() {
        return specimenTypeDirectory;
    }
    
      public studiesDirectory getStudiesdirectory() {
        return studiesdirectory;
    }

    public KitDirectory getKitDirectory() {
        return kitdirectory;
    }
    
      
    
}

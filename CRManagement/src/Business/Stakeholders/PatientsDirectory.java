/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harish
 */
public class PatientsDirectory {
    
     private List<Patients> patientList;
    
    public PatientsDirectory(){
        patientList = new ArrayList<Patients>();
    }

    public List<Patients> getPatientDirectory() {
        return patientList;
    }
    
    public Patients addPatient(){
        Patients p = new Patients();
        patientList.add(p);
        return p;
    }
    
    public void removePatient(Patients p){
        patientList.remove(p);
    }
    
    
}

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
public class SpecimenTypeDirectory {
    
     private List<SpecimenTypes> specimenTypesList;
    
    public SpecimenTypeDirectory(){
        specimenTypesList = new ArrayList<SpecimenTypes>();
    }

    public List<SpecimenTypes> getSpecimenTypeDirectory() {
        return specimenTypesList;
    }
    
    public SpecimenTypes addSpecimenType(){
        SpecimenTypes p = new SpecimenTypes();
        specimenTypesList.add(p);
        return p;
    }
    
    public void removeSpecimenTypes(SpecimenTypes p){
        specimenTypesList.remove(p);
    }
    
    
}

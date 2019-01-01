/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.ArrayList;

/**
 *
 * @author shubh
 */
public class SpecimenDirectory {
    
    
    private ArrayList<Specimen> specimenList;

    
    public SpecimenDirectory() {
        specimenList = new ArrayList<Specimen>();
    }

    public ArrayList<Specimen> getSpecimenList() {
        return specimenList;
    }
    
    public Specimen addspecimen(){
        Specimen s = new Specimen();
        specimenList.add(s);
        return s;
    }
    
    public void removeSpecimen(Specimen s){
        specimenList.remove(s);
    }
    
}

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
public class Visits {
    
     private String label;
//    private String site;
    private String day;
    SpecimenDirectory specimenDirectory; 


    public Visits() {
        specimenDirectory = new SpecimenDirectory();
        
    }

    

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

//    public String getSite() {
//        return site;
//    }
//
//    public void setSite(String site) {
//        this.site = site;
//    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

   
    @Override
    public String toString(){
        return this.label;
    }

    public SpecimenDirectory getSpecimenDirectory() {
        return specimenDirectory;
    }
    
    
    
}

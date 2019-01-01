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
public class VisitsDirectory {
    
     private List<Visits> visitList;
    
    public VisitsDirectory(){
        visitList = new ArrayList<Visits>();
    }

    public List<Visits> getVisitList() {
        return visitList;
    }

        public Visits addVisit(){
        Visits v = new Visits();
        visitList.add(v);
        return v;
    }
    
    public void removeVisit(Visits v){
        visitList.remove(v);
    }
    
}

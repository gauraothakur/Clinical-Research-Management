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
public class studiesDirectory {
    
      private List<studies> studyList;
    
    public studiesDirectory(){
        studyList =  new ArrayList<studies>();
    }

    public List<studies> getStudyList() {
        return studyList;
    }
    
    public studies addStudy(){
        studies s = new studies();
        studyList.add(s);
        return s;
    }
    
    public void removeStudy(studies s){
        studyList.remove(s);
    }
    
}

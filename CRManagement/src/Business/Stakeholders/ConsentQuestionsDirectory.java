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
public class ConsentQuestionsDirectory {
 
 private List<ConsentQueations> ConsentQueationsList;
    
    public ConsentQuestionsDirectory(){
        ConsentQueationsList = new ArrayList<ConsentQueations>();
    }

    public List<ConsentQueations> getConsentQuestionsDirectory() {
        return ConsentQueationsList;
    }
    
    public ConsentQueations addConsentQuestions(){
        ConsentQueations c = new ConsentQueations();
        ConsentQueationsList.add(c);
        return c;
    }
    
    public void removeConsentQueations(ConsentQueations p){
        ConsentQueationsList.remove(p);
    }




    
    
}

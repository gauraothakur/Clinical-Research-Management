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
 * @author Gaurav
 */
public class KitDirectory {
    
    private List<Kit> kitList;
    
    public KitDirectory(){
    
        kitList = new ArrayList<Kit>();
        
    }

    public List<Kit> getKitList() {
        return kitList;
    }

    public Kit addKit(){
        Kit k = new Kit();
        kitList.add(k);
        return k;
    }
    
    public void removeKit(Kit k){
        kitList.remove(k);
    }
   
    
}

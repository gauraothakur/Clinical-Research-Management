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
public class SitesDirectory {
    
     private List<Sites> siteList;
    
    public SitesDirectory(){
        siteList = new ArrayList<Sites>();
    }

    public List<Sites> getSiteList() {
        return siteList;
    }
    
    public Sites addSite(){
        Sites s = new Sites();
        siteList.add(s);
        return s;
    }
    
    public void removeSite(Sites s){
        siteList.remove(s);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.Date;

/**
 *
 * @author harish
 */
public class Sites {
    
      private String siteName;
    private String siteAddress;
    private Date siteCreatedDate;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public Date getSiteCreatedDate() {
        return siteCreatedDate;
    }

    public void setSiteCreatedDate(Date siteCreatedDate) {
        this.siteCreatedDate = siteCreatedDate;
    }
    
    @Override
    public String toString(){
    
        return this.siteName;
    }
    
    
    
}

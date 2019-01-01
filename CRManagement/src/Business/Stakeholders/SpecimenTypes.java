/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author harish
 */
public class SpecimenTypes {
    private String speciMenType;
    private Date createeddate;
    private String Sponsoredrate;
    private String unSposoredRate;

    public String getSpeciMenType() {
        return speciMenType;
    }

    public void setSpeciMenType(String speciMenType) {
        this.speciMenType = speciMenType;
    }

    public Date getCreateeddate() {
        return createeddate;
    }

    public void setCreateeddate(Date createeddate) {
        this.createeddate = createeddate;
    }

    public String getSponsoredrate() {
        return Sponsoredrate;
    }

    public void setSponsoredrate(String Sponsoredrate) {
        this.Sponsoredrate = Sponsoredrate;
    }

    public String getUnSposoredRate() {
        return unSposoredRate;
    }

    public void setUnSposoredRate(String unSposoredRate) {
        this.unSposoredRate = unSposoredRate;
    }
    
    
    @Override
    public String toString(){
        return this.speciMenType;
    }
    
   
    
    
    
    
}

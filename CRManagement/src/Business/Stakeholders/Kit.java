/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.Date;

/**
 *
 * @author Gaurav
 */
public class Kit {
    
    private String kitLabel;
    private String kitBarcode;
    private String kitItems;
    private Date kexpiryDate;
    private String kitLocation;
    private String kitStatus;
    private String quantity;
//    private String Study;

    public String getKitLabel() {
        return kitLabel;
    }

    public void setKitLabel(String kitLabel) {
        this.kitLabel = kitLabel;
    }

    public String getKitBarcode() {
        return kitBarcode;
    }

    public void setKitBarcode(String kitBarcode) {
        this.kitBarcode = kitBarcode;
    }

    public String getKitItems() {
        return kitItems;
    }

    public void setKitItems(String kitItems) {
        this.kitItems = kitItems;
    }

    public Date getKexpiryDate() {
        return kexpiryDate;
    }

    public void setKexpiryDate(Date kexpiryDate) {
        this.kexpiryDate = kexpiryDate;
    }

    public String getKitLocation() {
        return kitLocation;
    }

    public void setKitLocation(String kitLocation) {
        this.kitLocation = kitLocation;
    }

    public String getKitStatus() {
        return kitStatus;
    }

    public void setKitStatus(String kitStatus) {
        this.kitStatus = kitStatus;
    }

//    public String getStudy() {
//        return Study;
//    }
//
//    public void setStudy(String Study) {
//        this.Study = Study;
//    }
//    

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
    
        @Override
    public String toString(){
        return this.kitLabel;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Stakeholders;

import java.util.Date;

/**
 *
 * @author shubh
 */
public class Specimen {
    
   
    private String specimenLabel;
    private String specimenBarcode;
    private String specimen_type ;
    private int quantity;
    private int unit;
    private String collector;
    private String receiver;
    private String collection_container;
    private String collection_status;
    private Date collection_date;
    private Date received_date;
    private String activity_status;
    private String rate;
    private static int count = 1;
    private String storage_location;

    public String getSpecimen_type() {
        return specimen_type;
    }

    public void setSpecimen_type(String specimen_type) {
        this.specimen_type = specimen_type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getCollection_container() {
        return collection_container;
    }

    public void setCollection_container(String collection_container) {
        this.collection_container = collection_container;
    }

    public String getCollection_status() {
        return collection_status;
    }

    public void setCollection_status(String collection_status) {
        this.collection_status = collection_status;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

    public Date getReceived_date() {
        return received_date;
    }

    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }

    public String getActivity_status() {
        return activity_status;
    }

    public void setActivity_status(String activity_status) {
        this.activity_status = activity_status;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Specimen.count = count;
    }

    public String getSpecimenLabel() {
        return specimenLabel;
    }

    public void setSpecimenLabel(String specimenLabel) {
        this.specimenLabel = specimenLabel;
    }

    public String getSpecimenBarcode() {
        return specimenBarcode;
    }

    public void setSpecimenBarcode(String specimenBarcode) {
        this.specimenBarcode = specimenBarcode;
    }

    public String getStorage_location() {
        return storage_location;
    }

    public void setStorage_location(String storage_location) {
        this.storage_location = storage_location;
    }
    
    @Override
    public String toString(){
    
        return this.specimenLabel;
    }
    

}

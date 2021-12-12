/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medication.Prescription;

/**
 *
 * @author Jashwanth
 */
public class WarehouseRequest extends WorkRequest {
    
    private Prescription bulkorder;
    private String manufacturerComment;
    private String manufacturerName;
    private String destination;
    private String salesPersonComment;
    private String driverName;
    private String deliveryOrgName;

    public WarehouseRequest() {
        super();
    }

    public String getDeliveryOrgName() {
        return deliveryOrgName;
    }

    public void setDeliveryOrgName(String deliveryOrgName) {
        this.deliveryOrgName = deliveryOrgName;
    }
    
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSalesPersonComment() {
        return salesPersonComment;
    }

    public void setSalesPersonComment(String salesPersonComment) {
        this.salesPersonComment = salesPersonComment;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Prescription getBulkorder() {
        return bulkorder;
    }

    public void setBulkorder(Prescription bulkorder) {
        this.bulkorder = bulkorder;
    }

    public String getManufacturerComment() {
        return manufacturerComment;
    }

    public void setManufacturerComment(String manufacturerComment) {
        this.manufacturerComment = manufacturerComment;
    }

    public String getDeliveryComment() {
        return deliveryComment;
    }

    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }
    private String deliveryComment;

}

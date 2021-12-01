/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medication.Prescription;

/**
 *
 * @author revanthkatha
 */
public class WarehouseRequest extends WorkRequest {
    
    private Prescription bulkorder;
    private String manufacturerComment;

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

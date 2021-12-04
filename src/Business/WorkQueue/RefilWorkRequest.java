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
public class RefilWorkRequest extends WorkRequest {
    
    private Prescription prescription;
    private String salesPersonComment;
    private String deliveryComment;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getSalesPersonComment() {
        return salesPersonComment;
    }

    public void setSalesPersonComment(String salesPersonComment) {
        this.salesPersonComment = salesPersonComment;
    }

    public String getDeliveryComment() {
        return deliveryComment;
    }

    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }
}

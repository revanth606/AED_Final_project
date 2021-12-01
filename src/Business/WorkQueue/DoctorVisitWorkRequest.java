/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medication.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DoctorVisitWorkRequest extends WorkRequest{
    
    private String testResult;
    private Prescription prescription;
    private String insuranceComment;
    private String storemanageComment;
    private String deliveryComment;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getInsuranceComment() {
        return insuranceComment;
    }

    public void setInsuranceComment(String insuranceComment) {
        this.insuranceComment = insuranceComment;
    }

    public String getStoremanageComment() {
        return storemanageComment;
    }

    public void setStoremanageComment(String storemanageComment) {
        this.storemanageComment = storemanageComment;
    }

    public String getDeliveryComment() {
        return deliveryComment;
    }

    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}

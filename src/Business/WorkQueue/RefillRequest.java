/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Medication.Prescription;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jashwanth
 */
public class RefillRequest extends WorkRequest {
    
    private Prescription prescription;
    private String salesPersonComment;
    private String deliveryComment;
    private String userComment;
    private UserAccount user;
    private UserAccount salesPerson;
    private UserAccount driver;
    private UserAccount agent;
    private Enterprise pharmacy;
    private Enterprise delivery;
    private Enterprise insurance;

    public RefillRequest() {
        super();
        prescription = new Prescription();
    }

    public Enterprise getInsurance() {
        return insurance;
    }

    public void setInsurance(Enterprise insurance) {
        this.insurance = insurance;
    }

    public UserAccount getAgent() {
        return agent;
    }

    public void setAgent(UserAccount agent) {
        this.agent = agent;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public UserAccount getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(UserAccount salesPerson) {
        this.salesPerson = salesPerson;
    }

    public UserAccount getDriver() {
        return driver;
    }

    public void setDriver(UserAccount driver) {
        this.driver = driver;
    }

    public Enterprise getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Enterprise pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Enterprise getDelivery() {
        return delivery;
    }

    public void setDelivery(Enterprise delivery) {
        this.delivery = delivery;
    }

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

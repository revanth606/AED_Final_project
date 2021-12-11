/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Medication.*;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Jashwanth
 */
public class VisitRequest extends WorkRequest{
    
    private String userName;
    private String docUserName;
    private String labUserName;
    private String agentName;
    private String salesPersonName;
    private String deliveryName;
    private String problemComment;
    private String docComment;
    private String labComment;
    private String agentComment;
    private String salesPersonComment;
    private String deliveryComment;
    private String finalComment;
    private String status;
    private Prescription prescription;
    private String hospitalname;
    private UserAccount user;
    private UserAccount doctor;
    private UserAccount labAssistant;
    private UserAccount salesPerson;
    private UserAccount insuranceAgent;
    private UserAccount intraCityDriver;
    private Enterprise hospital;
    
    public VisitRequest() {
        super();
        this.prescription = new Prescription();
    }
    
    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(UserAccount labAssistant) {
        this.labAssistant = labAssistant;
    }

    public UserAccount getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(UserAccount salesPerson) {
        this.salesPerson = salesPerson;
    }

    public UserAccount getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(UserAccount insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    public UserAccount getIntraCityDriver() {
        return intraCityDriver;
    }

    public void setIntraCityDriver(UserAccount intraCityDriver) {
        this.intraCityDriver = intraCityDriver;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
    
    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getDeliveryComment() {
        return deliveryComment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDocUserName() {
        return docUserName;
    }

    public void setDocUserName(String docUserName) {
        this.docUserName = docUserName;
    }

    public String getLabUserName() {
        return labUserName;
    }

    public void setLabUserName(String labUserName) {
        this.labUserName = labUserName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getProblemComment() {
        return problemComment;
    }

    public void setProblemComment(String problemComment) {
        this.problemComment = problemComment;
    }

    public String getDocComment() {
        return docComment;
    }

    public void setDocComment(String docComment) {
        this.docComment = docComment;
    }

    public String getLabComment() {
        return labComment;
    }

    public void setLabComment(String labComment) {
        this.labComment = labComment;
    }

    public String getAgentComment() {
        return agentComment;
    }

    public void setAgentComment(String agentComment) {
        this.agentComment = agentComment;
    }

    public String getSalesPersonComment() {
        return salesPersonComment;
    }

    public void setSalesPersonComment(String salesPersonComment) {
        this.salesPersonComment = salesPersonComment;
    }

    public String getFinalComment() {
        return finalComment;
    }

    public void setFinalComment(String finalComment) {
        this.finalComment = finalComment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public void setDeliveryComment(String deliveryComment) {
        this.deliveryComment = deliveryComment;
    }
    
}

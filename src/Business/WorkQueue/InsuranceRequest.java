/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Medication.Prescription;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jashwanth
 */
public class InsuranceRequest extends WorkRequest {
    
    private String userComment;
    private String testResult;
    private String doctorComment;
    private String insuranceComment;
    private String insuranceStatus;
    private UserAccount user;
    private UserAccount insuranceAgent;
    private UserAccount doctor;
    private UserAccount labAssistant;
    private Enterprise insurance;
    private Enterprise hospital;
    
    
    public InsuranceRequest() {
        super();
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

    public Enterprise getInsurance() {
        return insurance;
    }

    public void setInsurance(Enterprise insurance) {
        this.insurance = insurance;
    }

    public UserAccount getInsuranceAgent() {
        return insuranceAgent;
    }

    public void setInsuranceAgent(UserAccount insuranceAgent) {
        this.insuranceAgent = insuranceAgent;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
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
    
    
    public String getDoctorComment() {
        return doctorComment;
    }

    public void setDoctorComment(String doctorComment) {
        this.doctorComment = doctorComment;
    }

    public String getInsuranceComment() {
        return insuranceComment;
    }

    public void setInsuranceComment(String insuranceComment) {
        this.insuranceComment = insuranceComment;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}

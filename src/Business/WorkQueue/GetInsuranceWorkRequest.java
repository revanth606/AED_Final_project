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
public class GetInsuranceWorkRequest extends WorkRequest {
    
    private String testResult;
    private String doctorComment;
    private String insuranceComment;
    private String insuranceStatus;

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

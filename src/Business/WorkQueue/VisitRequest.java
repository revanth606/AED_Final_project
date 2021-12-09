/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medication.*;
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
    private String hospital;
    
    public VisitRequest() {
        super();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.InsuranceAgent;

import ui.LabAssistantRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class InsuranceAgentWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    /*
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public InsuranceAgentWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageVisit = new javax.swing.JButton();
        btnManageInsurances = new javax.swing.JButton();
        btnManageRefills = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 235, 218));

        btnManageVisit.setText("Manage Visit Requests");
        btnManageVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVisitActionPerformed(evt);
            }
        });

        btnManageInsurances.setText("Manage Insurances");
        btnManageInsurances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInsurancesActionPerformed(evt);
            }
        });

        btnManageRefills.setText("Manage Refill Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageVisit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnManageRefills, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageInsurances, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnManageVisit)
                .addGap(21, 21, 21)
                .addComponent(btnManageInsurances)
                .addGap(21, 21, 21)
                .addComponent(btnManageRefills)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVisitActionPerformed
        InsuranceAgentVisitJPanel insvis = new InsuranceAgentVisitJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("insvis", insvis);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVisitActionPerformed

    private void btnManageInsurancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInsurancesActionPerformed
        InsuranceAgentInsuranceJPanel insins = new InsuranceAgentInsuranceJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("insins", insins);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInsurancesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageInsurances;
    private javax.swing.JButton btnManageRefills;
    private javax.swing.JButton btnManageVisit;
    // End of variables declaration//GEN-END:variables
}
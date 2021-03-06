/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.AdministrativeRole.ManageVisitsJPanel;

/**
 *
 * @author jessi
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    /**
     * Creates new form HospitalAdminJPanel
     */
    public HospitalAdminJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
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

        btnManageWorkRequests = new javax.swing.JButton();
        btnInsurance = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        btnManageWorkRequests.setBackground(new java.awt.Color(0, 153, 153));
        btnManageWorkRequests.setText("Manage Visit Requests");
        btnManageWorkRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestsActionPerformed(evt);
            }
        });
        add(btnManageWorkRequests);
        btnManageWorkRequests.setBounds(150, 142, 187, 29);

        btnInsurance.setBackground(new java.awt.Color(0, 153, 153));
        btnInsurance.setText("Manage Health Checks");
        btnInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsuranceActionPerformed(evt);
            }
        });
        add(btnInsurance);
        btnInsurance.setBounds(150, 203, 187, 29);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 50, 110, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/docgloves.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageWorkRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestsActionPerformed
        ManageVisitsJPanel mr = new ManageVisitsJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("manageVisitsJPanel", mr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageWorkRequestsActionPerformed

    private void btnInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsuranceActionPerformed
        HospitalAdminInsuranceJPanel mr = new HospitalAdminInsuranceJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("manageVisitsJPanel", mr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInsuranceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsurance;
    private javax.swing.JButton btnManageWorkRequests;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

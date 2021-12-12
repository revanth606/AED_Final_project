/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesPerson;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VisitRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.AdministrativeRole.ManageEmployeeJPanel;

/**
 *
 * @author jessi
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<VisitRequest> currvq;
    /**
     * Creates new form SalesWorkAreaJPanel
     */
    public SalesPersonWorkAreaJPanel (JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
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

        btnVisitRequest = new javax.swing.JButton();
        btnRefillRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        btnVisitRequest.setBackground(new java.awt.Color(0, 153, 153));
        btnVisitRequest.setText("Visits Request");
        btnVisitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitRequestActionPerformed(evt);
            }
        });
        add(btnVisitRequest);
        btnVisitRequest.setBounds(227, 104, 133, 29);

        btnRefillRequest.setBackground(new java.awt.Color(0, 153, 153));
        btnRefillRequest.setText("Refill Request");
        btnRefillRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefillRequestActionPerformed(evt);
            }
        });
        add(btnRefillRequest);
        btnRefillRequest.setBounds(227, 166, 130, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/tabs2.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitRequestActionPerformed
        SalesPersonVisitRequestJPanel visitJPanel = new SalesPersonVisitRequestJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("refillJPanel", visitJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVisitRequestActionPerformed

    private void btnRefillRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefillRequestActionPerformed
        SalesPersonRefillRequestJPanel refillJPanel = new SalesPersonRefillRequestJPanel(userProcessContainer, userAccount, organization, enterprise, network, system);
        userProcessContainer.add("refillJPanel", refillJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRefillRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefillRequest;
    private javax.swing.JButton btnVisitRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

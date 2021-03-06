/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.PharmacyEnterprise;
import Business.Medication.Drug;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.UserOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VisitQueue;
import Business.WorkQueue.VisitRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class AdminDeliveryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<VisitRequest> currvq;
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public AdminDeliveryJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        populateTable();
        populateIntraCityDriverComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVisits.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> vq = system.getVisitQueue().getVisitQueue();
        String currdelivery = enterprise.getName();
        currvq = new ArrayList<>();
        for (VisitRequest req : vq) {
            if (req.getDeliveryName()!=null && req.getDeliveryName().equals(currdelivery)) {
                Object[] row = new Object[5];
                row[0] = req.getUserName();
                row[1] = req.getStatus();
                row[2] = req.getDocUserName();
                row[3] = req.getSalesPersonComment();
                row[4] = req.getSalesPersonName();
                model.addRow(row);
                currvq.add(req);
            }
        }
    }
    
    private void populateIntraCityDriverComboBox() {
        jcbDrivers.removeAllItems();
        ArrayList<Organization> orgdir = enterprise.getOrganizationDirectory().getOrganizationList();
        for (Organization org: orgdir) {
            if (org.getName().equals("IntraCityDriver Organization")) {
                for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                    jcbDrivers.addItem(user.getEmployee().getName());
                }
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisits = new javax.swing.JTable();
        jcbDrivers = new javax.swing.JComboBox();
        lblDriver = new javax.swing.JLabel();
        btnAssginDriver = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 228, 246));
        setLayout(null);

        tblVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Status", "Doc", "Lab", "Salesguy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVisits);

        add(jScrollPane1);
        jScrollPane1.setBounds(55, 97, 438, 97);

        jcbDrivers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDriversActionPerformed(evt);
            }
        });
        add(jcbDrivers);
        jcbDrivers.setBounds(235, 223, 130, 27);

        lblDriver.setText("Driver :");
        add(lblDriver);
        lblDriver.setBounds(95, 227, 46, 16);

        btnAssginDriver.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginDriver.setText("Assign");
        btnAssginDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginDriverActionPerformed(evt);
            }
        });
        add(btnAssginDriver);
        btnAssginDriver.setBounds(406, 222, 87, 29);

        btnReject.setBackground(new java.awt.Color(255, 102, 102));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(411, 42, 82, 29);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(55, 42, 97, 29);

        jLabel1.setBackground(new java.awt.Color(197, 228, 246));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/FreightTruck.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setStatus("Rejected by Driver");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssginDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginDriverActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setDeliveryComment(jcbDrivers.getSelectedItem().toString());
        vq.setStatus("Driver assigned");
        populateTable();
    }//GEN-LAST:event_btnAssginDriverActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcbDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDriversActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDriversActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssginDriver;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbDrivers;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JTable tblVisits;
    // End of variables declaration//GEN-END:variables
}

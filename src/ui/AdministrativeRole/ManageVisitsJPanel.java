/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
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
public class ManageVisitsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<VisitRequest> currvq;
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public ManageVisitsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        populateDocComboBox();
        populateLabComboBox();
        populatePharmacyComboBox();
        populateTable();
//        populateLabRequestTable();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jtVisitRequest.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> vq = system.getVisitQueue().getVisitQueue();
        String currhospital = enterprise.getName();
        currvq = new ArrayList<>();
        for (VisitRequest req : vq) {
            if (req.getHospital().equals(currhospital)) {
                if (req.getDocUserName()=="") {
                    req.setStatus("Doctor not assigned");
                }
                Object[] row = new Object[5];
                row[0] = req.getUserName();
                row[1] = req.getStatus();
                row[2] = req.getDocUserName();
                row[3] = req.getLabUserName();
                row[4] = req.getSalesPersonName();
                model.addRow(row);
                currvq.add(req);
            }
        }
    }
    
    private void populateDocComboBox() {
        jcbDoctors.removeAllItems();
        ArrayList<Organization> orgdir = enterprise.getOrganizationDirectory().getOrganizationList();
        for (Organization org: orgdir) {
            if (org.getName().equals("Doctor Organization")) {
                for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                    jcbDoctors.addItem(user.getEmployee().getName());
                }
            }
        }
    }
    
    private void populateLabComboBox() {
        jcbLabAssistants.removeAllItems();
        ArrayList<Organization> orgdir = enterprise.getOrganizationDirectory().getOrganizationList();
        for (Organization org: orgdir) {
            if (org.getName().equals("Lab Organization")) {
                for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                    jcbLabAssistants.addItem(user.getEmployee().getName());
                }
            }
        }
    }
    
    private void populatePharmacyComboBox() {
        jcbPharmacy.removeAllItems();
        ArrayList<Enterprise> enterprises = network.getEnterpriseList(EnterpriseType.Pharmacy);
        for (Enterprise ent: enterprises) {
            jcbPharmacy.addItem(ent.getName());
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
        jtVisitRequest = new javax.swing.JTable();
        jcbDoctors = new javax.swing.JComboBox();
        lblHospital = new javax.swing.JLabel();
        btnAssginDoc = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAssginLab = new javax.swing.JButton();
        lblLabAssistant = new javax.swing.JLabel();
        jcbLabAssistants = new javax.swing.JComboBox();
        lblPharmacy = new javax.swing.JLabel();
        jcbPharmacy = new javax.swing.JComboBox();
        btnAssginPharmacy = new javax.swing.JButton();

        jtVisitRequest.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtVisitRequest);

        jcbDoctors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblHospital.setText("Doctor :");

        btnAssginDoc.setText("Assign");
        btnAssginDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginDocActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssginLab.setText("Assign");
        btnAssginLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginLabActionPerformed(evt);
            }
        });

        lblLabAssistant.setText("Lab Assisant :");

        jcbLabAssistants.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPharmacy.setText("Pharmacy :");

        jcbPharmacy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAssginPharmacy.setText("Assign");
        btnAssginPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginPharmacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jcbDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAssginDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPharmacy)
                                .addGap(72, 72, 72)
                                .addComponent(jcbPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnAssginPharmacy))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHospital)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLabAssistant)
                                    .addGap(52, 52, 52)
                                    .addComponent(jcbLabAssistants, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(btnAssginLab))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReject)
                        .addGap(250, 250, 250))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospital)
                    .addComponent(jcbDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssginDoc))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssginLab)
                    .addComponent(lblLabAssistant)
                    .addComponent(jcbLabAssistants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssginPharmacy)
                    .addComponent(lblPharmacy)
                    .addComponent(jcbPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setStatus("Request rejected by HosAdmin");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssginDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginDocActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setDocUserName(jcbDoctors.getSelectedItem().toString());
        vq.setStatus("Waiting for Doctor");
        populateTable();
    }//GEN-LAST:event_btnAssginDocActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssginLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginLabActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setLabUserName(jcbLabAssistants.getSelectedItem().toString());
        vq.setStatus("Waiting for Lab Results");
        populateTable();
    }//GEN-LAST:event_btnAssginLabActionPerformed

    private void btnAssginPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginPharmacyActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setSalesPersonName(jcbPharmacy.getSelectedItem().toString());
        vq.setStatus("Sent to Pharmacy");
        populateTable();
    }//GEN-LAST:event_btnAssginPharmacyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssginDoc;
    private javax.swing.JButton btnAssginLab;
    private javax.swing.JButton btnAssginPharmacy;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbDoctors;
    private javax.swing.JComboBox jcbLabAssistants;
    private javax.swing.JComboBox jcbPharmacy;
    private javax.swing.JTable jtVisitRequest;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblLabAssistant;
    private javax.swing.JLabel lblPharmacy;
    // End of variables declaration//GEN-END:variables
}

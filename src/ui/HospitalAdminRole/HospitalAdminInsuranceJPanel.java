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
import Business.WorkQueue.InsuranceRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class HospitalAdminInsuranceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<InsuranceRequest> currvq;
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public HospitalAdminInsuranceJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        populateDocComboBox();
        populateLabComboBox();
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jtVisitRequest.getModel();
        model.setRowCount(0);
        ArrayList<InsuranceRequest> iq = system.getInsuranceQueue().getInsuranceQueue();
        currvq = new ArrayList<>();
        for (InsuranceRequest req : iq) {
            if (req.getHospital()!=null && req.getHospital().getName().equals(enterprise.getName())) {
                Object[] row = new Object[2];
                row[0] = req.getRequestId();
                row[1] = req.getStatus();
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
    
//    private void populatePharmacyComboBox() {
//        jcbPharmacy.removeAllItems();
//        ArrayList<Enterprise> enterprises = network.getEnterpriseList(EnterpriseType.Pharmacy);
//        for (Enterprise ent: enterprises) {
//            jcbPharmacy.addItem(ent.getName());
//        }
//    }
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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        jtVisitRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Compliant", "Doc", "Lab", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtVisitRequest);

        add(jScrollPane1);
        jScrollPane1.setBounds(61, 52, 432, 97);

        jcbDoctors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbDoctors);
        jcbDoctors.setBounds(215, 178, 130, 27);

        lblHospital.setText("Doctor :");
        add(lblHospital);
        lblHospital.setBounds(61, 182, 51, 16);

        btnAssginDoc.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginDoc.setText("Assign");
        btnAssginDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginDocActionPerformed(evt);
            }
        });
        add(btnAssginDoc);
        btnAssginDoc.setBounds(397, 177, 87, 29);

        btnReject.setBackground(new java.awt.Color(255, 102, 102));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(403, 11, 82, 29);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(55, 11, 97, 29);

        btnAssginLab.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginLab.setText("Assign");
        btnAssginLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginLabActionPerformed(evt);
            }
        });
        add(btnAssginLab);
        btnAssginLab.setBounds(397, 250, 87, 29);

        lblLabAssistant.setText("Lab Assisant :");
        add(lblLabAssistant);
        lblLabAssistant.setBounds(61, 255, 88, 16);

        jcbLabAssistants.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbLabAssistants);
        jcbLabAssistants.setBounds(215, 251, 130, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/docgloves.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        InsuranceRequest vq = currvq.get(selectedRowIndex);
        vq.setStatus("Request rejected by HosAdmin");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssginDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginDocActionPerformed
        int selectedRowIndex = jtVisitRequest.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        InsuranceRequest vq = currvq.get(selectedRowIndex);
        ArrayList<Organization> reqoOrgs = enterprise.getOrganizationsbyType(Organization.Type.Doctor.getValue());
        for(Organization org:reqoOrgs){
            UserAccount ua = org.getUserAccountDirectory().getUserAccountbyUserName(jcbDoctors.getSelectedItem().toString());
            if(ua!=null){
                vq.setDoctor(ua);
            }
        }
        vq.setStatus("Doctor Assigned");
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
        InsuranceRequest vq = currvq.get(selectedRowIndex);
        ArrayList<Organization> reqoOrgs = enterprise.getOrganizationsbyType(Organization.Type.Lab.getValue());
        for(Organization org:reqoOrgs){
            UserAccount ua = org.getUserAccountDirectory().getUserAccountbyUserName(jcbLabAssistants.getSelectedItem().toString());
            if(ua!=null){
                vq.setLabAssistant(ua);
            }
        }
        vq.setStatus("Lab Assistant Assigned");
        populateTable();
    }//GEN-LAST:event_btnAssginLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssginDoc;
    private javax.swing.JButton btnAssginLab;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbDoctors;
    private javax.swing.JComboBox jcbLabAssistants;
    private javax.swing.JTable jtVisitRequest;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblLabAssistant;
    // End of variables declaration//GEN-END:variables
}
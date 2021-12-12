/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Enterprise.HospitalEnterprise;
import Business.Medication.Drug;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.UserOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VisitRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class UserVisitRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<Enterprise> hospitals = new ArrayList<>();
    private ArrayList<VisitRequest> vqueue = new ArrayList<>();
    private VisitRequest cvr;
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public UserVisitRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        populateComboBox();
        populateTable();
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHospital = new javax.swing.JLabel();
        jcbHospital = new javax.swing.JComboBox();
        CommentJLabel = new javax.swing.JLabel();
        CommentTxt = new javax.swing.JTextField();
        btnBookVisit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        lblHospital.setText("Hospital Name :");
        add(lblHospital);
        lblHospital.setBounds(100, 110, 101, 16);

        jcbHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbHospital);
        jcbHospital.setBounds(250, 110, 160, 27);

        CommentJLabel.setText("Comment :");
        add(CommentJLabel);
        CommentJLabel.setBounds(100, 150, 69, 16);

        CommentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentTxtActionPerformed(evt);
            }
        });
        add(CommentTxt);
        CommentTxt.setBounds(250, 150, 260, 26);

        btnBookVisit.setBackground(new java.awt.Color(0, 153, 255));
        btnBookVisit.setText("Book Visit");
        btnBookVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookVisitActionPerformed(evt);
            }
        });
        add(btnBookVisit);
        btnBookVisit.setBounds(420, 200, 115, 29);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Problem", "Hospital", "Status", "Doctor Comment", "Test Results"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 250, 540, 100);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(90, 40, 97, 29);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Book Doctor Visit");
        add(jLabel2);
        jLabel2.setBounds(210, 40, 180, 20);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(60, 200, 75, 29);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(190, 200, 75, 29);

        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug", "Cost", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPrescription);

        add(jScrollPane2);
        jScrollPane2.setBounds(50, 390, 500, 97);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(300, 200, 84, 29);

        jLabel3.setText("Prescription :");
        add(jLabel3);
        jLabel3.setBounds(70, 360, 130, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/newvisitbg.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel1);
        jLabel1.setBounds(0, -200, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookVisitActionPerformed
        String hospital = jcbHospital.getSelectedItem().toString();
        VisitRequest vr = new VisitRequest();
        vr.setUserName(userAccount.getUsername());
        vr.setProblemComment(CommentTxt.getText());
        vr.setHospitalname(hospital);
        system.getVisitQueue().getVisitQueue().add(vr);
        vr.setUser(userAccount);
        vr.setStatus("Visit requested");
        for (Enterprise hos : hospitals) {
            if (hos.getName().equals(jcbHospital.getSelectedItem().toString())) {
                vr.setHospital(hos);
            }
        }
        populateTable();
    }//GEN-LAST:event_btnBookVisitActionPerformed

    private void CommentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommentTxtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        VisitRequest vr = vqueue.get(selectedRow);
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Visit not selected");
            return;
        }
        populatePrescriptionTable();
        CommentTxt.setText(vr.getProblemComment());
        jcbHospital.setEnabled(false);
        cvr = vr;
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        cvr.setProblemComment(CommentTxt.getText());
        jcbHospital.setEnabled(true);
        populateTable();
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        VisitRequest vr = vqueue.get(selectedRow);
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Visit not selected");
            return;
        }
        if (vr.getStatus().equals("Visit requested")) {
            vqueue.remove(selectedRow);
            JOptionPane.showMessageDialog(this, "Request removed");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid request");
        }
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> vq = system.getVisitQueue().getVisitQueue();
        for (VisitRequest req : vq) {
            if (req.getUserName().equals(userAccount.getUsername())) {
                Object[] row = new Object[4];
                row[0] = req.getRequestId();
                row[1] = req.getProblemComment();
                row[2] = req.getHospitalname();
                row[3] = req.getStatus();
                model.addRow(row);
                vqueue.add(req);
            }
        }
    }

    private void populateComboBox() {
        jcbHospital.removeAllItems();
        ArrayList<Enterprise> hosp = network.getEnterpriseList(EnterpriseType.Hospital);
        for(Enterprise e : hosp){
            jcbHospital.addItem(e.getName());
            hospitals.add(e);
        }
        
    }
    
    private void populatePrescriptionTable() {
        DefaultTableModel model = (DefaultTableModel) tblPrescription.getModel();
        model.setRowCount(0);
        int selectedRow = workRequestJTable.getSelectedRow();
        VisitRequest vr = vqueue.get(selectedRow);
        ArrayList<Drug> drugs = vr.getPrescription().getList();
        for (Drug d : drugs) {
            Object[] row = new Object[3];
            row[0] = d.getDrugName();
            row[1] = d.getQuantity();
            row[2] = d.getCost();
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentJLabel;
    private javax.swing.JTextField CommentTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookVisit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbHospital;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JTable tblPrescription;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        lblHospital.setText("Hospital Name :");
        add(lblHospital);
        lblHospital.setBounds(107, 128, 101, 16);

        jcbHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbHospital);
        jcbHospital.setBounds(260, 124, 332, 27);

        CommentJLabel.setText("Comment :");
        add(CommentJLabel);
        CommentJLabel.setBounds(107, 178, 69, 16);

        CommentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentTxtActionPerformed(evt);
            }
        });
        add(CommentTxt);
        CommentTxt.setBounds(260, 173, 332, 26);

        btnBookVisit.setBackground(new java.awt.Color(0, 153, 255));
        btnBookVisit.setText("Book Visit");
        btnBookVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookVisitActionPerformed(evt);
            }
        });
        add(btnBookVisit);
        btnBookVisit.setBounds(260, 217, 115, 29);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestId", "Status", "UserComment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(75, 15, 346, 97);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(79, 217, 97, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/hospitalbed.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookVisitActionPerformed
        String hospital = jcbHospital.getSelectedItem().toString();
        VisitRequest vr = new VisitRequest();
        vr.setUserName(userAccount.getUsername());
        vr.setProblemComment(CommentTxt.getText());
        vr.setHospitalname(hospital);
        system.getVisitQueue().getVisitQueue().add(vr);
        vr.setUser(userAccount);
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
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> vq = system.getVisitQueue().getVisitQueue();
        for (VisitRequest req : vq) {
            Object[] row = new Object[5];
            row[0] = req.getRequestId();
            row[1] = req.getStatus();
            row[2] = req.getProblemComment();
            row[3] = req.getRequestDate();
            model.addRow(row);
            
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentJLabel;
    private javax.swing.JTextField CommentTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookVisit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbHospital;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

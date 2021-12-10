/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RefillRequest;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class UserRefillRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<Enterprise> pharmacies = new ArrayList<>();
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public UserRefillRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
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
        jcbInsurance = new javax.swing.JComboBox();
        CommentJLabel = new javax.swing.JLabel();
        CommentTxt = new javax.swing.JTextField();
        btnBookVisit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        lblHospital.setText("Insurance  Name :");

        jcbInsurance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CommentJLabel.setText("Comment :");

        CommentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentTxtActionPerformed(evt);
            }
        });

        btnBookVisit.setText("Book Visit");
        btnBookVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookVisitActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestId", "Status", "Comment", "Prescription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospital)
                    .addComponent(CommentJLabel))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbInsurance, 0, 120, Short.MAX_VALUE)
                            .addComponent(CommentTxt))
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBookVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospital)
                    .addComponent(jcbInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommentJLabel)
                    .addComponent(CommentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBookVisit)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookVisitActionPerformed
        String pharmacy = jcbInsurance.getSelectedItem().toString();
        RefillRequest rr = new RefillRequest();
        rr.setUser(userAccount);
        rr.setUserComment(CommentTxt.getText());
        system.getRefillQueue().getRefillQueue().add(rr);
        rr.setUser(userAccount);
        for (Enterprise phs : pharmacies) {
            if (phs.getName().equals(jcbInsurance.getSelectedItem().toString())) {
                rr.setPharmacy(phs);
            }
        }
        populateTable();
    }//GEN-LAST:event_btnBookVisitActionPerformed

    private void CommentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommentTxtActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        ArrayList<RefillRequest> rr = system.getRefillQueue().getRefillQueue();
        for (RefillRequest req : rr) {
            Object[] row = new Object[4];
            row[0] = req.getUser().getEmployee().getName();
            row[1] = req.getStatus();
            row[2] = req.getSalesPerson().getEmployee().getName();
            row[3] = req.getSalesPersonComment();
            model.addRow(row);
        }
    }

    private void populateComboBox() {
        
        jcbInsurance.removeAllItems();
        ArrayList<Enterprise> ins = network.getEnterpriseList(EnterpriseType.Pharmacy);
        for(Enterprise e : ins){
            jcbInsurance.addItem(e.getName());
            pharmacies.add(e);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentJLabel;
    private javax.swing.JTextField CommentTxt;
    private javax.swing.JButton btnBookVisit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbInsurance;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
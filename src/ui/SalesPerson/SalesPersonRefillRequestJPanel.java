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
import Business.WorkQueue.RefillRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jessi
 */
public class SalesPersonRefillRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<RefillRequest> currrq;
    private Enterprise insurance;
    private Enterprise delivery;
    /**
     * Creates new form SalesWorkAreaJPanel
     */
    public SalesPersonRefillRequestJPanel (JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
        populateTable();
        populateDeliveryComboBox();
        populateInsuranceComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVisits.getModel();
        model.setRowCount(0);
        ArrayList<RefillRequest> rq = system.getRefillQueue().getRefillQueue();
        String currsalesperson = userAccount.getEmployee().getName();
        currrq = new ArrayList<>();
        for (RefillRequest req : rq) {
            if (req.getSalesPersonComment()!=null && req.getSalesPersonComment().equals(currsalesperson)) {
                Object[] row = new Object[2];
                row[0] = req.getRequestId();
                row[1] = req.getStatus();
                model.addRow(row);
                currrq.add(req);
            }
        }
    }
    
    private void populateInsuranceComboBox() {
        jcbInsurance.removeAllItems();
        ArrayList<Enterprise> enterprises = network.getEnterpriseList(Enterprise.EnterpriseType.Insurance);
        for (Enterprise ent: enterprises) {
            jcbInsurance.addItem(ent.getName());
        }
    }

    private void populateDeliveryComboBox() {
        jcbDelivery.removeAllItems();
        ArrayList<Enterprise> enterprises = network.getEnterpriseList(Enterprise.EnterpriseType.Delivery);
        for (Enterprise ent: enterprises) {
            jcbDelivery.addItem(ent.getName());
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
        lblInsurance = new javax.swing.JLabel();
        jcbInsurance = new javax.swing.JComboBox();
        btnAssginInsurance = new javax.swing.JButton();
        btnAssginDelivery = new javax.swing.JButton();
        jcbDelivery = new javax.swing.JComboBox();
        lblDelivery = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        tblVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "RequestId", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane1.setBounds(72, 104, 432, 97);

        lblInsurance.setText("Insurance :");
        add(lblInsurance);
        lblInsurance.setBounds(106, 257, 69, 16);

        jcbInsurance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbInsurance);
        jcbInsurance.setBounds(227, 253, 130, 27);

        btnAssginInsurance.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginInsurance.setText("Assign");
        btnAssginInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginInsuranceActionPerformed(evt);
            }
        });
        add(btnAssginInsurance);
        btnAssginInsurance.setBounds(398, 252, 87, 29);

        btnAssginDelivery.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginDelivery.setText("Assign");
        btnAssginDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginDeliveryActionPerformed(evt);
            }
        });
        add(btnAssginDelivery);
        btnAssginDelivery.setBounds(398, 313, 87, 29);

        jcbDelivery.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbDelivery);
        jcbDelivery.setBounds(227, 314, 130, 27);

        lblDelivery.setText("Delivery :");
        add(lblDelivery);
        lblDelivery.setBounds(106, 318, 59, 16);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(66, 27, 97, 29);

        btnReject.setBackground(new java.awt.Color(255, 102, 102));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(422, 27, 82, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/tabs2.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssginInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginInsuranceActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        RefillRequest rr = currrq.get(selectedRowIndex);
        ArrayList<Enterprise> enterprises = network.getEnterpriseList(Enterprise.EnterpriseType.Insurance);
        for (Enterprise ent: enterprises) {
            if(ent.getName().equals(jcbInsurance.getSelectedItem().toString())) {
                rr.setInsurance(ent);
            }
        }
        rr.setStatus("Insurance company selected");
        populateTable();
    }//GEN-LAST:event_btnAssginInsuranceActionPerformed

    private void btnAssginDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginDeliveryActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        RefillRequest rr = currrq.get(selectedRowIndex);
        ArrayList<Enterprise> enterprises = network.getEnterpriseList(Enterprise.EnterpriseType.Delivery);
        for (Enterprise ent: enterprises) {
            if(ent.getName().equals(jcbDelivery.getSelectedItem().toString())) {
                rr.setDelivery(ent);
            }
        }
        rr.setStatus("Delivery company selected");
        populateTable();
    }//GEN-LAST:event_btnAssginDeliveryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        RefillRequest rq = currrq.get(selectedRowIndex);
        rq.setStatus("Request rejected by SalesPerson");
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssginDelivery;
    private javax.swing.JButton btnAssginInsurance;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbDelivery;
    private javax.swing.JComboBox jcbInsurance;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblInsurance;
    private javax.swing.JTable tblVisits;
    // End of variables declaration//GEN-END:variables
}
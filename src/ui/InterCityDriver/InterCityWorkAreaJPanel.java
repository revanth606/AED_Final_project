/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.InterCityDriver;

import ui.IntraCityDriver.*;
import ui.SalesPerson.*;
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

/**
 *
 * @author jessi
 */
public class InterCityWorkAreaJPanel extends javax.swing.JPanel {

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
    public InterCityWorkAreaJPanel (JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVisits.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> vq = system.getVisitQueue().getVisitQueue();
        String currdriver = userAccount.getEmployee().getName();
        currvq = new ArrayList<>();
        for (VisitRequest req : vq) {
            if (req.getDeliveryComment()!=null && req.getDeliveryComment().equals(currdriver)) {
                Object[] row = new Object[5];
                row[0] = req.getRequestId();
                row[1] = req.getStatus();
                row[2] = req.getUserName();
                model.addRow(row);
                currvq.add(req);
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
        btnAssginInsurance = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 228, 246));
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
        jScrollPane1.setBounds(72, 114, 432, 97);

        btnAssginInsurance.setBackground(new java.awt.Color(0, 153, 255));
        btnAssginInsurance.setText("Deliver");
        btnAssginInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssginInsuranceActionPerformed(evt);
            }
        });
        add(btnAssginInsurance);
        btnAssginInsurance.setBounds(410, 240, 88, 29);

        jLabel2.setBackground(new java.awt.Color(197, 228, 246));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/FreightTruck.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssginInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssginInsuranceActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest vq = currvq.get(selectedRowIndex);
        vq.setStatus("Completed");
        populateTable();
    }//GEN-LAST:event_btnAssginInsuranceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssginInsurance;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVisits;
    // End of variables declaration//GEN-END:variables
}

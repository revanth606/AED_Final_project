/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAdmin;

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
 * @author revanthkatha
 */
public class DeliveryAdminVisitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAdminWareHouseJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<VisitRequest> currmq;
//    private Enterprise insurance;
    private Enterprise delivery;
    
    public DeliveryAdminVisitJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisits = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVisits1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 228, 246));
        setLayout(null);

        tblVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestId", "Status", "destination", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVisits);
        if (tblVisits.getColumnModel().getColumnCount() > 0) {
            tblVisits.getColumnModel().getColumn(0).setHeaderValue("Name");
            tblVisits.getColumnModel().getColumn(1).setHeaderValue("Status");
            tblVisits.getColumnModel().getColumn(2).setHeaderValue("destination");
            tblVisits.getColumnModel().getColumn(3).setHeaderValue("Comments");
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(16, 67, 432, 97);

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Available Drivers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(454, 78, 150, 29);

        tblVisits1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "requestIndex", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVisits1);

        add(jScrollPane2);
        jScrollPane2.setBounds(24, 215, 173, 97);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Assign");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(271, 238, 87, 29);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(454, 238, 97, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/FreightTruck.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1900, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        VisitRequest mr = currmq.get(selectedRowIndex);
       
        mr.setStatus("Confirming Order");
        ArrayList<Organization> drivers = enterprise.getOrganizationsbyType(Organization.Type.IntraCityDriver.getValue());
        if(drivers==null){
            mr.setStatus("Rejected");
            JOptionPane.showMessageDialog(this, "No Available drivers at the moment");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVisits1.getModel();
        model.setRowCount(0);
        for(Organization org: drivers){
             Object[] row = new Object[2];
             row[0] = selectedRowIndex;
             row[1] = org.getName();
             model.addRow(row);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRowIndex = tblVisits1.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Driver not selected for assigning");
            return;
        }
        String driver = tblVisits1.getValueAt(selectedRowIndex, 1).toString();
        int requestIndex = (int)tblVisits1.getValueAt(selectedRowIndex, 0);
        VisitRequest mr = currmq.get(selectedRowIndex);
        mr.setStatus("Out for Delivery");
        mr.setDeliveryComment(driver);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVisits;
    private javax.swing.JTable tblVisits1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblVisits.getModel();
        model.setRowCount(0);
        ArrayList<VisitRequest> rq = system.getVisitQueue().getVisitQueue();
        currmq = new ArrayList<>();
        for (VisitRequest req : rq) {
            if (req.getDeliveryName() != null && req.getDeliveryName().equals(enterprise.getName())) {
                Object[] row = new Object[5];
                row[0] = req.getRequestId();
                row[1] = req.getStatus();
                row[2] = req.getSalesPersonComment();
                model.addRow(row);
                currmq.add(req);
            }
        }
    }

    private ArrayList<Organization> getAvaibleDrivers(String destination) {
        ArrayList<Organization> reqoOrgs = null;
        if(network.getName().equals(destination)){
            reqoOrgs = enterprise.getOrganizationsbyType(Organization.Type.IntraCityDriver.getValue());
            }
        else{
            reqoOrgs = enterprise.getOrganizationsbyType(Organization.Type.InterCityDriver.getValue());
             
        }
    return reqoOrgs;
    }
}

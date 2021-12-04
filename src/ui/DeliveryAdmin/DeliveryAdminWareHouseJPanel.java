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
import Business.WorkQueue.RefillRequest;
import Business.WorkQueue.WareHouseQueue;
import Business.WorkQueue.WarehouseRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author revanthkatha
 */
public class DeliveryAdminWareHouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAdminWareHouseJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<WarehouseRequest> currmq;
//    private Enterprise insurance;
    private Enterprise delivery;
    
    public DeliveryAdminWareHouseJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
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

        jButton1.setText("Available Drivers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jButton2.setText("Assign");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton2)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton2)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRowIndex = tblVisits.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        WarehouseRequest mr = currmq.get(selectedRowIndex);
       
        mr.setStatus("Confirming Order");
        ArrayList<Organization> drivers = getAvaibleDrivers(mr.getDestination());
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
        WarehouseRequest mr = currmq.get(selectedRowIndex);
        mr.setStatus("Out for Delivery");
        mr.setDriverName(driver);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVisits;
    private javax.swing.JTable tblVisits1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblVisits.getModel();
        model.setRowCount(0);
        ArrayList<WarehouseRequest> rq = system.getWareHouseQueue().getWareHouseQueue();
        
        String currmanufactu = userAccount.getEmployee().getName();
        currmq = new ArrayList<>();
        for (WarehouseRequest req : rq) {
            if (req.getManufacturerName().equals(currmanufactu)) {
                Object[] row = new Object[5];
                row[0] = req.getRequestId();
                row[1] = req.getStatus();
                row[2] = req.getDestination();
                row[4] = req.getSalesPersonComment();
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

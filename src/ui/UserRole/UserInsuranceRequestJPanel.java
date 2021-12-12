/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.InsuranceEnterprise;
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
public class UserInsuranceRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem system;
    private ArrayList<InsuranceEnterprise> insurances = new ArrayList<>();
    private InsuranceRequest cir;
    /**
     * Creates new form UserVisitDoctorJPanel
     */
    public UserInsuranceRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
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
        jcbInsurance = new javax.swing.JComboBox();
        CommentJLabel = new javax.swing.JLabel();
        CommentTxt = new javax.swing.JTextField();
        btnBookVisit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 235, 218));
        setLayout(null);

        lblHospital.setText("Insurance  Name :");
        add(lblHospital);
        lblHospital.setBounds(90, 80, 113, 16);

        jcbInsurance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcbInsurance);
        jcbInsurance.setBounds(250, 80, 120, 27);

        CommentJLabel.setText("Comment :");
        add(CommentJLabel);
        CommentJLabel.setBounds(90, 120, 69, 16);

        CommentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentTxtActionPerformed(evt);
            }
        });
        add(CommentTxt);
        CommentTxt.setBounds(250, 120, 120, 26);

        btnBookVisit.setBackground(new java.awt.Color(0, 153, 255));
        btnBookVisit.setText("Get Insurance");
        btnBookVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookVisitActionPerformed(evt);
            }
        });
        add(btnBookVisit);
        btnBookVisit.setBounds(330, 190, 120, 29);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestId", "User Comment", "Insurance", "Status"
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

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 260, 390, 97);

        btnBack.setBackground(new java.awt.Color(153, 153, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(70, 20, 97, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/insurance.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(430, 0, 1900, 900);

        jLabel2.setFont(new java.awt.Font("Zapfino", 2, 14)); // NOI18N
        jLabel2.setText("live care free, whoever you are");
        jLabel2.setToolTipText("");
        add(jLabel2);
        jLabel2.setBounds(90, 420, 280, 160);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(70, 190, 75, 29);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(150, 190, 75, 29);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(230, 190, 84, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookVisitActionPerformed
        String hospital = jcbInsurance.getSelectedItem().toString();
        InsuranceRequest ir = new InsuranceRequest();
        ir.setUser(userAccount);
        ir.setUserComment(CommentTxt.getText());
        system.getInsuranceQueue().getInsuranceQueue().add(ir);
        ir.setUser(userAccount);
        ir.setStatus("Insurance requested");
        for (InsuranceEnterprise ins : insurances) {
            if (ins.getName().equals(jcbInsurance.getSelectedItem().toString())) {
                ir.setInsurance(ins);
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
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        ArrayList<InsuranceRequest> iq = system.getInsuranceQueue().getInsuranceQueue();
        cir = iq.get(selectedRow);
        CommentTxt.setText(cir.getUserComment());
        jcbInsurance.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        cir.setUserComment(CommentTxt.getText());
        populateTable();
        jcbInsurance.setEnabled(true);
        btnSave.setEnabled(false);
        populateTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Request not selected");
            return;
        }
        ArrayList<InsuranceRequest> iq = system.getInsuranceQueue().getInsuranceQueue();
        if (iq.get(selectedRow).getStatus().equals("Insurance requested")) {
            iq.remove(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Request");
        }
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        ArrayList<InsuranceRequest> iq = system.getInsuranceQueue().getInsuranceQueue();
        for (InsuranceRequest req : iq) {
            if (req.getUser()!=null && req.getUser().getUsername().equals(userAccount.getUsername())) {
                Object[] row = new Object[4];
                row[0] = req.getRequestId();
                row[1] = req.getUserComment();
                if (req.getInsurance()!= null) {
                    row[2] = req.getInsurance().getName();
                }
                row[3] = req.getStatus();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        
        jcbInsurance.removeAllItems();
        ArrayList<Enterprise> ins = network.getEnterpriseList(EnterpriseType.Insurance);
        for(Enterprise e : ins){
            jcbInsurance.addItem(e.getName());
            insurances.add((InsuranceEnterprise)e);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentJLabel;
    private javax.swing.JTextField CommentTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookVisit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbInsurance;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
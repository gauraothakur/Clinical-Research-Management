/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MaterialsManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.MaterialAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;
//import Business.Enterprise.MaterialEnterprise;
import Business.Stakeholders.Kit;

/**
 *
 * @author harish
 */
public class MMManageKitRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MMManageKitRequestJPanel
     */
JPanel userProcessContainer;
UserAccount account;
Organization organization;
EcoSystem business;
private LabOrganization labOrganization;
private MaterialAdminOrganization materialAdminOrganization;
//MaterialEnterprise materialEnterprise;
Kit kit;
        
//private Organization organization;

    public MMManageKitRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization = organization;
        this.business=business;
//        this.materialEnterprise = (MaterialEnterprise)enterprise;
        this.materialAdminOrganization = (MaterialAdminOrganization)organization;
        
        
        
        
//       this.doctorOrganization = (DoctorOrganization)organization;
       populateTable();   
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)mmworkRequestJTable.getModel();
        
        model.setRowCount(0);
        
//        for(WorkRequest request : materialEnterprise.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            
//            model.addRow(row);
//        }
//        
          for(WorkRequest request : materialAdminOrganization.getWorkQueue().getWorkRequestList()){
              kit = request.getKit();
            Object[] row = new Object[5];
            row[0]=kit;
            row[1] = request;
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
            model.addRow(row);
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

        mmassignJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mmworkRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mmassignJButton.setBackground(new java.awt.Color(18, 51, 105));
        mmassignJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        mmassignJButton.setForeground(new java.awt.Color(255, 255, 255));
        mmassignJButton.setText("Approve");
        mmassignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmassignJButtonActionPerformed(evt);
            }
        });
        add(mmassignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 140, 50));

        mmworkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kit Name", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mmworkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 440, 170));

        jButton1.setBackground(new java.awt.Color(18, 51, 105));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void mmassignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmassignJButtonActionPerformed

        int selectedRow = mmworkRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)mmworkRequestJTable.getValueAt(selectedRow, 1);
        request.setReceiver(account);
         if(request.getStatus().equals("In Transit"))
            request.setStatus("Delievered");
        else if(request.getStatus().equals("Ordered"))
        request.setStatus("In Transit");
//        request.setStatus("In Transit");
        populateTable();

    }//GEN-LAST:event_mmassignJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mmassignJButton;
    private javax.swing.JTable mmworkRequestJTable;
    // End of variables declaration//GEN-END:variables
}

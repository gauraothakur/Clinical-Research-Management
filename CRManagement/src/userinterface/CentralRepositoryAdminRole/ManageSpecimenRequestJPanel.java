/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CentralRepositoryAdminRole;

import Business.EcoSystem;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.SpecimenTransferRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import Business.Enterprise.MaterialEnterprise;
import Business.Stakeholders.Specimen;
import Business.Enterprise.CentralRepositoryEnterprise;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harish
 */
public class ManageSpecimenRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSpecimenRequestJPanel
     */
//    public ManageSpecimenRequestJPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;
    EcoSystem business;
        private UserAccount account;

//    MaterialEnterprise materialEnterprise;
    Specimen specimen;
    CentralRepositoryEnterprise centralRepositoryEnterprise;

    ManageSpecimenRequestJPanel(JPanel userProcessContainer, EcoSystem business, CentralRepositoryEnterprise centralRepositoryEnterprise, UserAccount account) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.business = business;
            this.centralRepositoryEnterprise = centralRepositoryEnterprise;
            this.account = account;
            

      populateTable();   
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)specimenReqTable1.getModel();
        
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
        if(centralRepositoryEnterprise !=null)
          for(SpecimenTransferRequest request : centralRepositoryEnterprise.getWorkQueue().getSpecimentTransferRequestList()){
              specimen = request.getSpecimen();
            Object[] row = new Object[4];
            row[0]= specimen;
            row[1] = request;
            row[2] = request.getStatus();
//            row[2] = request.getSender().getEmployee().getName();
//            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = specimen.getStorage_location();
            
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        specimenReqTable1 = new javax.swing.JTable();
        approveButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(18, 51, 105));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 50));

        specimenReqTable1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        specimenReqTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Specimen", "Request", "Status", "location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(specimenReqTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 480, 240));

        approveButton.setBackground(new java.awt.Color(18, 51, 105));
        approveButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        approveButton.setForeground(new java.awt.Color(255, 255, 255));
        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });
        add(approveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 140, 50));

        rejectButton.setBackground(new java.awt.Color(18, 51, 105));
        rejectButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        rejectButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = specimenReqTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        SpecimenTransferRequest request = (SpecimenTransferRequest)specimenReqTable1.getValueAt(selectedRow, 1);
//        Specimen s = ()
        request.setReceiver(account);
//         if(request.getStatus().equals("In Transit"))
            request.setStatus("Approved");
         
//        else if(request.getStatus().equals("Ordered"))
//        request.setStatus("In Transit");
//        request.setStatus("In Transit");
        populateTable();
    }//GEN-LAST:event_approveButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = specimenReqTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        SpecimenTransferRequest request = (SpecimenTransferRequest)specimenReqTable1.getValueAt(selectedRow, 1);
//        Specimen s = ()
        request.setReceiver(account);
//         if(request.getStatus().equals("In Transit"))
            request.setStatus("Rejected");
         
//        else if(request.getStatus().equals("Ordered"))
//        request.setStatus("In Transit");
//        request.setStatus("In Transit");
        populateTable();
    }//GEN-LAST:event_rejectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectButton;
    private javax.swing.JTable specimenReqTable1;
    // End of variables declaration//GEN-END:variables
}

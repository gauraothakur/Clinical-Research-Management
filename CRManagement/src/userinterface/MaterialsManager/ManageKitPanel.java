/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MaterialsManager;

import Business.Enterprise.Enterprise;
import Business.Organization.MaterialAdminOrganization;
import Business.Stakeholders.Kit;
import Business.Stakeholders.KitDirectory;
import Business.Stakeholders.studies;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Stakeholders.studiesDirectory;
import Business.Enterprise.ClinicalLabEnterprise;

/**
 *
 * @author Gaurav
 */
public class ManageKitPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageKitPanel
     */
    JPanel userProcessContainer;
//    UserAccount account;
//    DoctorOrganization doctorOrganization;
//    Enterprise enterprise;
    ClinicalLabEnterprise clinicalLabEnterprise;
    KitDirectory kitDirectory;
    boolean flag;
    studies study;
    studiesDirectory stuDirectory;

//    public ManageKitPanel(JPanel userProcessContainer, KitDirectory kitDirectory ,Enterprise enterprise) {
        public ManageKitPanel(JPanel userProcessContainer,Enterprise enterprise) {

      initComponents();
      this.userProcessContainer=userProcessContainer;
//      this.kitDirectory = kitDirectory;
      this.clinicalLabEnterprise=(ClinicalLabEnterprise)enterprise;
      
      stuDirectory = clinicalLabEnterprise.getStudiesdirectory();
      flag = false;
      populate();
      jLabel1.setText(enterprise.getName());
    }
    
    public void populate()
    {
        DefaultTableModel dtm=(DefaultTableModel)tblManageKit.getModel();
        dtm.setRowCount(0);
    
        if(stuDirectory.getStudyList() !=null)
        for(studies study : stuDirectory.getStudyList())
        {
            Object[] row;
            row = new Object[dtm.getColumnCount()];
            row[0]=study;
        if(study.getKitdirectory()!=null)    
        for(Kit k:study.getKitdirectory().getKitList())
        {
            
            row[1]=k;
            row[2]=k.getKitBarcode();
            row[3]=k.getKexpiryDate();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageKit = new javax.swing.JTable();
        btnAddKit = new javax.swing.JButton();
        btnViewKit = new javax.swing.JButton();
        btnDeleteKit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("B&W Materials Management Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 430, 28));

        tblManageKit.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        tblManageKit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Study Name", "Kit Label", "Barcode", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageKit);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 163));

        btnAddKit.setBackground(new java.awt.Color(18, 51, 105));
        btnAddKit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnAddKit.setForeground(new java.awt.Color(255, 255, 255));
        btnAddKit.setText("Add Kit ");
        btnAddKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKitActionPerformed(evt);
            }
        });
        add(btnAddKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 50));

        btnViewKit.setBackground(new java.awt.Color(18, 51, 105));
        btnViewKit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnViewKit.setForeground(new java.awt.Color(255, 255, 255));
        btnViewKit.setText("View Kit");
        btnViewKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewKitActionPerformed(evt);
            }
        });
        add(btnViewKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 150, 50));

        btnDeleteKit.setBackground(new java.awt.Color(18, 51, 105));
        btnDeleteKit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnDeleteKit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteKit.setText("Delete Kit");
        btnDeleteKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKitActionPerformed(evt);
            }
        });
        add(btnDeleteKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 150, 50));

        btnBack.setBackground(new java.awt.Color(18, 51, 105));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKitActionPerformed
//        Kit kit = new Kit();
//        AddKitPanel addkitpanel = new AddKitPanel(userProcessContainer, kitDirectory, kit);     
//                AddKitPanel addkitpanel = new AddKitPanel(userProcessContainer, kitDirectory,  enterprise);                  
                AddKitPanel addkitpanel = new AddKitPanel(userProcessContainer,stuDirectory,clinicalLabEnterprise);                  

        userProcessContainer.add("AddKitPanel", addkitpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAddKitActionPerformed

    private void btnViewKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewKitActionPerformed
        
            int selectedRow = tblManageKit.getSelectedRow();
            if(selectedRow>=0){
                
                Kit kit=(Kit) tblManageKit.getValueAt(selectedRow, 1);

                ViewKitPanel viewkitpanel = new ViewKitPanel(userProcessContainer, kitDirectory, kit, flag);                  
                userProcessContainer.add("ViewKitPanel", viewkitpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
             
            else{ 
                JOptionPane.showMessageDialog(null, "Please select a Row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        
        
    }//GEN-LAST:event_btnViewKitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKitActionPerformed
        // TODO add your handling code here:
            int selectedRow = tblManageKit.getSelectedRow();
            if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                 Kit k = (Kit) tblManageKit.getValueAt(selectedRow, 0); //as our Oth column has object
                kitDirectory.removeKit(k);
                populate();
            }
            } else{ 
            JOptionPane.showMessageDialog(null, "Please select a Row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnDeleteKitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddKit;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteKit;
    private javax.swing.JButton btnViewKit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageKit;
    // End of variables declaration//GEN-END:variables
}

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
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gaurav
 */
public class ManageKitRequest extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    KitDirectory kitDirectory;
    private boolean flag;
    
    public ManageKitRequest(JPanel userProcessContainer, KitDirectory kitDirectory) {
      initComponents();
      this.userProcessContainer=userProcessContainer;
      this.kitDirectory = kitDirectory;
      flag = true;
      populate();

    }
    
    public void populate()
    {
        DefaultTableModel dtm=(DefaultTableModel)tblManageKitRequest.getModel();
        dtm.setRowCount(0);
    
        for(Kit k:kitDirectory.getKitList())
        {
            Object[] row;
            row = new Object[dtm.getColumnCount()];
            row[0]=k;
            row[1]=k.getKitItems();
            dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageKitRequest = new javax.swing.JTable();
        btnStatus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("B&W Materials Management Admin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 27));

        tblManageKitRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kit Label", "Kit Items", "Quantity", "Requested By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageKitRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 163));

        btnStatus.setBackground(new java.awt.Color(18, 51, 105));
        btnStatus.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnStatus.setText("Change Status");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 210, 50));

        btnBack.setBackground(new java.awt.Color(18, 51, 105));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
            int selectedRow = tblManageKitRequest.getSelectedRow();
            if(selectedRow>=0){
                
                Kit kit=(Kit) tblManageKitRequest.getValueAt(selectedRow, 0);

                ViewKitPanel viewkitpanel = new ViewKitPanel(userProcessContainer, kitDirectory, kit, flag);                  
                userProcessContainer.add("ViewKitPanel", viewkitpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
             
            else{ 
                JOptionPane.showMessageDialog(null, "Please select a Row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        

    }//GEN-LAST:event_btnStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageKitRequest;
    // End of variables declaration//GEN-END:variables
}

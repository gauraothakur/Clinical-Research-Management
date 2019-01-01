/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MaterialsManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MaterialAdminOrganization;
import Business.Organization.Organization;
import Business.Stakeholders.KitDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.LabTechnicianRole.LabtechnicianAddspecimen;
import userinterface.MaterialsManager.ManageKitPanel;
import userinterface.MaterialsManager.ManageKitRequest;

/**
 *
 * @author Gaurav
 */
public class MaterialsManagementWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaterialsManagementWorkAreaPanel
     */
//    public MaterialsManagementWorkAreaPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;
    UserAccount account;
    MaterialAdminOrganization materialAdminOrganization;
    Enterprise enterprise;
    KitDirectory kitdirectory;
    Organization organization;
    EcoSystem business;


    public MaterialsManagementWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business){
//,KitDirectory kitdirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      initComponents();
      this.userProcessContainer=userProcessContainer;
      this.account=account;
//      this.doctorOrganization=doctorOrganization;
      this.enterprise=enterprise;
//      this.kitdirectory=kitdirectory;
      this.organization = organization;
      this.business = business;
//      kitDirectory = new KitDirectory();

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
        btnManageKit = new javax.swing.JButton();
        btnManageKitRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("B&W Materials Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 340, 40));

        btnManageKit.setBackground(new java.awt.Color(18, 51, 105));
        btnManageKit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnManageKit.setForeground(new java.awt.Color(255, 255, 255));
        btnManageKit.setText("Manage Kit");
        btnManageKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageKitActionPerformed(evt);
            }
        });
        add(btnManageKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 290, 50));

        btnManageKitRequest.setBackground(new java.awt.Color(18, 51, 105));
        btnManageKitRequest.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnManageKitRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnManageKitRequest.setText("Manage Kit Request");
        btnManageKitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageKitRequestActionPerformed(evt);
            }
        });
        add(btnManageKitRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageKitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageKitRequestActionPerformed
        
        
//        MMManageKitRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business)
        
//        ManageKitRequest managekitrequest = new ManageKitRequest(userProcessContainer, kitdirectory);                  
//        userProcessContainer.add("ManageKitRequest", managekitrequest);
        
                MMManageKitRequestJPanel mmManageKitRequestJPanel = new MMManageKitRequestJPanel(userProcessContainer, account,organization,business,enterprise);                  
        userProcessContainer.add("MMManageKitRequestJPanel", mmManageKitRequestJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageKitRequestActionPerformed

    private void btnManageKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageKitActionPerformed
        
//        ManageKitPanel managekitpanel = new ManageKitPanel(userProcessContainer, kitdirectory,enterprise);   
                ManageKitPanel managekitpanel = new ManageKitPanel(userProcessContainer,enterprise);                  

        userProcessContainer.add("ManageKitPanel", managekitpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageKitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageKit;
    private javax.swing.JButton btnManageKitRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

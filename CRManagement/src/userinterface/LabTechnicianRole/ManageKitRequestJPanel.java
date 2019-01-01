/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnicianRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.EcoSystem;
import Business.Stakeholders.Patients;
import Business.Stakeholders.studies;
import Business.Enterprise.ClinicalLabEnterprise;
import Business.Organization.LabOrganization;
import Business.Organization.MaterialAdminOrganization;
import Business.Organization.Organization;
import Business.Stakeholders.studiesDirectory;
import Business.Stakeholders.Kit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import userinterface.CRCAdminRole.CRCAdminUpdateConsentPanel;

/**
 *
 * @author harish
 */



public class ManageKitRequestJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
UserAccount account;
ClinicalLabEnterprise enterprise;
EcoSystem business;
studiesDirectory  studDirectory;
studies study;
Kit kit;
// UserAccount account;
    
    /**
     * Creates new form ManageKitRequestJPanel
     */
//    public ManageKitRequestJPanel() {
//        initComponents();
//    }

    ManageKitRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account=account;
            this.enterprise =(ClinicalLabEnterprise)enterprise;
            this.business = business;
            studDirectory=this.enterprise.getStudiesdirectory();
            


       studyComboBox1.removeAllItems();
       for(studies s : this.studDirectory.getStudyList()) {
           System.out.println("Studies Loop ===>  "+s.getIrbID());
           studyComboBox1.addItem(s);
       }
   
        
    
   
//     refreshTable();  
//       if(studyComboBox1.getSelectedItem()!=null)   
//       {
////           refreshTable();
////       populateRequestTable();
//       }

    }
      public void refreshTable() {
        int rowCount = KitJTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)KitJTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//        if(((((Airplane)jComboBox1.getSelectedItem())!=null) ) && (((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory()!=null) && ((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory().getFlightDirectory()!=null){
       
                    studies study = (studies)studyComboBox1.getSelectedItem();

        if((studies)studyComboBox1.getSelectedItem()!=null)
        for(Kit k : study.getKitdirectory().getKitList()) {
//            studies study = (studies)studyComboBox.getSelectedItem();
            
//            if(a.getStudyID().equals(study.getIrbID())){
             Object row[] = new Object[2];
             row[0] = k;
             row[1] =k.getKitItems();
             
//             if(a.getConsentQueations()!= null){
//                  row[2] = a.getConsentQueations().getcCreatedDate();
//                  row[3] =a.getConsentQueations().getConsentStatus();
//                 
//             }
            
             model.addRow(row);
//            }
          
        }
    }
     public void populateRequestTable(){
//          Kit kit
          int rowCount = kitRequestJTable1.getRowCount();
        DefaultTableModel model1 = (DefaultTableModel)kitRequestJTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model1.removeRow(i);
        }
//        DefaultTableModel model = (DefaultTableModel) kitRequestJTable1.getModel();
//      studies study = (studies)studyComboBox1.getSelectedItem();
//       Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);
//        int selectedRow = KitJTable.getSelectedRow();
////       if(selectedRow!=null)
//       kit = (Kit)KitJTable.getValueAt(selectedRow, 0);


        model1.setRowCount(0);
//        if((studies)studyComboBox1.getSelectedItem()!=null)
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getKit();
            row[1] = request.getMessage();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[4] = result == null ? "Waiting" : result;
            
            model1.addRow(row);
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

        requestTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KitJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        kitRequestJTable1 = new javax.swing.JTable();
        studyComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(18, 51, 105));
        requestTestJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Kit");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 180, 50));

        KitJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kit Label", "kitItems"
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
        jScrollPane1.setViewportView(KitJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 171));

        jButton1.setBackground(new java.awt.Color(18, 51, 105));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 598, 130, 50));

        kitRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kit", "Message", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(kitRequestJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 171));

        studyComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studyComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyComboBox1ActionPerformed(evt);
            }
        });
        add(studyComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = KitJTable.getSelectedRow();
        if(selectedRow >= 0)
        {
         Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);

//         String message = messageJTextField.getText();
        
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setKit(kit);
        request.setMessage("Need Urgently");
        request.setSender(account);
        request.setStatus("Ordered");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof MaterialAdminOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
//        int selectedRow = KitJTable.getSelectedRow();
//        if(selectedRow>=0){
//            
//       Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);
//        DefaultTableModel model = (DefaultTableModel) kitRequestJTable1.getModel();
////      studies study = (studies)studyComboBox1.getSelectedItem();
////       Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);
////        int selectedRow = KitJTable.getSelectedRow();
////       Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);
//
//
//        model.setRowCount(0);
//        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[5];
//             row[0]=kit;
//            row[1] = request.getMessage();
//            row[2] = request.getReceiver();
//            row[2] = request.getStatus();
//            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[4] = result == null ? "Waiting" : result;
//            
//            model.addRow(row);
////                Patients patient = (Patients)mptbl.getValueAt(selectedRow, 1);
//                //ViewFlightPanel viewflightPanel = new ViewFlightPanel(TAProcessContainer, flight);
////                  CRCAdminUpdateConsentPanel cRCAdminUpdateConsentPanel = new CRCAdminUpdateConsentPanel(userProcessContainer, organization,study,patient);
//
////                  
////                   userProcessContainer.add("CRCAdminUpdateConsentPanel", cRCAdminUpdateConsentPanel);
////        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
////        layout.next(userProcessContainer);
////                
////               // TAProcessContainer.add("viewflightPanel", viewflightPanel);
////        CardLayout layout = (CardLayout)TAProcessContainer.getLayout();
////        layout.next(TAProcessContainer);
//                
//            
//        }
//        }else{
//            //JOptionPane.showMessageDialog(null, "Please select a Row!!");
//               JLabel label = new JLabel("Please select a Row!");
//        label.setFont(new Font("Arial", Font.PLAIN, 18));
//        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);
//        }
//          
////        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
////        userProcessContainer.add("RequestKitJPanel", new RequestKitJPanel(userProcessContainer, account, enterprise, business));
////        layout.next(userProcessContainer);
//        
//        
////        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
////        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
////        layout.next(userProcessContainer);

         populateRequestTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a row!");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studyComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyComboBox1ActionPerformed
        // TODO add your handling code here:
        refreshTable();
        populateRequestTable();
    }//GEN-LAST:event_studyComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KitJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable kitRequestJTable1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox studyComboBox1;
    // End of variables declaration//GEN-END:variables
}

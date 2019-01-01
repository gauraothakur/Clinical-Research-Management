/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnicianRole;

import Business.EcoSystem;
import Business.Enterprise.CentralRepositoryEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Stakeholders.Patients;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.Stakeholders.studiesDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Stakeholders.Specimen;
import Business.Stakeholders.Visits;
import Business.Stakeholders.VisitsDirectory;
import Business.WorkQueue.LabTestWorkRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.SpecimenTransferRequest;
import Business.Enterprise.Enterprise.EnterpriseType;
import javax.swing.JOptionPane;

/**
 *
 * @author harish
 */
public class ShipSpecimenJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
     PatientsDirectory patientsDirectory;
     VisitsDirectory visitsDirectory;
     Visits  visit;
     UserAccount userAccount;
     EcoSystem business;
     EnterpriseType enterpriseType;
     
    
    /**
     * Creates new form ShipSpecimenJPanel
     */
//    public ShipSpecimenJPanel() {
//        initComponents();
//    }

    ShipSpecimenJPanel(JPanel userProcessContainer,UserAccount userAccount, LabOrganization labOrganization, studiesDirectory studiesdirectory, PatientsDirectory patientsDirectory, SpecimenTypeDirectory specimenTypeDirectory,EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           initComponents();
           this.userProcessContainer = userProcessContainer;
           this.patientsDirectory = patientsDirectory;
           this.userAccount = userAccount;
           this.business = business;
           

    refreshTable();
    
             populateRequestTable();

     
    }
    
    
     public void refreshTable() {
                      int selectedRow = specimenTable1.getSelectedRow();

        int rowCount = specimenTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)specimenTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//        if(((((Airplane)jComboBox1.getSelectedItem())!=null) ) && (((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory()!=null) && ((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory().getFlightDirectory()!=null){
       
//         studies study = (studies)sscombo.getSelectedItem();
//        if((studies)sscombo.getSelectedItem()!=null)
        for(Patients p: patientsDirectory.getPatientDirectory()) {
            
            for(Visits v:p.getVisitsDirectory().getVisitList()){
                
                for(Specimen s: v.getSpecimenDirectory().getSpecimenList()){
                    
                     Object row[] = new Object[4];
             row[0] = s;
             row[1] = s.getSpecimen_type();
             row[2]=s.getStorage_location();
             row[3]=s.getQuantity();
             
//             if(p.getConsentQueations()!= null){
////                  row[2] = p.getConsentQueations().getcCreatedDate();
//                  
//                  row[2]= p.getViewStatus();
//                 row[3] =p.getConsentQueations().getConsentStatus();
//             }
            
             model.addRow(row);
                    
                    
                }
                
            }
            
            
           
            
//            if(p.getStudyID().equals(study.getIrbID())){
//             if(p.getStudyID().equals(study.getIrbID())){
//             Object row[] = new Object[4];
//             row[0] = study;
//             row[1] = p;
//             
//             if(p.getConsentQueations()!= null){
////                  row[2] = p.getConsentQueations().getcCreatedDate();
//                  
//                  row[2]= p.getViewStatus();
//                 row[3] =p.getConsentQueations().getConsentStatus();
//             }
//            
//             model.addRow(row);
//            }
          
        }
//        if(selectedRow > 0)
//        populateRequestTable();
    }
     
     
       public void populateRequestTable(){
//          Kit kit
             int selectedRow = specimenTable1.getSelectedRow();
          int rowCount = ShipTable1.getRowCount();
        DefaultTableModel model1 = (DefaultTableModel)ShipTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model1.removeRow(i);
        }
//        if(selectedRow <0){
//          return;  
//        }
//        DefaultTableModel model = (DefaultTableModel) kitRequestJTable1.getModel();
//      studies study = (studies)studyComboBox1.getSelectedItem();
//       Kit kit = (Kit)KitJTable.getValueAt(selectedRow, 0);
//        int selectedRow = KitJTable.getSelectedRow();
////       if(selectedRow!=null)
//       kit = (Kit)KitJTable.getValueAt(selectedRow, 0);


        model1.setRowCount(0);
//        if((studies)studyComboBox1.getSelectedItem()!=null)
    
      System.out.println("Hereeeeeeeeeee       11111111111");
        for (SpecimenTransferRequest request : userAccount.getWorkQueue().getSpecimentTransferRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getReceiver();
//            row[2] = request.getReceiver();
            row[2] = request.getStatus();
//            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[4] = result == null ? "Waiting" : result;
            
            model1.addRow(row);
                  System.out.println("Hereeeeeeeeeee       222222222222");

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
        specimenTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        shipButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShipTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        specimenTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Specimen Label", "Specimen Type", "Location", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(specimenTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 170));

        jButton1.setBackground(new java.awt.Color(18, 51, 105));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 90, 30));

        shipButton.setBackground(new java.awt.Color(18, 51, 105));
        shipButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shipButton.setText("Ship");
        shipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipButtonActionPerformed(evt);
            }
        });
        add(shipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 90, 30));

        ShipTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Specimen Label", "Receiver", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ShipTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void shipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = specimenTable1.getSelectedRow();
         if(selectedRow >=0){
         Specimen specimen = (Specimen)specimenTable1.getValueAt(selectedRow, 0);
        
          SpecimenTransferRequest request = new SpecimenTransferRequest();
        request.setSpecimen(specimen);
        request.setMessage("Need Space");
        request.setSender(userAccount);
        request.setStatus("Pending");
        
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof DoctorOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkQueue().getWorkRequestList().add(request);
//            account.getWorkQueue().getWorkRequestList().add(request);
//        }
    System.out.println("Insode ShipButton Request  Specimen Seected===> "+request.getSpecimen());

                        Enterprise ent = null;
//
         for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(enterprise.getEnterpriseType().equals("Central Repository
              System.out.println("Insode ShipButton Request ===> "+11111111);

//                if(enterprise instanceof CentralRepositoryEnterprise){
                if(enterprise.getEnterpriseType()== enterpriseType.CentralRepository ){

                    ent = enterprise;
                    
//                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    Object[] row = new Object[3];
//                    row[0] = enterprise.getName();
//                    row[1] = network.getName();
//                    row[2] = userAccount.getUsername();
                                  System.out.println("Insode ShipButton Request ===> "+222222222);

                    System.out.println("Insode ShipButton Request ===> "+ent.getName());
                     break;
//                    model.addRow(row);
                }
            }
        }
         if (ent!=null){
              System.out.println("Insode ShipButton Request ===> "+333333333);

//            ent.getWorkQueue().getWorkRequestList().add(request);
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
             ent.getWorkQueue().getSpecimentTransferRequestList().add(request);
             userAccount.getWorkQueue().getSpecimentTransferRequestList().add(request);
        }
        
        
         populateRequestTable();
         }
         else{
             JOptionPane.showMessageDialog(null, "Select a row!");
         }
        
    }//GEN-LAST:event_shipButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShipTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton shipButton;
    private javax.swing.JTable specimenTable1;
    // End of variables declaration//GEN-END:variables
}

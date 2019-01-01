/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnicianRole;

import Business.Organization.LabOrganization;
import Business.Stakeholders.Patients;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.Specimen;
import Business.Stakeholders.SpecimenTypeDirectory;
import Business.Stakeholders.Visits;
import Business.Stakeholders.studies;
import Business.Stakeholders.studiesDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CRCAdminRole.CRCAdminUpdateConsentPanel;

/**
 *
 * @author shubh
 */
public class LabtechnicianCollectspecimen extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    LabOrganization labOrganization;
    studiesDirectory studiesdirectory;
    PatientsDirectory patientsDirectory;
    SpecimenTypeDirectory specimenTypeDirectory;
    studies study;        

    /**
     * Creates new form labtechnician_workarea_collectspecimen
     */
//    public LabtechnicianCollectspecimen() {
//        initComponents();
//    }

    LabtechnicianCollectspecimen(JPanel userProcessContainer, LabOrganization labOrganization, studiesDirectory studiesdirectory, PatientsDirectory patientsDirectory, SpecimenTypeDirectory specimenTypeDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     initComponents();
     this.userProcessContainer = userProcessContainer;
     this.labOrganization = labOrganization;
     this.studiesdirectory = studiesdirectory;
     this.patientsDirectory = patientsDirectory;
     this.specimenTypeDirectory = specimenTypeDirectory;
     
     
     
     sscombo.removeAllItems();
       for(studies s : this.studiesdirectory.getStudyList()) {
//           System.out.println("Studies Loop ===>  "+s.getIrbID());
           sscombo.addItem(s);
       }
   
        
//     spcombo.removeAllItems();
//       for(Patients p : this.patientsDirectory.getPatientDirectory()) {
////         System.out.println("Patients Loop ===>  "+p.getStudyID());
//
//           spcombo.addItem(p);
//       }
//   
      if(sscombo.getSelectedItem()!=null) 
       refreshTable();
     
    }
    
    
     public void refreshTable() {
        int rowCount = studyPatientTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)studyPatientTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//        if(((((Airplane)jComboBox1.getSelectedItem())!=null) ) && (((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory()!=null) && ((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory().getFlightDirectory()!=null){
       
         studies study = (studies)sscombo.getSelectedItem();
        if((studies)sscombo.getSelectedItem()!=null)
        for(Patients p : patientsDirectory.getPatientDirectory()) {
           
            
//            if(p.getStudyID().equals(study.getIrbID())){
             if(p.getStudyID().equals(study.getIrbID())){
             Object row[] = new Object[4];
             row[0] = study;
             row[1] = p;
             
             if(p.getConsentQueations()!= null){
//                  row[2] = p.getConsentQueations().getcCreatedDate();
                  
                  row[2]= p.getViewStatus();
                 row[3] =p.getConsentQueations().getConsentStatus();
             }
            
             model.addRow(row);
            }
          
        }
    }
     
       public void refreshVisitsTable(studies study, Patients patient) {
        int rowCount = specimentbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)specimentbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//        if(((((Airplane)jComboBox1.getSelectedItem())!=null) ) && (((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory()!=null) && ((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory().getFlightDirectory()!=null){
//       if((Visits)sscombo.getSelectedItem()!=null)
        for(Visits v : patient.getVisitsDirectory().getVisitList()) {
//            studies study = (studies)sscombo.getSelectedItem();
            
//            if(p.getStudyID().equals(study.getIrbID())){
             Object row[] = new Object[5];
             row[0] = v;
             row[1] = v.getDay();
             
             if(v.getSpecimenDirectory()!= null){
                 for(Specimen s : v.getSpecimenDirectory().getSpecimenList()){
                     row[2]= s.getCollection_status();
                  row[3] = s.getCollection_date();
                  row[4]=s.getReceived_date();
                 }
//                  row[2] = p.getConsentQueations().getcCreatedDate();
                  
                  
             }
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sscombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        specimentbl = new javax.swing.JTable();
        addspecimenbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studyPatientTable = new javax.swing.JTable();
        viewVisitsjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("B & W Oncology Lab Technician");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Select Study:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        sscombo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        sscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sscomboActionPerformed(evt);
            }
        });
        add(sscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        specimentbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        specimentbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visit Name", "Visit Day", "Specimen Status", "Collection Date", "Received Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(specimentbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 523, 206));

        addspecimenbtn.setBackground(new java.awt.Color(18, 51, 105));
        addspecimenbtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        addspecimenbtn.setForeground(new java.awt.Color(255, 255, 255));
        addspecimenbtn.setText("Add Specimen");
        addspecimenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addspecimenbtnActionPerformed(evt);
            }
        });
        add(addspecimenbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, 50));

        jButton1.setBackground(new java.awt.Color(18, 51, 105));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 50));

        studyPatientTable.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        studyPatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Study Name", "Patient Name", "Vital Status", "Consent Status"
            }
        ));
        jScrollPane2.setViewportView(studyPatientTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 520, 190));

        viewVisitsjButton.setBackground(new java.awt.Color(18, 51, 105));
        viewVisitsjButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        viewVisitsjButton.setForeground(new java.awt.Color(255, 255, 255));
        viewVisitsjButton.setText("View Visits");
        viewVisitsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVisitsjButtonActionPerformed(evt);
            }
        });
        add(viewVisitsjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addspecimenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addspecimenbtnActionPerformed
        // TODO add your handling code here:
        
//        refreshTable();
                try{
                int selectedRow = specimentbl.getSelectedRow();
                int selctedRowPatientStudy= studyPatientTable.getSelectedRow();
//                int slectedRowSpecimen = 
                 studies study = (studies)sscombo.getSelectedItem();
                System.out.println("studies"+study);

                Patients patient = (Patients)studyPatientTable.getValueAt(selctedRowPatientStudy, 1);
                System.out.println("Patients"+patient);
        if(selectedRow>=0){
            
                Visits visit = (Visits)specimentbl.getValueAt(selectedRow, 0);
                System.out.println("visit"+visit);
               

//                refreshVisitsTable(study, patient);
                //ViewFlightPanel viewflightPanel = new ViewFlightPanel(TAProcessContainer, flight);
                  LabtechnicianAddspecimen labtechnicianAddspecimen = new LabtechnicianAddspecimen(userProcessContainer, visit,specimenTypeDirectory, study, patient);

                  
                   userProcessContainer.add("LabtechnicianAddspecimen", labtechnicianAddspecimen);
                   CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
////                
//               // TAProcessContainer.add("viewflightPanel", viewflightPanel);
//        CardLayout layout = (CardLayout)TAProcessContainer.getLayout();
//        layout.next(TAProcessContainer);
                
            
        }else{
            //JOptionPane.showMessageDialog(null, "Please select a Row!!");
               JLabel label = new JLabel("Please select a Row!");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);
        }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please select visits from table");
                }
    }//GEN-LAST:event_addspecimenbtnActionPerformed

    private void sscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sscomboActionPerformed
        // TODO add your handling code here:
              if(sscombo.getSelectedItem()!=null) 
        refreshTable();
        
    }//GEN-LAST:event_sscomboActionPerformed

    private void viewVisitsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVisitsjButtonActionPerformed
        // TODO add your handling code here:
        
         
          int selectedRow = studyPatientTable.getSelectedRow();
        if(selectedRow>=0){
            
                studies study = (studies)studyPatientTable.getValueAt(selectedRow, 0);
                Patients patient = (Patients)studyPatientTable.getValueAt(selectedRow, 1);
                refreshVisitsTable(study, patient);
                //ViewFlightPanel viewflightPanel = new ViewFlightPanel(TAProcessContainer, flight);
//                  CRCAdminUpdateConsentPanel cRCAdminUpdateConsentPanel = new CRCAdminUpdateConsentPanel(userProcessContainer, organization,study,patient);

                  
//                   userProcessContainer.add("CRCAdminUpdateConsentPanel", cRCAdminUpdateConsentPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
////                
//               // TAProcessContainer.add("viewflightPanel", viewflightPanel);
//        CardLayout layout = (CardLayout)TAProcessContainer.getLayout();
//        layout.next(TAProcessContainer);
                
            
        }else{
            //JOptionPane.showMessageDialog(null, "Please select a Row!!");
               JLabel label = new JLabel("Please select a Row!");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);
        }
         
        
        
        
        
        
        
    }//GEN-LAST:event_viewVisitsjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addspecimenbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable specimentbl;
    private javax.swing.JComboBox sscombo;
    private javax.swing.JTable studyPatientTable;
    private javax.swing.JButton viewVisitsjButton;
    // End of variables declaration//GEN-END:variables
}

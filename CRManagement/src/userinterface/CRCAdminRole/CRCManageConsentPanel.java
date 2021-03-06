/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CRCAdminRole;

import Business.Organization.OncologyDepartment;
import Business.Stakeholders.Patients;
import Business.Stakeholders.PatientsDirectory;
import Business.Stakeholders.studies;
import Business.Stakeholders.studiesDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class CRCManageConsentPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    OncologyDepartment organization;
    
    
//    JPanel userProcessContainer;
//    OncologyDepartment organization; 
    studiesDirectory stDirectory;
    PatientsDirectory patientsDirectory;
    CRCManageConsentPanel(JPanel userProcessContainer, OncologyDepartment organization, studiesDirectory stDirectory,PatientsDirectory patientsDirectory) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   initComponents();;
   this.userProcessContainer = userProcessContainer;
   this.organization = organization;
   this.stDirectory = stDirectory;
   this.patientsDirectory=patientsDirectory;
   
    
     studyComboBox.removeAllItems();
       for(studies s : this.stDirectory.getStudyList()) {
           System.out.println("Studies Loop ===>  "+s.getIrbID());
           studyComboBox.addItem(s);
       }
   
        
    
   
     refreshTable(); 
     jLabel1.setText(organization.getName());
    }
      public void refreshTable() {
        int rowCount = mptbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)mptbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//        if(((((Airplane)jComboBox1.getSelectedItem())!=null) ) && (((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory()!=null) && ((Airplane)jComboBox1.getSelectedItem()).getFlightDirectory().getFlightDirectory()!=null){
       if((studies)studyComboBox.getSelectedItem()!=null)
        for(Patients a : patientsDirectory.getPatientDirectory()) {
            studies study = (studies)studyComboBox.getSelectedItem();
            
            if(a.getStudyID().equals(study.getIrbID())){
             Object row[] = new Object[4];
             row[0] = study;
             row[1] = a;
             
             if(a.getConsentQueations()!= null){
                  row[2] = a.getConsentQueations().getcCreatedDate();
                  row[3] =a.getConsentQueations().getConsentStatus();
                 
             }
            
             model.addRow(row);
            }
          
        }
    }
        
    

//    CRCManageConsentPanel(JPanel userProcessContainer, OncologyDepartment organization) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   initComponents();
//   this.userProcessContainer = userProcessContainer;
//   this.organization = organization;
//      
//    
//    
//    
//    }

    /**
     * Creates new form CRCManageConsentPanel
     */
//    public CRCManageConsentPanel() {
//        initComponents();
//    }

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
        studyComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mptbl = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("B & W Oncology Site Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Select Study:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 112, -1, -1));

        studyComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        studyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyComboBoxActionPerformed(evt);
            }
        });
        add(studyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(18, 51, 105));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 150, 40));

        mptbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        mptbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Study ID", "Patient ID", "Consent ID", "Consent Status"
            }
        ));
        jScrollPane1.setViewportView(mptbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 165));

        jButton3.setBackground(new java.awt.Color(18, 51, 105));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add Consent");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 210, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel3.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
//         Airplane airplane = (Airplane)jComboBox1.getSelectedItem();
//         AddNewFlightPanel alwp = new AddNewFlightPanel(TAProcessContainer, airplane);
         
          int selectedRow = mptbl.getSelectedRow();
        if(selectedRow>=0){
            
                studies study = (studies)mptbl.getValueAt(selectedRow, 0);
                Patients patient = (Patients)mptbl.getValueAt(selectedRow, 1);
                //ViewFlightPanel viewflightPanel = new ViewFlightPanel(TAProcessContainer, flight);
                  CRCAdminUpdateConsentPanel cRCAdminUpdateConsentPanel = new CRCAdminUpdateConsentPanel(userProcessContainer, organization,study,patient);

                  
                   userProcessContainer.add("CRCAdminUpdateConsentPanel", cRCAdminUpdateConsentPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//                
//               // TAProcessContainer.add("viewflightPanel", viewflightPanel);
//        CardLayout layout = (CardLayout)TAProcessContainer.getLayout();
//        layout.next(TAProcessContainer);
                
            
        }else{
            //JOptionPane.showMessageDialog(null, "Please select a Row!!");
               JLabel label = new JLabel("Please select a Row!");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);
        }
         
        
        
        
        
        
        
        
        
//        
//           CRCAdminUpdateConsentPanel cRCAdminUpdateConsentPanel = new CRCAdminUpdateConsentPanel(userProcessContainer, organization);
//        userProcessContainer.add("CRCAdminUpdateConsentPanel", cRCAdminUpdateConsentPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void studyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyComboBoxActionPerformed
        // TODO add your handling code here:
        refreshTable();  
    }//GEN-LAST:event_studyComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mptbl;
    private javax.swing.JComboBox studyComboBox;
    // End of variables declaration//GEN-END:variables
}

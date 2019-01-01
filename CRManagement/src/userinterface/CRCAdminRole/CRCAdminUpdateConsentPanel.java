/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CRCAdminRole;

import Business.Organization.OncologyDepartment;
import Business.Stakeholders.Patients;
import Business.Stakeholders.studies;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import Business.Stakeholders.ConsentQueations;
import javax.swing.JOptionPane;

/**
 *
 * @author harish
 */
public class CRCAdminUpdateConsentPanel extends javax.swing.JPanel {

    /**
     * Creates new form CRCAdminUpdateConsentPanel
     */
//    public CRCAdminUpdateConsentPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;
    OncologyDepartment organization;
    studies study;
    Patients patient;
    ConsentQueations consentQueations;
    
    

//    CRCAdminUpdateConsentPanel(JPanel userProcessContainer, OncologyDepartment organization) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    
//    initComponents();
//    this.userProcessContainer = userProcessContainer;
//    this.organization = organization;
//    
//    }

    CRCAdminUpdateConsentPanel(JPanel userProcessContainer, OncologyDepartment organization, studies study, Patients patient) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    initComponents();
    this.userProcessContainer = userProcessContainer;
    this.organization = organization;
    this.study = study;
    this.patient = patient;
    
    
    this.consentQueations = patient.getConsentQueations();
    
    copyCOnsentQuestionsFromStudy();
    displayConsentQuestions();
    displayResponse();
    jLabel1.setText(organization.getName());
      
    
   
    }
  public void copyCOnsentQuestionsFromStudy(){
      
        this.consentQueations.setQuestion1(this.study.getQuestion1());
        this.consentQueations.setQuestion2(this.study.getQuestion2());
        this.consentQueations.setQuestion3(this.study.getQuestion3());
        this.consentQueations.setQuestion4(this.study.getQuestion4());
        this.consentQueations.setQuestion5(this.study.getQuestion5());
        
    }
  public void displayConsentQuestions(){
      vcfq1TF.setText(this.consentQueations.getQuestion1());
      vcfq2TF.setText(this.consentQueations.getQuestion2());
      vcfq3TF.setText(this.consentQueations.getQuestion3());
      vcfq4TF.setText(this.consentQueations.getQuestion4());
      vcfq5TF.setText(this.consentQueations.getQuestion5());
      
      
  }
 public void displayResponse(){
     
     if(this.consentQueations.getRespose1()!=null){
        if(this.consentQueations.getRespose1()=="Yes")
        radioYes1.setSelected(true);
        else if(this.consentQueations.getRespose1()=="No")
        radioNo1.setSelected(true);
          else if(this.consentQueations.getRespose1()=="Withdrawn")
          radioWithdrawn1.setSelected(true);   
     }
     
      if(this.consentQueations.getRespose2()!=null){
        if(this.consentQueations.getRespose2()=="Yes")
        radioYes2.setSelected(true);
        else if(this.consentQueations.getRespose2()=="No")
        radioNo2.setSelected(true);
          else if(this.consentQueations.getRespose2()=="Withdrawn")
          radioWithdrawn2.setSelected(true);   
     }
      
       if(this.consentQueations.getResponse3()!=null){
        if(this.consentQueations.getResponse3()=="Yes")
        radioYes3.setSelected(true);
        else if(this.consentQueations.getResponse3()=="No")
        radioNo3.setSelected(true);
          else if(this.consentQueations.getResponse3()=="Withdrawn")
          radioWithdrawn3.setSelected(true);   
     }
       
        if(this.consentQueations.getReponse4()!=null){
        if(this.consentQueations.getReponse4()=="Yes")
        radioYes4.setSelected(true);
        else if(this.consentQueations.getReponse4()=="No")
        radioNo4.setSelected(true);
          else if(this.consentQueations.getReponse4()=="Withdrawn")
          radioWithdrawn4.setSelected(true);   
     }
         if(this.consentQueations.getReponse5()!=null){
        if(this.consentQueations.getReponse5()=="Yes")
        radioYes5.setSelected(true);
        else if(this.consentQueations.getReponse5()=="No")
        radioNo5.setSelected(true);
          else if(this.consentQueations.getReponse5()=="Withdrawn")
          radioWithdrawn5.setSelected(true);   
     }
         
         if(this.consentQueations.getConsentStatus()!=null){
           
             if(this.consentQueations.getConsentStatus()=="Yes")
                  jComboBox2.setSelectedIndex(0);
             else if(this.consentQueations.getConsentStatus()=="No")
                   jComboBox2.setSelectedIndex(1);
             else if(this.consentQueations.getConsentStatus()=="Withdrawn")
                  jComboBox2.setSelectedIndex(2);
         }
         
         if(this.consentQueations.getcCreatedDate()!=null){
             jDateChooser1.setDate(this.consentQueations.getcCreatedDate());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vcfq2TF = new javax.swing.JTextField();
        vcfq1TF = new javax.swing.JTextField();
        vcfq4TF = new javax.swing.JTextField();
        vcfq3TF = new javax.swing.JTextField();
        vcfq5TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radioYes1 = new javax.swing.JRadioButton();
        radioNo1 = new javax.swing.JRadioButton();
        radioWithdrawn1 = new javax.swing.JRadioButton();
        radioWithdrawn2 = new javax.swing.JRadioButton();
        radioNo2 = new javax.swing.JRadioButton();
        radioYes2 = new javax.swing.JRadioButton();
        radioWithdrawn3 = new javax.swing.JRadioButton();
        radioNo3 = new javax.swing.JRadioButton();
        radioYes3 = new javax.swing.JRadioButton();
        radioWithdrawn4 = new javax.swing.JRadioButton();
        radioNo4 = new javax.swing.JRadioButton();
        radioYes4 = new javax.swing.JRadioButton();
        radioYes5 = new javax.swing.JRadioButton();
        radioNo5 = new javax.swing.JRadioButton();
        radioWithdrawn5 = new javax.swing.JRadioButton();
        savebtn = new javax.swing.JButton();
        bckbtn = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("B & W Site Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Question - 1:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Question - 2:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Question - 5:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Question - 4:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Question - 3:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));

        vcfq2TF.setEditable(false);
        vcfq2TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vcfq2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 390, -1));

        vcfq1TF.setEditable(false);
        vcfq1TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vcfq1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcfq1TFActionPerformed(evt);
            }
        });
        add(vcfq1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 390, -1));

        vcfq4TF.setEditable(false);
        vcfq4TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vcfq4TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 390, -1));

        vcfq3TF.setEditable(false);
        vcfq3TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vcfq3TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 390, -1));

        vcfq5TF.setEditable(false);
        vcfq5TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vcfq5TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 390, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("NO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 109, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("YES");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("WITHDRAWN");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 109, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Consent Status:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 456, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Signed Date:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 456, -1, -1));

        buttonGroup1.add(radioYes1);
        add(radioYes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        buttonGroup1.add(radioNo1);
        add(radioNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        buttonGroup1.add(radioWithdrawn1);
        add(radioWithdrawn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        buttonGroup2.add(radioWithdrawn2);
        add(radioWithdrawn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        buttonGroup2.add(radioNo2);
        add(radioNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        buttonGroup2.add(radioYes2);
        add(radioYes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        buttonGroup3.add(radioWithdrawn3);
        add(radioWithdrawn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        buttonGroup3.add(radioNo3);
        radioNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNo3ActionPerformed(evt);
            }
        });
        add(radioNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        buttonGroup3.add(radioYes3);
        add(radioYes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        buttonGroup4.add(radioWithdrawn4);
        add(radioWithdrawn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        buttonGroup4.add(radioNo4);
        radioNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNo4ActionPerformed(evt);
            }
        });
        add(radioNo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        buttonGroup4.add(radioYes4);
        add(radioYes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        buttonGroup5.add(radioYes5);
        add(radioYes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        buttonGroup5.add(radioNo5);
        radioNo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNo5ActionPerformed(evt);
            }
        });
        add(radioNo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        buttonGroup5.add(radioWithdrawn5);
        add(radioWithdrawn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        savebtn.setBackground(new java.awt.Color(18, 51, 105));
        savebtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 100, 50));

        bckbtn.setBackground(new java.awt.Color(18, 51, 105));
        bckbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bckbtn.setForeground(new java.awt.Color(255, 255, 255));
        bckbtn.setText("<< Back");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });
        add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 140, 50));

        jComboBox2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", "Withdrawn" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 130, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel12.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel12.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void vcfq1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcfq1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcfq1TFActionPerformed

    private void radioNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNo3ActionPerformed

    private void radioNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNo4ActionPerformed

    private void radioNo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNo5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CRCManageConsentPanel cecCManageConsentPanel = (CRCManageConsentPanel) component;
        cecCManageConsentPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_bckbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
try{        
        
          
//        radioCustomer.setActionCommand("customer");
//        radioSupplier.setActionCommand("supplier");
        
        radioYes1.setActionCommand("Yes");
        radioNo1.setActionCommand("No");
        radioWithdrawn1.setActionCommand("Withdrawn");
        
         radioYes2.setActionCommand("Yes");
        radioNo2.setActionCommand("No");
        radioWithdrawn2.setActionCommand("Withdrawn");
        
           radioYes3.setActionCommand("Yes");
        radioNo3.setActionCommand("No");
        radioWithdrawn3.setActionCommand("Withdrawn");
        
           radioYes4.setActionCommand("Yes");
        radioNo4.setActionCommand("No");
        radioWithdrawn4.setActionCommand("Withdrawn");
        
           radioYes5.setActionCommand("Yes");
        radioNo5.setActionCommand("No");
        radioWithdrawn5.setActionCommand("Withdrawn");


//        
//        if(txtUser.getText().isEmpty()||txtPword.getText().isEmpty()||txtRePword.getText().isEmpty())
//        {   
//            JOptionPane.showMessageDialog(null,"Please enter Valid data..");
//        }
        
       if(buttonGroup1.getSelection().getActionCommand() == "Yes"){
           this.consentQueations.setRespose1("Yes");
           
           
       }else if(buttonGroup1.getSelection().getActionCommand()== "No"){
           this.consentQueations.setRespose1("No");
           
       }else if(buttonGroup1.getSelection().getActionCommand()=="Withdrawn"){
           this.consentQueations.setRespose1("Withdrawn");
       }
       
       
       if(buttonGroup2.getSelection().getActionCommand() == "Yes"){
           this.consentQueations.setRespose2("Yes");
           
           
       }else if(buttonGroup2.getSelection().getActionCommand()== "No"){
           this.consentQueations.setRespose2("No");
           
       }else if(buttonGroup2.getSelection().getActionCommand()=="Withdrawn"){
           this.consentQueations.setRespose2("Withdrawn");
       }
       
       if(buttonGroup3.getSelection().getActionCommand() == "Yes"){
           this.consentQueations.setResponse3("Yes");
           
           
       }else if(buttonGroup3.getSelection().getActionCommand()== "No"){
           this.consentQueations.setResponse3("No");
           
       }else if(buttonGroup3.getSelection().getActionCommand()=="Withdrawn"){
           this.consentQueations.setResponse3("Withdrawn");
       }
       
       if(buttonGroup4.getSelection().getActionCommand() == "Yes"){
           this.consentQueations.setReponse4("Yes");
           
           
       }else if(buttonGroup4.getSelection().getActionCommand()== "No"){
           this.consentQueations.setReponse4("No");
           
       }else if(buttonGroup4.getSelection().getActionCommand()=="Withdrawn"){
           this.consentQueations.setReponse4("Withdrawn");
       }
       
       if(buttonGroup5.getSelection().getActionCommand() == "Yes"){
           this.consentQueations.setReponse5("Yes");
           
           
       }else if(buttonGroup5.getSelection().getActionCommand()== "No"){
           this.consentQueations.setReponse5("No");
           
       }else if(buttonGroup5.getSelection().getActionCommand()=="Withdrawn"){
           this.consentQueations.setReponse5("Withdrawn");
       }
       
       this.consentQueations.setConsentStatus((String)jComboBox2.getSelectedItem());
       this.consentQueations.setcCreatedDate(jDateChooser1.getDate());
       
      
        
//        
//        if(groupBtn.getSelection().getActionCommand()== "customer" ){
//            customer = customerDirectory.addCustomer();
//            customer.setUserName(txtUser.getText());
//            customer.setPassword(txtPword.getText());
//           
//            JOptionPane.showMessageDialog(null,"Customer Successfully Created");
//             txtUser.setText("");
//            txtPword.setText("");
//            txtRePword.setText("");
//
//        }
//        else if(groupBtn.getSelection().getActionCommand()== "supplier"){
//       
//            supplier = supplierDirectory.addSupplier();
//            supplier.setUserName(txtUser.getText());
//            supplier.setPassword(txtPword.getText());
//            
//            JOptionPane.showMessageDialog(null,"Supplier Successfully Created");
//            txtUser.setText("");
//            txtPword.setText("");
//            txtRePword.setText("");
//        }
//        
      JOptionPane.showMessageDialog(null, "Responses Saved");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
}
catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Enter all responses");
}
        
        
        
        
        
        
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioNo1;
    private javax.swing.JRadioButton radioNo2;
    private javax.swing.JRadioButton radioNo3;
    private javax.swing.JRadioButton radioNo4;
    private javax.swing.JRadioButton radioNo5;
    private javax.swing.JRadioButton radioWithdrawn1;
    private javax.swing.JRadioButton radioWithdrawn2;
    private javax.swing.JRadioButton radioWithdrawn3;
    private javax.swing.JRadioButton radioWithdrawn4;
    private javax.swing.JRadioButton radioWithdrawn5;
    private javax.swing.JRadioButton radioYes1;
    private javax.swing.JRadioButton radioYes2;
    private javax.swing.JRadioButton radioYes3;
    private javax.swing.JRadioButton radioYes4;
    private javax.swing.JRadioButton radioYes5;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField vcfq1TF;
    private javax.swing.JTextField vcfq2TF;
    private javax.swing.JTextField vcfq3TF;
    private javax.swing.JTextField vcfq4TF;
    private javax.swing.JTextField vcfq5TF;
    // End of variables declaration//GEN-END:variables
}

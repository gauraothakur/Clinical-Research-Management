/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SuperAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

;

/**
 *
 * @author shubh
 */
public class SuperAdminAddspecimenPanel extends javax.swing.JPanel {

    /**
     * Creates new form labtechnician_workarea_addspecimen
     */
//    public SuperAdminAddspecimenPanel() {
//        initComponents();
//    }
      
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public SuperAdminAddspecimenPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = container;
        jLabel1.setText(enterprise.getName());

//        popOrganizationComboBox();
//       // employeeJComboBox.removeAllItems();
//        popData();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        qTF = new javax.swing.JTextField();
        collectorTF = new javax.swing.JTextField();
        cdTF = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        unitTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rdTF = new javax.swing.JTextField();
        csTF = new javax.swing.JTextField();
        ccTF = new javax.swing.JTextField();
        asTF = new javax.swing.JTextField();
        rateTF = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("B & W Oncology Lab Technician");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Specimen Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Quantity:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Unit:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("Collection Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("Collector:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setText("Receiver:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 150, -1));

        qTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(qTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        collectorTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(collectorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 160, -1));

        cdTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(cdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 160, -1));

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 160, -1));

        unitTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(unitTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 160, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("Received Date:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel9.setText("Activity Status:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel10.setText("Collection Container:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel12.setText("Rate:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel13.setText("Collection Status:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        rdTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(rdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 176, -1));

        csTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(csTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 176, -1));

        ccTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(ccTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 176, -1));

        asTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(asTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 176, -1));

        rateTF.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(rateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 176, -1));

        submitbtn.setBackground(new java.awt.Color(18, 51, 105));
        submitbtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 130, 50));

        backbtn.setBackground(new java.awt.Color(18, 51, 105));
        backbtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("<< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 628, 120, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel11.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel11.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asTF;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField ccTF;
    private javax.swing.JTextField cdTF;
    private javax.swing.JTextField collectorTF;
    private javax.swing.JTextField csTF;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField qTF;
    private javax.swing.JTextField rateTF;
    private javax.swing.JTextField rdTF;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField unitTF;
    // End of variables declaration//GEN-END:variables
}
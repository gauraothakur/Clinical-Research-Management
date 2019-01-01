/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SuperAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Stakeholders.Patients;
import Business.Stakeholders.PatientsDirectory;

/**
 *
 * @author harish
 */
public class SuperAdminManagePatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form SuperAdminManagePatientPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PatientsDirectory patientsDirectory;
    private Patients patients;

    public SuperAdminManagePatientPanel(JPanel container, Enterprise enterprise,PatientsDirectory patientsDirectory) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = container;
        txtOrganizationName.setText(enterprise.getName());
        this.patientsDirectory = patientsDirectory;
        jLabel1.setText(enterprise.getName());
        refreshTable();

//        popOrganizationComboBox();
//       // employeeJComboBox.removeAllItems();
//        popData();
    }
    
    public void refreshTable() {
        int rowCount = tblManagePatient.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblManagePatient.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Patients a : patientsDirectory.getPatientDirectory()) {
            Object row[] = new Object[3];
            row[0] = a;
            row[1] = a.getMrn();
            row[2] = a.getpCreatedDate();
//            row[3]
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
        txtOrganizationName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManagePatient = new javax.swing.JTable();
        btnAddPatient = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Al Bayan", 0, 24)); // NOI18N
        jLabel1.setText("B&W Super Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 550, 25));

        jLabel2.setFont(new java.awt.Font("Al Bayan", 0, 24)); // NOI18N
        jLabel2.setText("Organization Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 240, 30));

        txtOrganizationName.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        txtOrganizationName.setEnabled(false);
        add(txtOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 230, 30));

        tblManagePatient.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        tblManagePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "MRN", "Created On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManagePatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 460, 230));

        btnAddPatient.setBackground(new java.awt.Color(18, 51, 105));
        btnAddPatient.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 200, 40));

        backJButton.setBackground(new java.awt.Color(18, 51, 105));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel3.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
             // TODO add your handling code here:
               
           SuperAdminAddPatientPanel muajp = new SuperAdminAddPatientPanel(userProcessContainer, enterprise, patientsDirectory);
//                   SuperAdminManagePatient muajp = new SuperAdminManagePatient(userProcessContainer, enterprise);

        
        userProcessContainer.add("SuperAdminAddPatientPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManagePatient;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
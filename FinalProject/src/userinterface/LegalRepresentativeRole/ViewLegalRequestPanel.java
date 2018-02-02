/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LegalRepresentativeRole;

import Business.WorkQueue.FindDonorRequest;
import Business.WorkQueue.OrganMatchingWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Neha
 */
public class ViewLegalRequestPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FindDonorRequest request;

    /**
     * Creates new form ViewLegalRequestPanel
     */
    public ViewLegalRequestPanel(JPanel userProcessContainer, FindDonorRequest request) {
        initComponents();
        rejectReasonTExtarea.setVisible(false);
        rejectReasonLabel.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        populateForm();

    }

    private void populateForm() {

        requestIDTextField.setText(String.valueOf(request.getRequestID()));
        hospitalIDTextField.setText(String.valueOf(request.getHospitalID()));
        hospitalNameTextField.setText(String.valueOf(request.getHospitalName()));
        hospitalContactTextField.setText(String.valueOf(request.getHospitalContactNo()));
        patientIDTExtField.setText(String.valueOf(request.getPatientDetails().getPatientID()));
        patientNameTextField.setText(String.valueOf(request.getPatientDetails().getPatientName()));
        patientContactTExtField.setText(String.valueOf(request.getPatientDetails().getPatientContactNumber()));
        patientLocationTExtField.setText(String.valueOf(request.getPatientDetails().getPatientLocation()));
        patientCriticalityTextField.setText(String.valueOf(request.getPatientDetails().getCritical()));
        donorContactTextField.setText(String.valueOf(request.getDonor().getDonorPhoneNumber()));
        donorIDTextField.setText(String.valueOf(request.getDonor().getDonorId()));
        donorLocationTExtArea.setText(String.valueOf(request.getDonor().getDonorAddress()));
        donorNameTextField.setText(String.valueOf(request.getDonor().getDonorName()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approvalButtonGroup = new javax.swing.ButtonGroup();
        backButton = new javax.swing.JButton();
        approveButtonTextField = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientIDTExtField = new javax.swing.JTextField();
        patientNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        patientContactTExtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        patientCriticalityTextField = new javax.swing.JTextField();
        patientLocationTExtField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        donorIDTextField = new javax.swing.JTextField();
        donorNameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        donorContactTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        donorLocationTExtArea = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hospitalIDTextField = new javax.swing.JTextField();
        hospitalNameTextField = new javax.swing.JTextField();
        hospitalContactTextField = new javax.swing.JTextField();
        requestIDTextField = new javax.swing.JTextField();
        rejectReasonLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rejectReasonTExtarea = new javax.swing.JTextArea();
        rejectRadioBtn = new javax.swing.JRadioButton();
        approveRadioBtn = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 153, 153));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 810, -1, -1));

        approveButtonTextField.setBackground(new java.awt.Color(0, 0, 0));
        approveButtonTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        approveButtonTextField.setForeground(new java.awt.Color(255, 153, 153));
        approveButtonTextField.setText("Approve/Reject");
        approveButtonTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonTextFieldActionPerformed(evt);
            }
        });
        add(approveButtonTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 830, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Legal Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Request ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Patient ID :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Patient Name:");

        patientIDTExtField.setEditable(false);
        patientIDTExtField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        patientNameTextField.setEditable(false);
        patientNameTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Location:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Contact:");

        patientContactTExtField.setEditable(false);
        patientContactTExtField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Criticality:");

        patientCriticalityTextField.setEditable(false);
        patientCriticalityTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        patientLocationTExtField.setEditable(false);
        patientLocationTExtField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(patientIDTExtField))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientContactTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientCriticalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientLocationTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientIDTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(patientCriticalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(patientContactTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(patientLocationTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 290));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Donor ID:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Donor Name:");

        donorIDTextField.setEditable(false);

        donorNameTextField.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Contact:");

        donorContactTextField.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Location:");

        donorLocationTExtArea.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(donorContactTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(donorIDTextField)
                    .addComponent(donorNameTextField)
                    .addComponent(donorLocationTExtArea))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(donorIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(donorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(donorContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(donorLocationTExtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, 290));

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hospital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Hospital ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Hospital Name :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Hospital Contact:");

        hospitalIDTextField.setEditable(false);
        hospitalIDTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        hospitalNameTextField.setEditable(false);
        hospitalNameTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        hospitalContactTextField.setEditable(false);
        hospitalContactTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(hospitalContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(hospitalIDTextField))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(hospitalIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hospitalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(hospitalContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 200));

        requestIDTextField.setEditable(false);
        requestIDTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(requestIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 116, -1));

        rejectReasonLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rejectReasonLabel.setText("Rejection Reason:");
        add(rejectReasonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 750, -1, -1));

        rejectReasonTExtarea.setColumns(20);
        rejectReasonTExtarea.setRows(5);
        jScrollPane2.setViewportView(rejectReasonTExtarea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, 270, -1));

        rejectRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        approvalButtonGroup.add(rejectRadioBtn);
        rejectRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rejectRadioBtn.setText("Reject");
        rejectRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectRadioBtnActionPerformed(evt);
            }
        });
        add(rejectRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, -1, -1));

        approveRadioBtn.setBackground(new java.awt.Color(204, 255, 255));
        approvalButtonGroup.add(approveRadioBtn);
        approveRadioBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        approveRadioBtn.setSelected(true);
        approveRadioBtn.setText("Approve");
        add(approveRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approveButtonTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonTextFieldActionPerformed

        if (approveRadioBtn.isSelected()) {
            request.setAuthorization("Authorized");
            request.setStatus("Legally authorized");
            request.setRejectionReason("NA");
        } else if (rejectRadioBtn.isSelected()) {
            request.setAuthorization("Rejected");
            request.setStatus("Legally rejected");
            request.setRejectionReason(rejectReasonTExtarea.getText());
        }

    }//GEN-LAST:event_approveButtonTextFieldActionPerformed

    private void rejectRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectRadioBtnActionPerformed
        rejectReasonTExtarea.setVisible(true);
        rejectReasonLabel.setVisible(true);
    }//GEN-LAST:event_rejectRadioBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LegalRepresentativeWorkArea dwjp = (LegalRepresentativeWorkArea) component;
        dwjp.populateWorkQueue();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup approvalButtonGroup;
    private javax.swing.JButton approveButtonTextField;
    private javax.swing.JRadioButton approveRadioBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField donorContactTextField;
    private javax.swing.JTextField donorIDTextField;
    private javax.swing.JTextField donorLocationTExtArea;
    private javax.swing.JTextField donorNameTextField;
    private javax.swing.JTextField hospitalContactTextField;
    private javax.swing.JTextField hospitalIDTextField;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField patientContactTExtField;
    private javax.swing.JTextField patientCriticalityTextField;
    private javax.swing.JTextField patientIDTExtField;
    private javax.swing.JTextField patientLocationTExtField;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JRadioButton rejectRadioBtn;
    private javax.swing.JLabel rejectReasonLabel;
    private javax.swing.JTextArea rejectReasonTExtarea;
    private javax.swing.JTextField requestIDTextField;
    // End of variables declaration//GEN-END:variables
}

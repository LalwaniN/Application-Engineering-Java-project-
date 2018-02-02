/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Network.Network;
import Business.Organization.Hospital.HospitalRepOrganization;
import Business.Organization.Organization;
import Business.RegCenter.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FindDonorRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Neha
 */
public class RaiseNewRequestPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;

    /**
     * Creates new form RaiseNewRequestPanel
     */
    public RaiseNewRequestPanel(JPanel userProcessContainer,UserAccount userAccount,Network cityNetwork, EcoSystem system) {
        initComponents();
        this.system = system;
        this.network = cityNetwork;
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderLabel = new javax.swing.JLabel();
        RaiseRequestBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PatientBloodTypeLabel = new javax.swing.JLabel();
        patientContactNoLabel = new javax.swing.JLabel();
        patientnamelabel = new javax.swing.JLabel();
        patientagelabel = new javax.swing.JLabel();
        PatientWeightLabel = new javax.swing.JLabel();
        OrganNeededLabel = new javax.swing.JLabel();
        MedicalCondLabel = new javax.swing.JLabel();
        HospitalContactNoLabel = new javax.swing.JLabel();
        CriticalLabel = new javax.swing.JLabel();
        CriticalJComboBox = new javax.swing.JComboBox<>();
        HospitalContactNoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        OtherMedicalConditionTextArea = new javax.swing.JTextArea();
        PatientWeightTextField = new javax.swing.JTextField();
        PatientBloodTypeComboBox = new javax.swing.JComboBox<>();
        ContactNoTextField = new javax.swing.JTextField();
        PatientAgeTextField = new javax.swing.JTextField();
        PatientNameField = new javax.swing.JTextField();
        OrganNeededCombobox = new javax.swing.JComboBox<>();
        PatientWeightLabel1 = new javax.swing.JLabel();
        patientHeightTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Raise Donor Requirement request");
        add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 434, -1));

        RaiseRequestBtn.setBackground(new java.awt.Color(0, 0, 0));
        RaiseRequestBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        RaiseRequestBtn.setForeground(new java.awt.Color(255, 153, 153));
        RaiseRequestBtn.setText("Raise request");
        RaiseRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaiseRequestBtnActionPerformed(evt);
            }
        });
        add(RaiseRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 770, 207, -1));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 153));
        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 770, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientBloodTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PatientBloodTypeLabel.setText("Blood type:");
        jPanel2.add(PatientBloodTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, -1, -1));

        patientContactNoLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        patientContactNoLabel.setText("Contact Number :");
        jPanel2.add(patientContactNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, -1, -1));

        patientnamelabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        patientnamelabel.setText("Patient Name:");
        jPanel2.add(patientnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        patientagelabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        patientagelabel.setText("Age:");
        jPanel2.add(patientagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        PatientWeightLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PatientWeightLabel.setText("Body Weight(Kgs):");
        jPanel2.add(PatientWeightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 228, -1, -1));

        OrganNeededLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        OrganNeededLabel.setText("Organ affected:");
        jPanel2.add(OrganNeededLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 345, -1, -1));

        MedicalCondLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MedicalCondLabel.setText("Other Medical Conditions:");
        jPanel2.add(MedicalCondLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 409, -1, -1));

        HospitalContactNoLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        HospitalContactNoLabel.setText("Hospital Contact Number : ");
        jPanel2.add(HospitalContactNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        CriticalLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriticalLabel.setText("Criticality : ");
        jPanel2.add(CriticalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 575, 226, 26));

        CriticalJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        jPanel2.add(CriticalJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 576, 170, 30));

        HospitalContactNoTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(HospitalContactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 169, 34));

        OtherMedicalConditionTextArea.setColumns(20);
        OtherMedicalConditionTextArea.setRows(5);
        jScrollPane1.setViewportView(OtherMedicalConditionTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 399, 260, 100));

        PatientWeightTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(PatientWeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 225, 166, -1));

        PatientBloodTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O", "A", "B", "AB" }));
        jPanel2.add(PatientBloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 169, 170, 30));

        ContactNoTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(ContactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 108, 166, 34));

        PatientAgeTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(PatientAgeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 59, 166, -1));

        PatientNameField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(PatientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 13, 166, -1));

        OrganNeededCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kidney", "Pancreas", "Lungs", "Intestines", "Liver" }));
        jPanel2.add(OrganNeededCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 339, 166, 31));

        PatientWeightLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PatientWeightLabel1.setText("Body Height(cms):");
        jPanel2.add(PatientWeightLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 284, -1, -1));

        patientHeightTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(patientHeightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 281, 166, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 580, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void RaiseRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaiseRequestBtnActionPerformed
      
        try{
            
            if(PatientNameField.getText().equals("")|| PatientAgeTextField.getText().equals("")|| ContactNoTextField.getText().equals("")|| PatientWeightTextField.equals("")|| patientHeightTextField.equals("")||OtherMedicalConditionTextArea.equals("")||HospitalContactNoTextField.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter valid details!");
            return;
            }
       Patient patient = null;
       int hospitalID = 0;
       String hospitalName = null;
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                hospitalID = enterprise.getEnterpriseID();
                hospitalName = enterprise.getName();
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof HospitalRepOrganization){
                       patient = ((HospitalRepOrganization) organization).getPatientDirectory().getPatient();
                       
                    }
                }
            }
        }
       Integer height = Integer.parseInt(patientHeightTextField.getText());
       double weight = Double.parseDouble(PatientWeightTextField.getText());
       double bmi = (weight/(height*height))*10000;
       patient.setBmi(bmi);
        
        patient.setPatientName(PatientNameField.getText());
        patient.setPatientAge(Integer.parseInt(PatientAgeTextField.getText()));
        patient.setPatientLocation(network.getNetworkName());
        patient.setBloodType(PatientBloodTypeComboBox.getSelectedItem().toString());
        patient.setWeight(Double.parseDouble(PatientWeightTextField.getText()));
        patient.setHeight(Integer.parseInt(patientHeightTextField.getText()));
        patient.getOrganNeeded().setOrganName(OrganNeededCombobox.getSelectedItem().toString());
        //patient.getOrganNeeded().setOrganSize(Double.parseDouble(OrganSizeTextField.getText()));
        patient.setOtherMedicalCondition(OtherMedicalConditionTextArea.getText());
        patient.setPatientContactNumber(Long.parseLong(ContactNoTextField.getText()));
        patient.setCritical(CriticalJComboBox.getSelectedItem().toString());
        patient.setTransplantRequestDate(new Date());
        FindDonorRequest findDonorReq = new FindDonorRequest();
        findDonorReq.setPatientDetails(patient);
        findDonorReq.setSender(userAccount);
        findDonorReq.setStatus("Request Raised");
        findDonorReq.setRequestDate(new Date());
        findDonorReq.setHospitalID(hospitalID);
        findDonorReq.setHospitalName(hospitalName);
        findDonorReq.setHospitalCity(network.getNetworkName());
        findDonorReq.setHospitalContactNo(Long.parseLong(HospitalContactNoTextField.getText()));
        
        for(Network network : system.getNetworkList()){
            for(Network stateNetwork : network.getSubNetwork()){
                for(Network cityNetwork : stateNetwork.getSubNetwork()){
                    if(cityNetwork.getNetworkName().equals(this.network.getNetworkName())){
                        findDonorReq.setHospitalState(stateNetwork.getNetworkName());
                        stateNetwork.getWorkQueue().getWorkRequestList().add(findDonorReq);
                        stateNetwork.getNetworkPatientDirectory().getPatientDirectory().add(patient);
                        system.getMasterPatientList().add(patient);
                        JOptionPane.showMessageDialog(null, "Request raised successfully");
                        clearFields();
                    }
                }
            }
        }
        userAccount.getWorkQueue().getWorkRequestList().add(findDonorReq);
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null, "Please enter valid details!");
            return;
        }

    }//GEN-LAST:event_RaiseRequestBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RaiseAndViewMyRequests viewRequest = (RaiseAndViewMyRequests) component;
        viewRequest.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed
    private void clearFields(){
        PatientNameField.setText("");
        PatientAgeTextField.setText("");
      PatientWeightTextField.setText("");
      patientHeightTextField.setText("");
      ContactNoTextField.setText("");
      OtherMedicalConditionTextArea.setText("");
      HospitalContactNoTextField.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField ContactNoTextField;
    private javax.swing.JComboBox<String> CriticalJComboBox;
    private javax.swing.JLabel CriticalLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HospitalContactNoLabel;
    private javax.swing.JTextField HospitalContactNoTextField;
    private javax.swing.JLabel MedicalCondLabel;
    private javax.swing.JComboBox<String> OrganNeededCombobox;
    private javax.swing.JLabel OrganNeededLabel;
    private javax.swing.JTextArea OtherMedicalConditionTextArea;
    private javax.swing.JTextField PatientAgeTextField;
    private javax.swing.JComboBox<String> PatientBloodTypeComboBox;
    private javax.swing.JLabel PatientBloodTypeLabel;
    private javax.swing.JTextField PatientNameField;
    private javax.swing.JLabel PatientWeightLabel;
    private javax.swing.JLabel PatientWeightLabel1;
    private javax.swing.JTextField PatientWeightTextField;
    private javax.swing.JButton RaiseRequestBtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientContactNoLabel;
    private javax.swing.JTextField patientHeightTextField;
    private javax.swing.JLabel patientagelabel;
    private javax.swing.JLabel patientnamelabel;
    // End of variables declaration//GEN-END:variables
}
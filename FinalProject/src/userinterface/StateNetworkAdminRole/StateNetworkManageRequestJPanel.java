/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Network.Network;
import Business.Organization.LegalEnterprise.LegalOrganization;
import Business.Organization.OPTOrganization.OPTEAdminOrganization;
import Business.Organization.Organization;
import Business.RegCenter.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FindDonorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class StateNetworkManageRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private Network stateNetwork;
    /**
     * Creates new form StateNetworkManageRequestJPanel
     */
    StateNetworkManageRequestJPanel(JPanel userProcessContainer, UserAccount account, Network stateNetwork,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.stateNetwork = stateNetwork;
        
        populatetable();
    }
    
    public void populatetable() {
        DonorRequestTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) DonorRequestTable.getModel();
        model.setRowCount(0);
        if (stateNetwork.getWorkQueue().getWorkRequestList().size() > 0) {
            for (Network countryNetwork : system.getNetworkList()) {
                for (Network stateNetwork : countryNetwork.getSubNetwork()) {
                    if (stateNetwork.getNetworkName().equals(this.stateNetwork.getNetworkName())) {
                        for (WorkRequest request : stateNetwork.getWorkQueue().getWorkRequestList()) {
                            FindDonorRequest donorReq = (FindDonorRequest) request;
                            Object[] row = new Object[3];
                            row[0] = request;
                            row[1] = donorReq.getPatientDetails().getPatientID();
                            row[2] = request.getStatus();

                            model.addRow(row);
                        }
                    }
                }
            }
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
        DonorRequestTable = new javax.swing.JTable();
        ViewRequestBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        opteRequestBtn = new javax.swing.JButton();
        legalApprovalBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonorRequestTable.setBackground(new java.awt.Color(204, 255, 255));
        DonorRequestTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DonorRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestID", "HospitalID", "Status"
            }
        ));
        DonorRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonorRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DonorRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 90, 638, 164));

        ViewRequestBtn.setBackground(new java.awt.Color(0, 0, 0));
        ViewRequestBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ViewRequestBtn.setForeground(new java.awt.Color(255, 153, 153));
        ViewRequestBtn.setText("View Request");
        ViewRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRequestBtnActionPerformed(evt);
            }
        });
        add(ViewRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 330, 50));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 153));
        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 170, 50));

        opteRequestBtn.setBackground(new java.awt.Color(0, 0, 0));
        opteRequestBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        opteRequestBtn.setForeground(new java.awt.Color(255, 153, 153));
        opteRequestBtn.setText("Initiate procurement and Transplant>>");
        opteRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opteRequestBtnActionPerformed(evt);
            }
        });
        add(opteRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 330, 50));

        legalApprovalBtn.setBackground(new java.awt.Color(0, 0, 0));
        legalApprovalBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        legalApprovalBtn.setForeground(new java.awt.Color(255, 153, 153));
        legalApprovalBtn.setText("Initiate Legal Approval");
        legalApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legalApprovalBtnActionPerformed(evt);
            }
        });
        add(legalApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 330, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRequestBtnActionPerformed
        
        int selectedRow= DonorRequestTable.getSelectedRow();
        if(selectedRow >= 0){
            FindDonorRequest request= (FindDonorRequest)DonorRequestTable.getValueAt(selectedRow, 0);
            ViewDonorRequestJPanel viewDonorReq = new ViewDonorRequestJPanel(userProcessContainer,account,stateNetwork,system,request);
            userProcessContainer.add("ViewDonorRequestJPanel",viewDonorReq);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Select an element");
        }
        
        
        
    }//GEN-LAST:event_ViewRequestBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void opteRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opteRequestBtnActionPerformed
          int selectedRow= DonorRequestTable.getSelectedRow();
       if (selectedRow>=0)
       {
        FindDonorRequest request= (FindDonorRequest)DonorRequestTable.getValueAt(selectedRow, 0);
        Patient patient = request.getPatientDetails();
        request.setSender(account);
        request.setStatus("Pending with OPTE");
        
                   Organization org = null;
           for (Network city : stateNetwork.getSubNetwork()) {
               if (patient.getPatientLocation().equalsIgnoreCase(city.getNetworkName())) {
                   for (Enterprise enterprise  : city.getEnterpriseDirectory().getEnterpriseList()) {
                       if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.OrganProcAndTransCenter.toString())) {
                           for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                               if (organization instanceof OPTEAdminOrganization) {
                                   org = organization;
                                   break;
                               }
                           }
                       }
                   }
               }
           }
        
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
       }
       else{
           
           JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
       }  
    }//GEN-LAST:event_opteRequestBtnActionPerformed

    private void DonorRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonorRequestTableMouseClicked
//         int row = DonorRequestTable.rowAtPoint(evt.getPoint());
//        WorkRequest request= (WorkRequest)DonorRequestTable.getValueAt(row,0);
//        if(request.getStatus().equals("Legally authorized")){
//            opteRequestBtn.setEnabled(true);
//        }
//        else{
//             opteRequestBtn.setEnabled(false);
//        }
    }//GEN-LAST:event_DonorRequestTableMouseClicked

    private void legalApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legalApprovalBtnActionPerformed
        int selectedRow = DonorRequestTable.getSelectedRow();
        if (selectedRow >= 0) {
            //Patient patient = findDonorRequest.getPatientDetails();
            FindDonorRequest findDonorRequest= (FindDonorRequest)DonorRequestTable.getValueAt(selectedRow, 0);
            findDonorRequest.setSender(account);
            findDonorRequest.setStatus("Awaiting Legal Authorizztion");
           
            Organization org = null;
            for (Network city : stateNetwork.getSubNetwork()) {
                if (findDonorRequest.getPatientDetails().getPatientLocation().equalsIgnoreCase(city.getNetworkName())) {
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.LegalEnterprise.toString())) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof LegalOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(findDonorRequest);
            }
        } else {

            JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_legalApprovalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable DonorRequestTable;
    private javax.swing.JButton ViewRequestBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton legalApprovalBtn;
    private javax.swing.JButton opteRequestBtn;
    // End of variables declaration//GEN-END:variables
}
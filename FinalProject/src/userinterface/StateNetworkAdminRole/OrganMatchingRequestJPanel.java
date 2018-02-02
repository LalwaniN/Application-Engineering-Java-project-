/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateNetworkAdminRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.RegCenter.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FindDonorRequest;
import Business.WorkQueue.OrganMatchingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class OrganMatchingRequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer; 
    private UserAccount account;
    private Network stateNetwork;
    private EcoSystem system;

    /**
     * Creates new form OrganMatchingRequestJPanel
     */

    public OrganMatchingRequestJPanel(JPanel userProcessContainer, UserAccount account, Network stateNetwork, EcoSystem system) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.account = account;
       this.stateNetwork = stateNetwork;
       this.system = system;
       
       //confirmDonorBtn.setEnabled(false);
       
       populateTable();
    }
    
    public void populateTable(){
        donorDetailsTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        DefaultTableModel model = (DefaultTableModel) donorDetailsTable.getModel();
        model.setRowCount(0);
        
       for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
           //request.setStatus("Completed");
               Object[] row = new Object[7];
               row[0] = request;
               row[1] = ((OrganMatchingWorkRequest)(request)).getPatient().getPatientID();
               row[2] = ((OrganMatchingWorkRequest)(request)).getPatient().getPatientName();
               row[3] = ((OrganMatchingWorkRequest)(request)).getDonor().getDonorId();
               row[4] = ((OrganMatchingWorkRequest)(request)).getDonor().getDonorName();
               row[5] = request.getStatus();
               row[6] = ((OrganMatchingWorkRequest)(request)).getResult();
               
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

        jScrollPane1 = new javax.swing.JScrollPane();
        donorDetailsTable = new javax.swing.JTable();
        confirmDonorBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        donorDetailsTable.setBackground(new java.awt.Color(204, 255, 255));
        donorDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Patient ID", "Patient Name", "Donor ID", "Donor Name", "Organ Matching Test Status", "Organ Matching Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donorDetailsTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                donorDetailsTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(donorDetailsTable);
        if (donorDetailsTable.getColumnModel().getColumnCount() > 0) {
            donorDetailsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            donorDetailsTable.getColumnModel().getColumn(1).setPreferredWidth(10);
            donorDetailsTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            donorDetailsTable.getColumnModel().getColumn(3).setPreferredWidth(10);
            donorDetailsTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            donorDetailsTable.getColumnModel().getColumn(5).setPreferredWidth(30);
            donorDetailsTable.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        confirmDonorBtn.setBackground(new java.awt.Color(0, 0, 0));
        confirmDonorBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        confirmDonorBtn.setForeground(new java.awt.Color(255, 153, 153));
        confirmDonorBtn.setText("Confirm Donor");
        confirmDonorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDonorBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 153, 153));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(confirmDonorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(confirmDonorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmDonorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDonorBtnActionPerformed
        int selectedRow= donorDetailsTable.getSelectedRow();
        if(selectedRow >= 0){
            OrganMatchingWorkRequest organMatchRequest = (OrganMatchingWorkRequest) donorDetailsTable.getValueAt(selectedRow, 0);
            if(!organMatchRequest.getStatus().equalsIgnoreCase("Closed")){
              if(organMatchRequest.getResult().equalsIgnoreCase("Organ Matched")){
                for(WorkRequest request : stateNetwork.getWorkQueue().getWorkRequestList()){
                    if(((FindDonorRequest)request).getPatientDetails().getPatientID() == organMatchRequest.getPatient().getPatientID()){
                        stateNetwork.getWorkQueue().getWorkRequestList().remove(request);
                        ((FindDonorRequest)request).setDonor(organMatchRequest.getDonor());
                        
                        stateNetwork.getWorkQueue().getWorkRequestList().add(request);
                        
                        organMatchRequest.getDonor().setIsAvailable(false);
                        changeRequestStatus(organMatchRequest);
                        JOptionPane.showMessageDialog(null, "Donor assigned to the request!");
                        break;
                    }
                }
            } else{
                  JOptionPane.showMessageDialog(null, "Can't assign this donor as Organ match test failed");
              }
            }else{
                JOptionPane.showConfirmDialog(null, "Donor is already assigned");
            }
            
            
            
        }
        
    }//GEN-LAST:event_confirmDonorBtnActionPerformed
    
    public void changeRequestStatus(OrganMatchingWorkRequest organMatchRequest){
        for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            if(((OrganMatchingWorkRequest)(request)).getPatient().getPatientID() == organMatchRequest.getPatient().getPatientID()){
                request.setStatus("Closed");
            }
        }
        populateTable();
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void donorDetailsTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_donorDetailsTablePropertyChange
       int selectedRow= donorDetailsTable.getSelectedRow();
        if(selectedRow >= 0){
           OrganMatchingWorkRequest organMatchRequest = (OrganMatchingWorkRequest) donorDetailsTable.getValueAt(selectedRow, 0);
            if(!organMatchRequest.getStatus().equalsIgnoreCase("Closed") && organMatchRequest.getResult().equalsIgnoreCase("Organ Matched")){
                  confirmDonorBtn.setEnabled(true);
            }
        }
      
    }//GEN-LAST:event_donorDetailsTablePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmDonorBtn;
    private javax.swing.JTable donorDetailsTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
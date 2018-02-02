/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SurgeonRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
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
 * @author Neha
 */
public class SurgeriesWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form ProcurementSurgeriesWorkQueue
     */
    public SurgeriesWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.business=business;
        this.network=network;
        
        populateSurgeries();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        surgeryWorkQueueTable = new javax.swing.JTable();
        viewSurgeryBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel1.setText(" Scheduled Surgeries");

        surgeryWorkQueueTable.setBackground(new java.awt.Color(204, 255, 255));
        surgeryWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Surgery Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(surgeryWorkQueueTable);

        viewSurgeryBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewSurgeryBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        viewSurgeryBtn.setForeground(new java.awt.Color(255, 153, 153));
        viewSurgeryBtn.setText("View Surgery Details>>");
        viewSurgeryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSurgeryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(viewSurgeryBtn)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(viewSurgeryBtn)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewSurgeryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSurgeryBtnActionPerformed
        int selectedRow= surgeryWorkQueueTable.getSelectedRow();
        if (selectedRow>=0)
        {
            FindDonorRequest request= (FindDonorRequest)surgeryWorkQueueTable.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Procurement Pending"))
            {
            ProcurementSurgeryDetailsPanel procurementSurgeryDetailsPanel = new ProcurementSurgeryDetailsPanel(userProcessContainer,request);
            userProcessContainer.add("procurementSurgeryDetailsPanel", procurementSurgeryDetailsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }
            else if (request.getStatus().equals("Procurement Complete,Transplant Pending"))
                {       
            TransplantationSurgeryDetailsPanel transplantationSurgeryDetailsPanel = new TransplantationSurgeryDetailsPanel(userProcessContainer,request);
            userProcessContainer.add("transplantationSurgeryDetailsPanel", transplantationSurgeryDetailsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

            }
            else{
            ProcurementAndTransplantSurgeryDetails transplantationSurgeryDetailsPanel = new ProcurementAndTransplantSurgeryDetails(userProcessContainer,request);
            userProcessContainer.add("transplantationSurgeryDetailsPanel", transplantationSurgeryDetailsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
                
            }
        }
        
        else{
            
            JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewSurgeryBtnActionPerformed
    
    
    public void populateSurgeries() {
        surgeryWorkQueueTable.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
       DefaultTableModel model = (DefaultTableModel) surgeryWorkQueueTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = ((FindDonorRequest) request).getStatus();
            model.addRow(row);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable surgeryWorkQueueTable;
    private javax.swing.JButton viewSurgeryBtn;
    // End of variables declaration//GEN-END:variables

    
}
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
import Business.Organization.Organization;
import Business.RegCenter.Donor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Neha
 */
public class StateAdminWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private Network stateNetwork;

    /**
     * Creates new form StateAdminWorkArea
     */
    public StateAdminWorkArea(JPanel userProcessContainer, UserAccount account, Network stateNetwork,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.stateNetwork = stateNetwork;
        populateTree();
       // populateDonorList();
      // populatePatientList();
    }

    public void populateTree() {
        DefaultTreeModel treeModel = (DefaultTreeModel) NetworkJTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;
        Network stateNetwork;
        Network cityNetwork;

        DefaultMutableTreeNode rootNetwork = new DefaultMutableTreeNode("Network");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
        root.removeAllChildren();
        root.insert(rootNetwork, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode stateNetworkNode;
        DefaultMutableTreeNode cityNetworkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getNetworkName());
            rootNetwork.insert(networkNode, i);
            for (int j = 0; j < network.getSubNetwork().size(); j++) {
                stateNetwork = network.getSubNetwork().get(j);
                if (stateNetwork.getUserAccountDirectory().getUserAccountList().get(0).getUsername().equals(account.getUsername())) {
                    stateNetworkNode = new DefaultMutableTreeNode(stateNetwork.getNetworkName());
                    networkNode.insert(stateNetworkNode, 0);
                    for (int k = 0; k < stateNetwork.getSubNetwork().size(); k++) {
                        cityNetwork = stateNetwork.getSubNetwork().get(k);
                        cityNetworkNode = new DefaultMutableTreeNode(cityNetwork.getNetworkName());
                        stateNetworkNode.insert(cityNetworkNode, k);

                        enterpriseList = cityNetwork.getEnterpriseDirectory().getEnterpriseList();
                        for (int a = 0; a < enterpriseList.size(); a++) {
                            enterprise = enterpriseList.get(a);
                            enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                            cityNetworkNode.insert(enterpriseNode, a);

                            organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                            for (int b = 0; b < organizationList.size(); b++) {
                                organization = organizationList.get(b);
                                organizationNode = new DefaultMutableTreeNode(organization.getName());
                                enterpriseNode.insert(organizationNode, b);
                            }
                        }
                    }

                }

            }
        }
        treeModel.reload();
    }
    
    public void populateDonorList(){
        for(Donor donor : system.getMasterDonorDirectory()){
             for(Network countryNetwork : system.getNetworkList()){
                 for(Network stateNetwork : countryNetwork.getSubNetwork()){
                     if(stateNetwork.getNetworkName().equals(this.stateNetwork.getNetworkName())){
                        for(Network cityNetwork : stateNetwork.getSubNetwork()){
                         if(donor.getDonorAddress().trim().equals(cityNetwork.getNetworkName().trim())){
                             stateNetwork.getDonorDirectory().addDonor(donor);
                         }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        NetworkJTree = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        MngEnterpriseBtn = new javax.swing.JButton();
        MngEnterpriseAdminBtn = new javax.swing.JButton();
        manageWorkRequestBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        viewPatientsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NetworkJTree.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        NetworkJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        NetworkJTree.setRowHeight(22);
        jScrollPane2.setViewportView(NetworkJTree);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -5, 180, 750));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        MngEnterpriseBtn.setBackground(new java.awt.Color(0, 0, 0));
        MngEnterpriseBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        MngEnterpriseBtn.setForeground(new java.awt.Color(255, 153, 153));
        MngEnterpriseBtn.setText("Manage Enterprise");
        MngEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MngEnterpriseBtnActionPerformed(evt);
            }
        });

        MngEnterpriseAdminBtn.setBackground(new java.awt.Color(0, 0, 0));
        MngEnterpriseAdminBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        MngEnterpriseAdminBtn.setForeground(new java.awt.Color(255, 153, 153));
        MngEnterpriseAdminBtn.setText("Manage Enterprise Admin");
        MngEnterpriseAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MngEnterpriseAdminBtnActionPerformed(evt);
            }
        });

        manageWorkRequestBtn.setBackground(new java.awt.Color(0, 0, 0));
        manageWorkRequestBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        manageWorkRequestBtn.setForeground(new java.awt.Color(255, 153, 153));
        manageWorkRequestBtn.setText("Manage Work Requests");
        manageWorkRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkRequestBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Manage Organ Matching Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 153));
        jButton2.setText("View Registered Donors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 153));
        jButton3.setText("View Reports");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        viewPatientsButton.setBackground(new java.awt.Color(0, 0, 0));
        viewPatientsButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        viewPatientsButton.setForeground(new java.awt.Color(255, 153, 153));
        viewPatientsButton.setText("View Patient List");
        viewPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MngEnterpriseBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MngEnterpriseAdminBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageWorkRequestBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewPatientsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(MngEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(MngEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageWorkRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPatientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 83, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void MngEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MngEnterpriseBtnActionPerformed
        ManageEnterpriseJPanel manageEnterprise = new ManageEnterpriseJPanel(userProcessContainer, account, system);
        userProcessContainer.add("ManageEnterpriseJPanel", manageEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_MngEnterpriseBtnActionPerformed

    private void MngEnterpriseAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MngEnterpriseAdminBtnActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdmin = new ManageEnterpriseAdminJPanel(userProcessContainer, account, system);
        userProcessContainer.add("ManageEnterpriseAdminJPanel", manageEnterpriseAdmin);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_MngEnterpriseAdminBtnActionPerformed

    private void manageWorkRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkRequestBtnActionPerformed
        StateNetworkManageRequestJPanel manageRequest = new StateNetworkManageRequestJPanel(userProcessContainer,account,stateNetwork, system);
        userProcessContainer.add("ManageNetworkAdminJPanel",manageRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageWorkRequestBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OrganMatchingRequestJPanel organMatchingRequestStatus = new OrganMatchingRequestJPanel(userProcessContainer,account,stateNetwork, system);
        userProcessContainer.add("OrganMatchingRequestJPanel",organMatchingRequestStatus);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegisteredDonorsListJPanel registeredDonors = new RegisteredDonorsListJPanel(userProcessContainer,stateNetwork.getDonorDirectory());
        userProcessContainer.add("RegisteredDonorsListJPanel",registeredDonors);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StateReportsJPanel registeredDonorsReport = new StateReportsJPanel(userProcessContainer,stateNetwork.getDonorDirectory(),stateNetwork.getNetworkPatientDirectory());
        userProcessContainer.add("StateReportsJPanel",registeredDonorsReport);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsButtonActionPerformed
       ViewStatePatientsStateJPanel viewStatePatientsStateJPanel = new ViewStatePatientsStateJPanel(userProcessContainer,stateNetwork.getNetworkPatientDirectory());
        userProcessContainer.add("ViewStatePatientsStateJPanel",viewStatePatientsStateJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MngEnterpriseAdminBtn;
    private javax.swing.JButton MngEnterpriseBtn;
    private javax.swing.JTree NetworkJTree;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton manageWorkRequestBtn;
    private javax.swing.JButton viewPatientsButton;
    // End of variables declaration//GEN-END:variables

    private void populatePatientList() {
        for(Patient patient : system.getMasterPatientList()){
             for(Network countryNetwork : system.getNetworkList()){
                 for(Network stateNetwork : countryNetwork.getSubNetwork()){
                     if(stateNetwork.getNetworkName().equals(this.stateNetwork.getNetworkName())){
                        for(Network cityNetwork : stateNetwork.getSubNetwork()){
                         if(patient.getPatientLocation().trim().equals(cityNetwork.getNetworkName().trim())){
                             stateNetwork.getNetworkPatientDirectory().addPatient(patient);
                         }
                        } 
                     }
                     
                 }
             }
         }
    }
}

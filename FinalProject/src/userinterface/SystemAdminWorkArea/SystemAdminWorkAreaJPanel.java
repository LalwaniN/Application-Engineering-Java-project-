/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

//import Business.EcoSystem;
//import Business.Enterprise.Enterprise;
//import Business.Network.Network;
//import Business.Organization.Organization;
import Business.EcoSystem;
import Business.Enterprise.DonorRegistrationCenter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ApoorvaLakhmani
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount account){
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.system = system;
         this.account=account;
         populateTree();

         userNameLabel.setHorizontalAlignment(HEIGHT);
         userNameLabel.setText(account.getEmployee().getName());


  
     
        
        // manipulateData();
    }
    public void manipulateData(){
        system.getMasterDonorDirectory().clear();
        for(Network network : system.getNetworkList()){
            network.getDonorDirectory().getDonorList().clear();
            for(Network stateNetwork : network.getSubNetwork()){
                stateNetwork.getDonorDirectory().getDonorList().clear();
                for(Network cityNetwork : stateNetwork.getSubNetwork()){
                   
                        for(Enterprise ent : cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        if(ent.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.DonorRegCenter.getValue())){
                            ((DonorRegistrationCenter)ent).getDonorDirectory().getDonorList().clear();
                       }
                    }
                    
                }
            }
        }


    }
    public void populateTree(){
        DefaultTreeModel treeModel = (DefaultTreeModel) NetworkJTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        Network stateNetwork;
        Network cityNetwork;
        
        DefaultMutableTreeNode rootNetwork = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)treeModel.getRoot();
        root.removeAllChildren();
        root.insert(rootNetwork,0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode stateNetworkNode;
        DefaultMutableTreeNode cityNetworkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i = 0; i<networkList.size(); i++){
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getNetworkName());
            rootNetwork.insert(networkNode, i);
            
            for(int j = 0 ; j<network.getSubNetwork().size(); j++){
                stateNetwork = network.getSubNetwork().get(j);
                stateNetworkNode = new DefaultMutableTreeNode(stateNetwork.getNetworkName());
                networkNode.insert(stateNetworkNode, j);
                
                
                for(int k = 0; k<stateNetwork.getSubNetwork().size(); k++){
                   cityNetwork = stateNetwork.getSubNetwork().get(k);
                   cityNetworkNode = new DefaultMutableTreeNode(cityNetwork.getNetworkName());
                   stateNetworkNode.insert(cityNetworkNode, k);
                   
                   enterpriseList = cityNetwork.getEnterpriseDirectory().getEnterpriseList();
                   for(int a = 0; a<enterpriseList.size(); a++){
                      enterprise = enterpriseList.get(a);
                      enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                      cityNetworkNode.insert(enterpriseNode, a);
                
                      organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                
                      for(int b = 0; b< organizationList.size(); b++){
                          organization = organizationList.get(b);
                          organizationNode = new DefaultMutableTreeNode(organization.getName());
                          enterpriseNode.insert(organizationNode, b);
                      }
                    } 
                }
            }         
        }
        treeModel.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        SelectedNodeLabel = new javax.swing.JLabel();
        ViewLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ManageNetBtn = new javax.swing.JButton();
        manageNetworkAdminBtm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        viewPatientsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NetworkJTree = new javax.swing.JTree();

        setLayout(new java.awt.BorderLayout());

        jSplitPane.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectedNodeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        SelectedNodeLabel.setText("Selected Node :");
        jPanel1.add(SelectedNodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 51, 142, 30));

        ViewLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ViewLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ViewLabelPropertyChange(evt);
            }
        });
        jPanel1.add(ViewLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 51, 243, 30));

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageNetBtn.setBackground(new java.awt.Color(0, 0, 0));
        ManageNetBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ManageNetBtn.setForeground(new java.awt.Color(255, 153, 153));
        ManageNetBtn.setText("Manage Network");
        ManageNetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ManageNetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 319, 43));

        manageNetworkAdminBtm.setBackground(new java.awt.Color(0, 0, 0));
        manageNetworkAdminBtm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        manageNetworkAdminBtm.setForeground(new java.awt.Color(255, 153, 153));
        manageNetworkAdminBtm.setText("Manage Country Network Admin");
        manageNetworkAdminBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkAdminBtmActionPerformed(evt);
            }
        });
        jPanel3.add(manageNetworkAdminBtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 319, 41));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("View Registered Donors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 319, 42));

        viewPatientsButton.setBackground(new java.awt.Color(0, 0, 0));
        viewPatientsButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        viewPatientsButton.setForeground(new java.awt.Color(255, 153, 153));
        viewPatientsButton.setText("View Patients");
        viewPatientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(viewPatientsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 319, 42));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 541, 353));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/sysadmin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 80, 100));

        userNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 130, 34));

        userNameLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        userNameLabel1.setText("Welcome !");
        jPanel1.add(userNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 100, 30));

        jSplitPane.setRightComponent(jPanel1);

        NetworkJTree.setBackground(new java.awt.Color(204, 255, 255));
        NetworkJTree.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        NetworkJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        NetworkJTree.setRowHeight(22);
        NetworkJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                NetworkJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(NetworkJTree);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageNetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetBtnActionPerformed
        ManageNetworkJPanel manageNetwork = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageNetworkJPanel",manageNetwork);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageNetBtnActionPerformed

    private void ViewLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ViewLabelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewLabelPropertyChange

    private void NetworkJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_NetworkJTreeValueChanged
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) NetworkJTree.getLastSelectedPathComponent();
        if(selectedNode != null){
            ViewLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_NetworkJTreeValueChanged

    private void manageNetworkAdminBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkAdminBtmActionPerformed
        ManageCountryNetworkAdminJPanel manageNetworkAdmin = new ManageCountryNetworkAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageNetworkAdminJPanel",manageNetworkAdmin);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkAdminBtmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       RegisteredDonorsJPanel donorList = new RegisteredDonorsJPanel(userProcessContainer, system);
       userProcessContainer.add("RegisteredDonorsJPanel",donorList);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewPatientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsButtonActionPerformed
         ViewAllPatientsJPanel viewAllPatientsJPanel = new ViewAllPatientsJPanel(userProcessContainer, system);
       userProcessContainer.add("viewAllPatientsJPanel",viewAllPatientsJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageNetBtn;
    private javax.swing.JTree NetworkJTree;
    private javax.swing.JLabel SelectedNodeLabel;
    private javax.swing.JLabel ViewLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton manageNetworkAdminBtm;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JButton viewPatientsButton;
    // End of variables declaration//GEN-END:variables
}

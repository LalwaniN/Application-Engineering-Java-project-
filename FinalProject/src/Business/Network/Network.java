/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Hospital.PatientDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RegCenter.DonorDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class Network extends Organization{
    
    private String networkName;
    //private UserAccountDirectory userAccountDirectory;
    //private EmployeeDirectory employeeDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> subNetwork;
    private DonorDirectory donorDirectory;
    private PatientDirectory networkPatientDirectory;
    
    public Network(){
        super(Type.StateNetworkAdmin.getValue());
        enterpriseDirectory = new EnterpriseDirectory();
        //employeeDirectory = new EmployeeDirectory();
        //userAccountDirectory = new UserAccountDirectory();
        subNetwork = new ArrayList<>();
        donorDirectory = new DonorDirectory();
        networkPatientDirectory=new PatientDirectory();
    }

    public PatientDirectory getNetworkPatientDirectory() {
        return networkPatientDirectory;
    }

    public void setNetworkPatientDirectory(PatientDirectory statePatientDirectory) {
        this.networkPatientDirectory = statePatientDirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    
    public ArrayList<Network> getSubNetwork() {
        return subNetwork;
    }

    public void setSubNetwork(ArrayList<Network> subNetwork) {
        this.subNetwork = subNetwork;
    }

    
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDirectory = enterpriseDir;
    }

//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }
//
//    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
//        this.userAccountDirectory = userAccountDirectory;
//    }
//
//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
//
//    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
//        this.employeeDirectory = employeeDirectory;
//    }
    
    @Override
    public String toString(){
       return networkName; 
    }
    
    public Network addSubNetwork(){
        Network stateNetwork = new Network();
        subNetwork.add(stateNetwork);
        return stateNetwork;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

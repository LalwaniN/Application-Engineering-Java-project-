/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Hospital.Patient;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RegCenter.Donor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Donor> masterDonorDirectory;
    private ArrayList<Patient> masterPatientList;

    private EcoSystem() {
        super("Ecosystem");
        networkList = new ArrayList<Network>();
        masterDonorDirectory = new ArrayList<>();
        masterPatientList = new ArrayList<>();
    }

    public ArrayList<Donor> getMasterDonorDirectory() {
        return masterDonorDirectory;
    }

    public void setMasterDonorDirectory(ArrayList<Donor> masterDonorDirectory) {
        this.masterDonorDirectory = masterDonorDirectory;
    }

    public ArrayList<Patient> getMasterPatientList() {
        return masterPatientList;
    }

    public void setMasterPatientList(ArrayList<Patient> masterPatientList) {
        this.masterPatientList = masterPatientList;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;

    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public Network createAndNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Hospital.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class MasterPatientDirectory {
    
    private ArrayList<PatientDirectory> masterPatientList;
    
    public MasterPatientDirectory(){
        masterPatientList = new ArrayList<>();
    }

    public ArrayList<PatientDirectory> getMasterPatientList() {
        return masterPatientList;
    }

    public void setMasterPatientList(ArrayList<PatientDirectory> masterPatientList) {
        this.masterPatientList = masterPatientList;
    }
    
}

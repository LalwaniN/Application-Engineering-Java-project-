/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Hospital.Patient;
import Business.RegCenter.Donor;
import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class OrganMatchingWorkRequest extends WorkRequest {

    private Patient patient;
    private Donor donor;
    private boolean tissueMatchResult;
    private boolean organSizeMatchResult;
    private String result;

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public boolean isTissueMatchResult() {
        return tissueMatchResult;
    }

    public void setTissueMatchResult(boolean tissueMatchResult) {
        this.tissueMatchResult = tissueMatchResult;
    }

    public boolean isOrganSizeMatchResult() {
        return organSizeMatchResult;
    }

    public void setOrganSizeMatchResult(boolean organSizeMatchResult) {
        this.organSizeMatchResult = organSizeMatchResult;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}

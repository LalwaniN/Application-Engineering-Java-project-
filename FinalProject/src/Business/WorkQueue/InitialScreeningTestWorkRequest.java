/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.RegCenter.Donor;

/**
 *
 * @author Neha
 */
public class InitialScreeningTestWorkRequest extends WorkRequest{
    private Donor donor;
    private String testResult;

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
    public String toString(){
        return donor.getDonorName();
    }
    
}

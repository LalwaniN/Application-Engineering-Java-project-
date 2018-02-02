/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.RegCenter.DonorDirectory;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class MasterDonorDirectory {
    
    private ArrayList<DonorDirectory> masterDonorList;
    
    public MasterDonorDirectory(){
        masterDonorList = new ArrayList<>();
    }

    public ArrayList<DonorDirectory> getMasterDonorList() {
        return masterDonorList;
    }

    public void setMasterDonorList(ArrayList<DonorDirectory> masterDonorList) {
        this.masterDonorList = masterDonorList;
    }
    
    
    
}

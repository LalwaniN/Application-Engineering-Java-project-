/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegCenter;

import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorDirectory {
    
    private ArrayList<Donor> donorList;

    public DonorDirectory() {
        donorList = new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    public void addDonor(Donor donor){
        donorList.add(donor);
    }
    
    public void deleteDonor(Donor donor){
        donorList.remove(donor);
    }
}

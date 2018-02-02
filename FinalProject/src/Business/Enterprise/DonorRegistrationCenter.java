/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.RegCenter.DonorDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class DonorRegistrationCenter extends Enterprise{
    
    private DonorDirectory donorDirectory;
    

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
    public DonorRegistrationCenter(String name) {
        super(name, EnterpriseType.DonorRegCenter);
        donorDirectory = new DonorDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

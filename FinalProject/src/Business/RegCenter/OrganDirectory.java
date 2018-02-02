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
public class OrganDirectory {
    
    private ArrayList<Organ> organList;
    
    public OrganDirectory(){
        organList = new ArrayList<>();
    }

    public ArrayList<Organ> getOrganList() {
        return organList;
    }

    public void setOrganList(ArrayList<Organ> organList) {
        this.organList = organList;
    }
}


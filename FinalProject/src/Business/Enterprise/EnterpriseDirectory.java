/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.DonorRegCenter){
            enterprise = new DonorRegistrationCenter(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.OrganProcAndTransCenter){
            enterprise = new OrganProcurementAndTransplantationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.LegalEnterprise){
            enterprise = new LegalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;       
    }
    
    
      
}

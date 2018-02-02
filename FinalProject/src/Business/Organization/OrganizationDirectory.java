/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.DonorRegCenter.RegCenterDoctorOrganization;
import Business.Organization.DonorRegCenter.RegCenterLabOrganization;
import Business.Organization.Hospital.HospitalRepOrganization;
import Business.Organization.LegalEnterprise.LegalOrganization;
import Business.Organization.OPTOrganization.OPTEAdminOrganization;
import Business.Organization.OPTOrganization.OPTELabOrganization;
import Business.Organization.OPTOrganization.SurgeonOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new RegCenterDoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RegCenterLab.getValue())){
            organization = new RegCenterLabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Surgeon.getValue())){
            organization = new SurgeonOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OPTELab.getValue())){
            organization = new OPTELabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LegalDepartment.getValue())){
            organization = new LegalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrganTransaplantDeptRep.getValue())){
            organization = new HospitalRepOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OPTEAdmin.getValue())){
            organization = new OPTEAdminOrganization();
            organizationList.add(organization);
        }
//        else if(type.getValue().equals(Type.StateNetworkAdmin.getValue())){
//            organization = new StateNetworkAdminOrganization();
//            organizationList.add(organization);
//        }
        
      
        return organization;
    }
}
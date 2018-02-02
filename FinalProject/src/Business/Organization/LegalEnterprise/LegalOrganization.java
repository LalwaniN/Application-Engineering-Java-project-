/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.LegalEnterprise;

import Business.Organization.Organization;
import Business.Role.LegalRepresentativeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class LegalOrganization extends Organization {
    public LegalOrganization() {
        super(Type.LegalDepartment.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LegalRepresentativeRole());
        return roles;
    }
    
    
}

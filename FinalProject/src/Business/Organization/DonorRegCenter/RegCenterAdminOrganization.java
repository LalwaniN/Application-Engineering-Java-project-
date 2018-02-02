/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DonorRegCenter;

import Business.Organization.Organization;
import Business.Role.RegisterationCenterAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class RegCenterAdminOrganization extends Organization{

    public RegCenterAdminOrganization() {
        super(Type.RegCenterAdmin.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new RegisterationCenterAdminRole());
        return roles;
    }
    
}

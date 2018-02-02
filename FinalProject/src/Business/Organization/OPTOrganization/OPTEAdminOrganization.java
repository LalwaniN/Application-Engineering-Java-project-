/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.OPTOrganization;

import Business.Organization.Organization;
import Business.Role.OPTEAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class OPTEAdminOrganization extends Organization{

    public OPTEAdminOrganization() {
        super(Type.OPTEAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new OPTEAdminRole());
        return roles;
    }
    
}

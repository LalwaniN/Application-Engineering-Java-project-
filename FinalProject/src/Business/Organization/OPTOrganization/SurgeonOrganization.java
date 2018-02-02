/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.OPTOrganization;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SurgeonRole;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class SurgeonOrganization extends Organization {

    public SurgeonOrganization() {
        super(Type.Surgeon.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SurgeonRole());
        return roles;
    }
    
}

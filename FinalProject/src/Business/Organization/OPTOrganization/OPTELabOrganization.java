/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.OPTOrganization;

import Business.Organization.Organization;
import Business.Role.OPTELabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class OPTELabOrganization extends Organization {

    public OPTELabOrganization() {
        super(Type.OPTELab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OPTELabAssistantRole());
        return roles;
    }
    
}

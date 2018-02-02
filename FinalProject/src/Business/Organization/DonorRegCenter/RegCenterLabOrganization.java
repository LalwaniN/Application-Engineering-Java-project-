/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.DonorRegCenter;

import Business.Organization.Organization;
import Business.Role.RegisterationCenterLabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class RegCenterLabOrganization extends  Organization{

    public RegCenterLabOrganization() {
        super(Type.RegCenterLab.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new RegisterationCenterLabAssistantRole());
        return roles;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.registrationcenter.AdministrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author Neha
 */
public class RegisterationCenterAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Network inNetwork, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AdminWorkAreaJPanel(userProcessContainer,account,enterprise,system,inNetwork);
    }
    
}

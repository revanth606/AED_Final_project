/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.UserOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.UserRole.UserWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class UserRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UserWorkAreaJPanel(userProcessContainer, account, (UserOrganization)organization, enterprise);
    }
    
    
}

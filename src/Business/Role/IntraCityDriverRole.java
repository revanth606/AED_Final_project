/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.IntraCityDriver.IntraCityWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class IntraCityDriverRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new IntraCityWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, system);
    }
    
    
}

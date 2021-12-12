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
import ui.InsuranceAgent.InsuranceAgentWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class InsuranceAgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, system);
    }
    
    
}

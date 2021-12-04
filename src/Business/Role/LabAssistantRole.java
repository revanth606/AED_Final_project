/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import ui.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {

   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, network, system);
    }
}

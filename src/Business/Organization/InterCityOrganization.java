/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InterCityDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InterCityOrganization extends Organization{

    public InterCityOrganization() {
        super(Organization.Type.InterCityDriver.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InterCityDriverRole());
        return roles;
    }
     
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SalesPerson.getValue())){
            organization = new SalesPersonsOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.InsuranceAgent.getValue())){
            organization = new InsuranceAgentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.IntraCityDriver.getValue())){
            organization = new IntraCityOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.InterCityDriver.getValue())){
            organization = new InterCityOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
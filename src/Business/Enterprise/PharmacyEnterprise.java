/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Medication.DrugDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class PharmacyEnterprise extends Enterprise {
    
    private DrugDirectory dd;
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmacy);
        dd = new DrugDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public DrugDirectory getAllDrugs() {
        return dd;
    }
    
}

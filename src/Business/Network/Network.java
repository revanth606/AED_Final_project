/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    public ArrayList getEnterpriseList(Enterprise.EnterpriseType enttype) {
        ArrayList<Enterprise> ed = new ArrayList<>();
        for (Enterprise e: this.enterpriseDirectory.getEnterpriseList()) {
            if (e.getEnterpriseType() == enttype) {
                ed.add(e);
            }
        }
        return ed;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}

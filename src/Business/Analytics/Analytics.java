/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.VisitRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author revanthkatha
 */
public class Analytics {
    private EcoSystem system;
    
    public Analytics(EcoSystem ecosystem){
    
        this.system = ecosystem;
    }
    
    public HashMap<String,HashMap<String,Integer>>getNetworkUsers(String networkName){
        HashMap<String,HashMap<String,Integer>> userMap = new HashMap<String,HashMap<String,Integer>>();
        for(Network network : system.getNetworkList()){
            if(network.getName().equals(networkName)){
                for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> orgusers =new HashMap<String,Integer>();
                    orgusers.put("Admins", ent.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization org: ent.getOrganizationDirectory().getOrganizationList()){
                        orgusers.put(org.getName(),org.getUserAccountDirectory().getUserAccountList().size());
                    }
                    userMap.put(ent.getEnterpriseType().getValue(),orgusers);
                }
            }
        
        }
        
        return userMap;
    }
    
    
//    public HashMap<String, Integer> getNetworkRequests(String networkName){
//        HashMap<String, Integer> reqMap = null;
//        int visitRequestCount = 0;
//        ArrayList<VisitRequest> visitRequestList = system.getVisitQueue().getVisitQueue();
//        for(VisitRequest vr : visitRequestList){
//            if(vr.getSourceNetwork().getName().equals(networkName)){
//                visitRequestCount += 1; 
//            }
//        }
//        reqMap.put("Visit Requests", visitRequestCount);
//        
//        return reqMap;
//    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WareHouseQueue;
import Business.WorkQueue.InsuranceQueue;
import Business.WorkQueue.RefillQueue;
import Business.WorkQueue.VisitQueue;
import Business.WorkQueue.VisitRequest;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private VisitQueue visitQueue = new VisitQueue();
    private InsuranceQueue insuranceQueue = new InsuranceQueue();
    private RefillQueue refillQueue = new RefillQueue();
    private WareHouseQueue bulkQueue = new WareHouseQueue();
    
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    public VisitQueue getVisitQueue() {
        return visitQueue;
    }

    public void setVisitQueue(VisitQueue visitQueue) {
        this.visitQueue = visitQueue;
    }
    
    public InsuranceQueue getInsuranceQueue() {
        return insuranceQueue;
    }

    public void setInsuranceQueue(InsuranceQueue insuranceQueue) {
        this.insuranceQueue = insuranceQueue;
    }

    public RefillQueue getRefillQueue() {
        return refillQueue;
    }

    public void setRefillQueue(RefillQueue refillQueue) {
        this.refillQueue = refillQueue;
    }

    public WareHouseQueue getWareHouseQueue() {
        return bulkQueue;
    }

    public void setWareHosueQueue(WareHouseQueue bulkQueue) {
        this.bulkQueue = bulkQueue;
    }
    
}

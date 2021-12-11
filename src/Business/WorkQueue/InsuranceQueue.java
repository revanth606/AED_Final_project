/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author jashwanth
 */
public class InsuranceQueue {
    private ArrayList<InsuranceRequest> insuranceQueue;
    
    public InsuranceQueue() {
        insuranceQueue = new ArrayList<>();
    }
    
    public ArrayList getInsuranceQueue() {
        return insuranceQueue;
    }
    
}

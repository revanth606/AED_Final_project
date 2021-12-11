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
public class RefillQueue {
    private ArrayList<RefillRequest> refillQueue;
    
    public RefillQueue() {
        refillQueue = new ArrayList<>();
    }
    
    public ArrayList getRefillQueue() {
        return refillQueue;
    }
    
}

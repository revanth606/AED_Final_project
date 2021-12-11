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
public class VisitQueue {
    private ArrayList<VisitRequest> visitQueue;
    
    public VisitQueue() {
        visitQueue = new ArrayList<>();
    }
    
    public ArrayList getVisitQueue() {
        return visitQueue;
    }
    
}

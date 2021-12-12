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
public class WareHouseQueue {
    private ArrayList<WarehouseRequest> wareHouseQueue;
    
    public WareHouseQueue() {
        wareHouseQueue = new ArrayList<>();
    }
    
    public ArrayList getWareHouseQueue() {
        return wareHouseQueue;
    }
    
}

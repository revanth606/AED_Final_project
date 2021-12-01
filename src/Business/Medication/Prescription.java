/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medication;

import java.util.ArrayList;

/**
 *
 * @author revanthkatha
 */
public class Prescription {
    private ArrayList<Drug> drugslist;
    
    public Prescription () {
        drugslist = new ArrayList<>();
    }
    
    public ArrayList<Drug> getList() {
        return drugslist;
    }
    
    public void setList(ArrayList<Drug> dl) {
        drugslist = dl;
    }
    
    public void addDrug(Drug d) {
        drugslist.add(d);
    }
}

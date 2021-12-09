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
public class DrugDirectory {
    private ArrayList<Drug> drugDirectory;

    public DrugDirectory() {
        drugDirectory = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(ArrayList<Drug> drugDirectory) {
        this.drugDirectory = drugDirectory;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritance.model;

import java.util.Date;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Chicken extends FarmAnimal{
    
    private boolean isMolting;
    private boolean hasCrest;

    public Chicken(int id, String breed, Date bomOn, boolean molting, boolean hasCrest) {
        super(id, breed, bomOn);
        this.isMolting = molting;
        this.hasCrest = hasCrest;
    }

    public boolean isMolting() {
        return isMolting;
    }

    public void setMolting(boolean molting) {
        this.isMolting = molting;
    }

    public boolean isHasCrest() {
        return hasCrest;
    }

    public void setHasCrest(boolean hasCrest) {
        this.hasCrest = hasCrest;
    }
    
    public boolean layEgg() {
        if (!isMolting) {
            System.out.println("The chicken with " + id + "lay eggs");
        }
        return false;
    }

    @Override
    public String toString() {
        String basicInformation = super.toString();
        return "Chicken{" + basicInformation + " molting: " + isMolting + "\n has crest: " + hasCrest + "\n";
    }
    
    
}

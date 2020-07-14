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
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;
    private boolean horn;

    public Cow(int id, String breed, Date bomOn, boolean isProducingMilk, boolean horn) {
        super(id, breed, bomOn);
        this.isProducingMilk = isProducingMilk;
        this.horn = horn;
    }

    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    public boolean isHorn() {
        return horn;
    }

    public void setHorn(boolean horn) {
        this.horn = horn;
    }

    public void doBellow(){
        System.out.println(" The crow is bellowing\n");
    }
    
    @Override
    public String toString() {
        return "Cow{" +  super.toString() + " isProducingMilk: " + isProducingMilk + "\n has horns: " + horn;
    }
    
    
}

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
public class Pig extends FarmAnimal{
    
    private boolean isCastrated;
    
    public Pig(int id, String breed, Date bomOn, boolean isCastrated) {
        super(id, breed, bomOn);
        this.isCastrated = isCastrated;
    }

    public boolean isIsCastrated() {
        return isCastrated;
    }

    public void setIsCastrated(boolean isCastrated) {
        this.isCastrated = isCastrated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void doCopulate(){
        if(!isCastrated){
            System.out.println(" The pig is ready to copulate\n");
        }
        else{
            System.out.println(" The pig is not ready to copulate\n");
        }
    }

    @Override
    public String toString() {
        return "Pig{" + super.toString() + " is castrated: " + isCastrated +"\n";
    }
    
    
}

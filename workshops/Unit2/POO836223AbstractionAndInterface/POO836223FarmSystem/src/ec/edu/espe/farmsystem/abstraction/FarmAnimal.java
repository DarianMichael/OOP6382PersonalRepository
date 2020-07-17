/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.abstraction;

import java.util.Date;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
    public abstract class FarmAnimal {
    
    protected Date bornOn;
    protected float foodMoney;
    protected float earningMoney;
    private int ageInMonths;
    
    public int computeAgeInMonths(){
        //TODO compute age in months
        System.out.println("Computing age in months of the FarmAnimal");
        return 0;
    }
    
    public abstract float computeEarningMoney(float product, int quantity);
    public abstract float computeFoodMoney(Food food);
}

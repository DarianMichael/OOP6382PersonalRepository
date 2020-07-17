/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.interfaces;

import ec.edu.espe.farmsystem.abstraction.Food;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Chicken implements IFarmAnimal{

    public Chicken() {
    }
    
    @Override
    public float computeEarningMoney(float product, int quantity) {
        System.out.println("Compute earning money for Chicken implements IFarmAnimal");
        return 4.0F;
    }

    @Override
    public float computeFoodMoney(Food food) {
        System.out.println("Compute food money for Chicken implements IFarmAnimal");
        return 6.0F;
    }
    
    
}

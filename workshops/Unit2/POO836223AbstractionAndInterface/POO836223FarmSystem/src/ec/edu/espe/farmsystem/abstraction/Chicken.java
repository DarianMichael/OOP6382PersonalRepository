/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.abstraction;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Chicken extends FarmAnimal{

    public Chicken() {
    }

    @Override
    public float computeEarningMoney(float product, int quantity) {
        System.out.println("Compute earning money in chicken");
        return 0.0F;
    }

    @Override
    public float computeFoodMoney(Food food) {
        System.out.println("Compute food money in chicken");
        return 0.0F;
    }
}

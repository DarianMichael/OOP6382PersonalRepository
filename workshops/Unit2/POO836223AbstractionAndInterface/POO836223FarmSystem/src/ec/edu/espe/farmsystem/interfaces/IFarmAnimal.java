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
public interface IFarmAnimal {

    public abstract float computeEarningMoney(float product, int quantity);

    public abstract float computeFoodMoney(Food food);
}

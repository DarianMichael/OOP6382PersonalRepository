/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.view;

import ec.edu.espe.farmsystem.abstraction.Chicken;
import ec.edu.espe.farmsystem.abstraction.Cow;
import ec.edu.espe.farmsystem.abstraction.FarmAnimal;
import ec.edu.espe.farmsystem.abstraction.Food;
import ec.edu.espe.farmsystem.interfaces.IFarmAnimal;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class FarmSystem {
    
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        //farmAnimal = new FarmAnimal;
        farmAnimal = new Chicken();
        
        System.out.println("Darian M. Martinez ESPE DCCO");
        
        System.out.println("====================Chicken=========================");
        farmAnimal.computeAgeInMonths();
        farmAnimal.computeFoodMoney(new Food());
        farmAnimal.computeEarningMoney(5.0F, 5);
        
        System.out.println("======================Cow===========================");
        farmAnimal = new Cow();
        farmAnimal.computeAgeInMonths();
        
        System.out.println("====================Chicken Implementation======================");
        IFarmAnimal iFarmAnimal;
        iFarmAnimal = new ec.edu.espe.farmsystem.interfaces.Chicken();
        iFarmAnimal.computeEarningMoney(4.0F, 5);
        iFarmAnimal.computeFoodMoney(new Food());
    }
}

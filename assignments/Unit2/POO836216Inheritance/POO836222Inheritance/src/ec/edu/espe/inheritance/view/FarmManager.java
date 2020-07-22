/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritance.view;

import ec.edu.espe.inheritance.model.Chicken;
import ec.edu.espe.inheritance.model.Cow;
import ec.edu.espe.inheritance.model.FarmAnimal;
import ec.edu.espe.inheritance.model.Pig;
import ec.edu.espe.inheritance.model.Sheep;
import java.io.PrintStream;
import java.util.Date;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class FarmManager {
    
    public static void main(String[] args) {
        
        FarmAnimal farmAnimal = new FarmAnimal(0, "holstein",new Date(120,3,13));
        System.out.println("FarmAnimal is the type -->" + farmAnimal.getClass());
        System.out.println("FarmAnimal is -->" + farmAnimal + " age: " + farmAnimal.getAgeInMonths() + " months ago" + "\n}");
        
        farmAnimal = new Chicken(1, "ponedora", new Date(119, 9, 13), true, true);
        System.out.println("FarmAnimal is the type -->" + farmAnimal.getClass());
        System.out.println("Chicken is -->" + farmAnimal + " age: " + farmAnimal.getAgeInMonths() + " months ago" + "\n}");
        
        farmAnimal = new Pig(2, "Canadian", new Date(119, 6, 13), false);
        System.out.println("FarmAnimal is the type -->" + farmAnimal.getClass());
        System.out.println("Pig is -->" + farmAnimal + " age: " + farmAnimal.getAgeInMonths() 
                + " months ago" + "\n}");
        
        Pig pig = new Pig(4, "Criollo", new Date(120, 4, 13), false);
        System.out.println("FarmAnimal is the type -->" + pig.getClass());
        System.out.println("Pig is -->" + pig + " age: " + pig.getAgeInMonths() 
                + " months ago" ); 
        pig.doCopulate();
        
        if(farmAnimal instanceof FarmAnimal){
            System.out.println("FarmAnimal is a FarmAnimal");
        } 
        
        Chicken chicken = new Chicken(3, "de pelea", new Date(),true, false);
        if(chicken instanceof FarmAnimal){
            System.out.println("Chicken is FarmAimal");
        }
        System.out.println("The age is -->" + chicken.getAgeInMonths() + " months\n");
        
        Sheep sheep = new Sheep(5, "Pelibuey", new Date(118, 11, 17), new Date(120, 4,18), false);
        System.out.println("FarmAnimal is the type -->" + sheep.getClass());
        System.out.println("Sheep is -->" + sheep + "\n age: " + sheep.getAgeInMonths() 
                + " months ago" ); 
        sheep.lackingTimeToShear();
        
        Cow cow = new Cow(6, "Hereford", new Date(117, 11, 17), true, false);
        System.out.println("FarmAnimal is the type -->" + cow.getClass());
        System.out.println("Cow is -->" + cow + "\n age: " + cow.getAgeInMonths() 
                + " months ago" ); 
        cow.doBellow();
    }
}

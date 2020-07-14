/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritance.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class FarmAnimal {

    protected int id;
    private String breed;
    private Date bomOn;

    public FarmAnimal(int id, String breed, Date bomOn) {
        this.id = id;
        this.breed = breed;
        this.bomOn = bomOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBomOn() {
        return bomOn;
    }

    public void setBomOn(Date bomOn) {
        this.bomOn = bomOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{\n" + " id: " + id + "\n breed: " + breed + "\n bomOn: " + bomOn + "\n";
    }

    public void run (){
        System.out.println("The animal is run");
    }
    
    public int getAgeInMonths() {
        LocalDate today = LocalDate.now();
        LocalDate ago = (LocalDate)getBomOn().toInstant().
                atZone(ZoneId.systemDefault()).toLocalDate();
        long edad = ChronoUnit.MONTHS.between(ago, today);
        return (int)edad;
    }
}

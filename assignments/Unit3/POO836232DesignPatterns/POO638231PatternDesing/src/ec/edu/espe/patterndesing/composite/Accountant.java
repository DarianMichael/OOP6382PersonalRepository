/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.patterndesing.composite;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Accountant extends Employee{
    
    public Accountant(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Accountant() {
        title = "Accountant";
    }
}

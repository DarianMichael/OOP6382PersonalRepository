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
public abstract class Employee {

    String name = "Not assigned yet";
    String title = "Not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}

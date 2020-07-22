/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoreticalexercise.model;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class C extends B{
    
    public C(F[] array, int s, int t) {
        super(array, s, t);
    }

    @Override
    public String toString() {
        return super.toString() + "C{" + '}';
    }
    
    @Override
    public void m1(){
        System.out.println("Override method m1 in class C");
    }
}

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
public class H extends G{
    
    private I i;

    public H(I i, int c, int v) {
        super(c, v);
        this.i = i;
    }

    @Override
    public String toString() {
        return super.toString() + "H{" + i ;
    }

    @Override
    public void m() {
        System.out.println("Override method m without parameter in the class H");
    }

    @Override
    public void m(int p) {
        System.out.println("Override method m with parameter int p in the class H");
    }

    @Override
    public void m(float q) {
        System.out.println("Override method m with parameter float q in the class H");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromdiagramtocode.model;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class B {

    private C[] cs;

    public B() {
        this.cs = new C[10];
    }

    @Override
    public String toString() {
        return "B{" + "cs=" + cs + '}';
    }
    
    
}

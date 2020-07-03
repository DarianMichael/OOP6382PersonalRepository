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
public class C {
    private E e;
    private E es[];
    private F f;

    public C() {
        this.es = new E[5];
    }
    
    public E m1 (D d){
        return e;
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + ", es=" + es + ", f=" + f + '}';
    }
    
    
}

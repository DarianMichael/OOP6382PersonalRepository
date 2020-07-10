/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo8362.model;

import java.util.ArrayList;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class A {
    
    private B b;
    private D d;
    private ArrayList<C> cs;

    public A(B b, D d, ArrayList<C> cs) {
        this.b = b;
        this.d = d;
        this.cs = cs;
    }

    public void m (E e){
        
    }
    
    public D m (){
        return d;
    }
    
}

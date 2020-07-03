/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromdiagramtocode.view;

import ec.edu.espe.fromdiagramtocode.model.A;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Manager {
    
    public static void main(String[] args) {
        
        A a1= new A();
        A a2= new A();
        A a3= new A();
        A a4= new A();
        A a5= new A();
        
        A as [] = new A[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println(as[i]);
        }
    }
    
}

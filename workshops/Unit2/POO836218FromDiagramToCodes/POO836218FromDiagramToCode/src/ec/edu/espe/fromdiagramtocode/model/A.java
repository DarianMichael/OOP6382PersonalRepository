/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromdiagramtocode.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class A {
    
    private List<B> bs ;

    public A() {
        this.bs = new ArrayList<>();
    }

    public void m (D d){
        
    }
    
    public void m2 (C c){
        
    }

    @Override
    public String toString() {
        return "A{" + "bs=" + bs + '}';
    }

}

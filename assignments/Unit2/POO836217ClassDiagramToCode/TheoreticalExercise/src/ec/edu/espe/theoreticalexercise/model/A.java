/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoreticalexercise.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class A {
    
    private ArrayList<B> bs;

    public A(ArrayList<B> bs) {
        this.bs = bs;
    }

    public List<B> getBs() {
        return bs;
    }

    public void setBs(ArrayList<B> bs) {
        this.bs = bs;
    }

    
    
    @Override
    public String toString() {
        return "A{" + getBs();
    }
    
    
}

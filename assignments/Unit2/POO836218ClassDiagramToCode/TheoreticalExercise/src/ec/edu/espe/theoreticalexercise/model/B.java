/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoreticalexercise.model;

import java.lang.reflect.Array;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class B {
    F fs [] = new H[4];
    private int s;
    private int t;

    public B(F fs [], int s, int t) {
        this.fs = fs;
        this.s = s;
        this.t = t;
    }

    public F[] getFs() {
        return fs;
    }

    public void setFs(F[] fs) {
        this.fs = fs;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    
    
    @Override
    public String toString() {
        String fString = "";
        for(F f : this.fs) {
            fString += f.toString() + "\n";
        }
        return "B{" + fString + ", s: " + s + ", t: " + t + "\n";
    }
    
    public void m1(){
        System.out.println("Method m1 in class B");
    }
}

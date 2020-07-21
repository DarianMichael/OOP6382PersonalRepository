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
public abstract class G implements F{
    
    private int c;
    private int v;

    public G(int c, int v) {
        this.c = c;
        this.v = v;
    }

    @Override
    public String toString() {
        return "G{" + "c: " + c + ", v: " + v + '}';
    }

}

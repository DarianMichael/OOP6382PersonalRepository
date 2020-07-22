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
public class E extends B{
    
    private int u;
    private int y;
    ArrayList<K> ks ;
    J [] js;

    public E(F fs [], int s, int t, int u, int y, ArrayList<K> ks, J[] js) {
        super(fs, s, t);
        this.u = u;
        this.y = y;
        this.ks = ks;
        this.js = js;
    }

    @Override
    public String toString() {
        return super.toString() + "E{" + "u: " + u + ", y: " + y + ", ks: " + ks + ", js: " + js + '}';
    }
    
    
}

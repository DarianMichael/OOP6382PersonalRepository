/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836229liskovp.model;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Coordinate {
    
    int w;
    int y;
    
    public void setPosition(int nextW, int nextY){
        w = nextW;
        y = nextY;
    }
    
    public void move(int shiftW, int shiftY){
        w = w + shiftW;
        y = y + shiftY;
    }
}

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
public class Door {
    Coordinate coordinate;
    int horizontalVertical;//horizontal = 0 ; vertical = 1, orientation

    public Door(Coordinate coordinate, int horizontalVertical) {
        this.coordinate = coordinate;
        this.horizontalVertical = horizontalVertical;
    }
    
    public void open(){
        System.out.println("Opening the door");
    }
    
    public void close(){
        System.out.println("Closing the door");
    }
}

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
public class EndDoor extends Door{

    public EndDoor(Coordinate coordinate, int horizontalVertical) {
        super(coordinate, horizontalVertical);
    }
    
    public boolean win(){
        System.out.println("You´ve won the game");
        return true;
    }
}

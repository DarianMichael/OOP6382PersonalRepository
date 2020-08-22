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
public class Room {

    Wall walls[] = new Wall[3];
    Door doors[] = new Door[3];
    int doorQuantity = 1;
    int wallQuantity = 1;

    public void createDoors(int doorQuantity, Coordinate coordinate[], int horizontalVertical[], boolean open) {
        //Verify/Control no more than 3 doors
        if (doorQuantity <= 3 && doorQuantity > 0) {
            this.doorQuantity = doorQuantity;
            if (doorQuantity + wallQuantity <= 4) {
                System.out.println("Building" + this.doorQuantity + "doors");
                for (int i = 0; i < this.doorQuantity; i++) {
                    //TODO control walls and doors coordinates and orientation
                    doors[i] = new Door(coordinate[i], horizontalVertical[i]);
                    doors[i].open();
                }
            }else{
                System.out.println("Eceeding number of doors and walls");
                return;
            }
        } else {
            System.out.println("Eceeding number of doors and walls");
            return;
        }
    }

    public void createWalls(int wallQuantity, Coordinate coordinate[], int horizontalVertical[]) {
//Verify/Control no more than 3 doors
        if (wallQuantity <= 3 && wallQuantity > 0) {
            this.wallQuantity = wallQuantity;
            if (wallQuantity + wallQuantity <= 4) {
                System.out.println("Building" + this.wallQuantity + "walls");
                for (int i = 0; i < this.wallQuantity; i++) {
                    //TODO control walls and doors coordinates and orientation
                    walls[i] = new Wall(coordinate[i], horizontalVertical[i]);
                }
            }else{
                System.out.println("Eceeding number of doors and walls");
                return;
            }
        } else {
            System.out.println("Eceeding number of doors and walls");
            return;
        }
    }
}

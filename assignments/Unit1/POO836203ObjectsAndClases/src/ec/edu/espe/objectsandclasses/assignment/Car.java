
package ec.edu.espe.objectsandclasses.assignment;

/**
 *
 * @author DARIAN
 */
public class Car {
    private String brand = "Kia";
    private String model = "Picanto";
    private String colour = "Blue";
    private int displacement= 1200;
    private String version = "Full";
    private double price = 17000;
    
    public void goingForward(){
        System.out.println("El auto esta en marcha");
    }
    public void backOf(){
        System.out.println("El auto esta en retroceso");
    }
    public void turnRight(){
        System.out.println("El auto esta girando hacia la derecha");
    }
    public void turnLeft(){
        System.out.println("El auto esta girando hacia la izquierda");
    }
    public void brake(){
        System.out.println("El auto esta frenando");
    }
    
}


package ec.edu.espe.objectsandclasses.model;


public class Coop {
    private int id;
    private Chicken chickens[];

    public Coop(int id, Chicken[] chickens) {
        this.id = id;
        this.chickens = chickens;
    }
    
    public void addChickens(Chicken chicken){
        
    }
    
    public void removeChicken(int chickenId){
        
    }
    
    public void resetIteration(){
        
    }
    
    public Chicken next(){
        return new Chicken(1, "Lucy", "white", 2, false);
    }
}

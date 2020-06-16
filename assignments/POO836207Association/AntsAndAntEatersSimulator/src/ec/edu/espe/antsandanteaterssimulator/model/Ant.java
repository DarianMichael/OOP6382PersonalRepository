package ec.edu.espe.antsandanteaterssimulator.model;

/**
 *
 * @author DARIAN
 */
public class Ant {
    
    private Cell position;
    private int weight;

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void run(){
        
    }
}

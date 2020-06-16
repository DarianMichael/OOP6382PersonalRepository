package ec.edu.espe.antsandanteaterssimulator.model;

import java.util.List;

/**
 *
 * @author DARIAN
 */
public class Cell {
    private int row;
    private int col;
    private List <PheromoneDrop> listaPheromoneDrops;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        
    }
    
    /*public List <Ant> getAnts(){
        List<Ant>listAnts = new List<>();
        
        return listAnts;
    }*/
    
}

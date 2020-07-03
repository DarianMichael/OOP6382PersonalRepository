package ec.edu.espe.antsandanteaterssimulator.model;

import java.util.List;

/**
 *
 * @author DARIAN
 */
public class Nest {
    
    private Cell cell;
    private List<Food> listFood;

    public Nest(Cell cell, List<Food> listFood) {
        this.cell = cell;
        this.listFood = listFood;
    }
    
    
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
    
    
            
}

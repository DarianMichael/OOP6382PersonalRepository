package ec.edu.espe.antsandanteaterssimulator.model;

/**
 *
 * @author DARIAN
 */
public class FoodPile {
    
    private int pileAmount;
    private Cell cell;

    public FoodPile(int pileAmount, Cell cell) {
        this.pileAmount = pileAmount;
        this.cell = cell;
    }

    public int getPileAmount() {
        return pileAmount;
    }

    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
    
    
}

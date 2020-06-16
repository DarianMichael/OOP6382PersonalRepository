package ec.edu.espe.antsandanteaterssimulator.model;

import java.util.List;

/**
 *
 * @author DARIAN
 */
public class Area {
    
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private List <Cell> listaCells;
    private List <FoodPile> listaFoodPiles;
    private List <Colony> listaColonies;
    private List <AntEater> listaAntEaters;
    
    public void setup (){
        
    }
    
    public List <Colony> addColony(Colony colony){
        return null;
    }
    
    public List <AntEater> addAntEaters(AntEater antEater){
        return null;
    }
    
    public void isAnyFoodRemaining (){
        
    }
    
    public Cell getCell(int row, int col){
        Cell cell = new Cell (row,col);
        return cell;
    }
    
    
}


package ec.edu.espe.CollectionsAndArray.view;


import ec.edu.espe.CollectionsAndArray.model.PairOfShoesForWomen;
import ec.edu.espe.CollectionsAndArray.model.PairOfShoesForMen;
import ec.edu.espe.CollectionsAndArray.model.ShoeCategoryByAge;
import ec.edu.espe.CollectionsAndArray.model.TypeOfShoes;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author DARIAN
 */
public class SystemManager {
    public static void main(String[] args) {
        
        Collection listOfPairsOfShoes;
        listOfPairsOfShoes = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
           listOfPairsOfShoes.add(new PairOfShoesForMen(ShoeCategoryByAge.YOUTH,(i+1), "38", "white", "Converse", TypeOfShoes.SPORTS)); 
        }
        
        for (int i = 10; i < 20; i++) {
           listOfPairsOfShoes.add(new PairOfShoesForWomen(ShoeCategoryByAge.ADULTS,(i+1), "34", "white", "Converse", TypeOfShoes.HEELS)); 
        }
        
        for(Object i : listOfPairsOfShoes){
            
            System.out.println(i);
        }
    }
}

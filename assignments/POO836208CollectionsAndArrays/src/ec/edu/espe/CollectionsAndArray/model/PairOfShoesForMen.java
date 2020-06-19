package ec.edu.espe.CollectionsAndArray.model;

/**
 *
 * @author DARIAN
 */
public class PairOfShoesForMen extends PairOfShoes {

    private final String gender = "male";

    private ShoeCategoryByAge shoeCategoryByAge;

    public PairOfShoesForMen(ShoeCategoryByAge shoeCategoryByAge,int idPairOfShoes, String size, String color, String brand, TypeOfShoes typeOfShoes) {
        super(idPairOfShoes,size, color, brand, typeOfShoes);
        this.shoeCategoryByAge = shoeCategoryByAge;
    }

    public ShoeCategoryByAge getShoeCategoryByAge() {
        return shoeCategoryByAge;
    }

    public void setShoeCategoryByAge(ShoeCategoryByAge shoeCategoryByAge) {
        this.shoeCategoryByAge = shoeCategoryByAge;
    }

    @Override
    public String toString() {
        return super.toString()+ "PairOfShoesForMen{" + "gender=" + gender + ", shoeCategoryByAge=" + shoeCategoryByAge + '}';
    }

   


}

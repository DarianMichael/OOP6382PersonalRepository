
package ec.edu.espe.CollectionsAndArray.model;

/**
 *
 * @author DARIAN
 */
abstract class PairOfShoes {
    private int idPairOfShoes;
    private String size;
    private String color;
    private String brand;
    private TypeOfShoes typeOfShoes;

    public PairOfShoes(int idPairOfShoes,String size, String color, String brand, TypeOfShoes typeOfShoes) {
        this.idPairOfShoes = idPairOfShoes;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.typeOfShoes = typeOfShoes;
    }

    public int getIdPairOfShoes() {
        return idPairOfShoes;
    }

    public void setIdPairOfShoes(int idPairOfShoes) {
        this.idPairOfShoes = idPairOfShoes;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public TypeOfShoes getTypeOfShoes() {
        return typeOfShoes;
    }

    public void setTypeOfShoes(TypeOfShoes typeOfShoes) {
        this.typeOfShoes = typeOfShoes;
    }
    
    @Override
    public String toString() {
        return "PairOfShoes{" + "idPairOfShoes=" + idPairOfShoes + ", size=" + size + ", color=" + color + ", brand=" + brand + ", typeOfShoes=" + typeOfShoes + '}';
    }
    
}


package ec.edu.espe.carfile.model;

import java.io.Serializable;


public class Car implements Serializable{
    private String brand;
    private String model;
    private String colour;
    private int displacement;
    private Version version;
    private double price;

    public Car(String brand, String model, String colour, int displacement, Version version, double price) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.displacement = displacement;
        this.version = version;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Car: " + "\nBrand= " + brand + "\nModel= "+ model + "\nColour= " 
                + colour + "\nDisplacement= " + displacement + "\nversion= " 
                + version + "\nprice= " + price;
    }
    
    
}

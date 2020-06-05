
package ec.edu.espe.temperatureconverter.model;


public class Farenheit {
    private double gradeFarenheit;

    public double getGradeFarenheit() {
        return gradeFarenheit;
    }

    public void setGradeFarenheit(double gradeFarenheit) {
        this.gradeFarenheit = gradeFarenheit;
    }

    @Override
    public String toString() {
        return gradeFarenheit+"° Celsius";
    }
    
    
}

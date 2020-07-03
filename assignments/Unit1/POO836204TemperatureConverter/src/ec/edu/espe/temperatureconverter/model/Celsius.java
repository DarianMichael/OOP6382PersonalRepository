
package ec.edu.espe.temperatureconverter.model;


public class Celsius {
    private double gradeCelsius;

    public double getGradeCelsius() {
        return gradeCelsius;
    }

    public void setGradeCelsius(double gradeCelsius) {
        this.gradeCelsius = gradeCelsius;
    }

    @Override
    public String toString() {
        return gradeCelsius+"° Farenheit";
    }
    
    
}

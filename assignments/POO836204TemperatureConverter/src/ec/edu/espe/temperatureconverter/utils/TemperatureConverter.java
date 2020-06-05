/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.temperatureconverter.utils;

import ec.edu.espe.temperatureconverter.model.Celsius;
import ec.edu.espe.temperatureconverter.model.Farenheit;


public class TemperatureConverter {

    public TemperatureConverter() {
    }
    
    public double converterCentigradesToFarenheit(Celsius degrees) {
        double result = degrees.getGradeCelsius();
        result = result * 2 - result / 5;
        result = result + 32;
        return result;
    }
    
    public double converterFarenheitToCentigrades(Farenheit degrees) {
        double result = degrees.getGradeFarenheit() - 32;
        result *= 5;
        result /= 9;
        return result;
    }
}

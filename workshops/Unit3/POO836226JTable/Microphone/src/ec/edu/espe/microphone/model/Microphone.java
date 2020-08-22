/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.microphone.model;

import java.io.Serializable;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Microphone implements Serializable{
    
    private String brand;
    private String color;
    private String impedance;
    private String maxSoundPressure;
    private float sensibility;

    public Microphone(String brand, String color, String impedance, String maxSoundPressure, float sensibility) {
        this.brand = brand;
        this.color = color;
        this.impedance = impedance;
        this.maxSoundPressure = maxSoundPressure;
        this.sensibility = sensibility;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImpedance() {
        return impedance;
    }

    public void setImpedance(String impedance) {
        this.impedance = impedance;
    }

    public String getMaxSoundPressure() {
        return maxSoundPressure;
    }

    public void setMaxSoundPressure(String maxSoundPressure) {
        this.maxSoundPressure = maxSoundPressure;
    }

    public float getSensibility() {
        return sensibility;
    }

    public void setSensibility(float sensibility) {
        this.sensibility = sensibility;
    }

    @Override
    public String toString() {
        return "Microphone{" + "brand=" + brand + ", color=" + color + ", impedance=" + impedance + ", maxSoundPressure=" + maxSoundPressure + ", sensibility=" + sensibility + '}';
    }
    
}

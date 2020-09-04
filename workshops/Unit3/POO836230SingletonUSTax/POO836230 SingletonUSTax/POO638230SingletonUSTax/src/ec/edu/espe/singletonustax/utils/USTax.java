/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.singletonustax.utils;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class USTax {

    private static USTax instance;
    private float taxPercentage;

    private USTax() {
        this.taxPercentage = 12;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float getSingletonData() {
        return taxPercentage;
    }

    public float salesTotal(float price) {
        float priceTotal;
        priceTotal = (taxPercentage/100)*price + price;
        return priceTotal;
    }
}

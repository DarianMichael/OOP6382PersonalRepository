/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.util;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class BasicOperations {
     
    public float add(float addend1, float addend2){
        float addition;
        addition = addend1 + addend2;
        return addition;
    }
    
    public float subtract(float minuend, float subtrahend){
        float differece;
        differece = minuend - subtrahend;
        return differece;
    }
    
     public float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
     
      public float divide(float dividend, float divisor){
        float quocient;
        quocient = dividend / divisor;
        return quocient;
    }
}


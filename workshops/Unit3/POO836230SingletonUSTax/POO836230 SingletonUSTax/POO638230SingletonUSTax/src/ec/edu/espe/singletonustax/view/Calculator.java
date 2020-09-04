/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.singletonustax.view;

import ec.edu.espe.singletonustax.utils.USTax;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Darian M. Martinez --> NRC: 6382");
        float price = 10;
       
        USTax tax = USTax.getInstance();
       

        System.out.println("tax percentage --> " + tax.getSingletonData());
        System.out.println("Price (tax) --> " + price * tax.getSingletonData()/100);
        System.out.println("Price total-->" + tax.salesTotal(price));
        
        USTax tax2 = USTax.getInstance();
        System.out.println("tax percentage --> " + tax2.getSingletonData());
    }
}

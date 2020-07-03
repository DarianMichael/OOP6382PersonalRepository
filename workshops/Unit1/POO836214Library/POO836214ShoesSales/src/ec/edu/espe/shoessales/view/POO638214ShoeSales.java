/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.shoessales.view;

import ec.edu.espe.taxlibrary.Tax;

/**
 *
 * @author DARIAN
 */
public class POO638214ShoeSales {
    
     /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float price=0;
        float totalPrice=0;
        //TODO
        float ivaPercentage=12;
        //TODO code to from the keyboard
        price = 10;
        totalPrice = Tax.computeTotalIva(price, ivaPercentage);
        System.out.println("Darian Martinez ---> NRC: 6382");
        System.out.println("the total price of ->"+price+"<- is: "+totalPrice);
    }

}


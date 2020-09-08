/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.behaviourpatterns.observer;

import ec.edu.espe.behaviourpatterns.observer.Investor;
/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Application {
    
    public static void main(String[] args) {
        System.out.println("Darian M. Martinez ESPE DCCO --> NRC: 6382\n");
        Investor s = new Investor("Sorros");
        Investor b = new Investor("Berkshire");
        
        IBM ibm = new IBM("IBM", 120.00);
        ibm.addObserver(s);
        ibm.addObserver(b);
        
        ibm.setPrice(120.10);
        ibm.setPrice(121.10);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);
        ibm.setSymbol("IBM TEST");
    }
    
}

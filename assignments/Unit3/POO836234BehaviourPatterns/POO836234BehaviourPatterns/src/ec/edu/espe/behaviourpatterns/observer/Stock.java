/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.behaviourpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
abstract class Stock {
    
    protected String symbol;
    protected double price;
    private ArrayList investors = new ArrayList();

    public Stock() {
    }
    
    public void addObserver(IInvestor iInvestor){
        investors.add(iInvestor);
    }
    
    public void deleteObsever(IInvestor iInvestor){
        investors.remove(iInvestor);
    }
    
    public void notifyObservers(Object object){
        Iterator it = investors.iterator();
        while(it.hasNext()){
            IInvestor iInvestor = (IInvestor)it.next();
            iInvestor.update(this,object);
        }
    }
}

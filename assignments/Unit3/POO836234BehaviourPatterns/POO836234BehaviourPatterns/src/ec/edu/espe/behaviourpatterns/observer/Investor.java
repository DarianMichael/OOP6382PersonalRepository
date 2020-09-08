/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.behaviourpatterns.observer;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Investor implements IInvestor {

    private String name;
    private String observerState;
    private Stock stock;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock, Object object) {
        System.out.println("Notified observer " + name);
        if (object instanceof String) {
            System.out.println("The symbol of " + stock.symbol
                    + " changed to: " + object);
        } else if (object instanceof Double) {
            System.out.println("The price of " + stock.symbol
                    + " changed to: " + object);
        }

    }

}

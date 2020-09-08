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
public interface IInvestor {
    
    abstract void update (Stock stock, Object object);
}

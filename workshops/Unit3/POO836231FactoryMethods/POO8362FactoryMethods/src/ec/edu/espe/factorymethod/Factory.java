/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factorymethod;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
abstract class Factory {

    public Factory() {
    }

    protected abstract Connection createConnection(String type);

}

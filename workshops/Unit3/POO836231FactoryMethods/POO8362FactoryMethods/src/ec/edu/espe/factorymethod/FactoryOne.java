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
public class FactoryOne extends Factory {

    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySqlConnection();
        }
    }
}

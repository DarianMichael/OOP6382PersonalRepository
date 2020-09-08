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
public class MySqlConnection extends Connection{

    public MySqlConnection() {
    }
    
    public String description(){
        return "MySQL";
    }
}

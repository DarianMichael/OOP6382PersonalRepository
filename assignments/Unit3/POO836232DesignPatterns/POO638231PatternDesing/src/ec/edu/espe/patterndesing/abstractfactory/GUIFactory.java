/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.patterndesing.abstractfactory;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = 0;
        //(readFromConfigFile("hoal".char));
        if (sys == 0) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }

    public abstract Button createButton();

    public abstract Menu createMenu();

    public String readFromConfigFile(String type) {
        return type;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.patterndesing.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return answer = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Tea.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }
}

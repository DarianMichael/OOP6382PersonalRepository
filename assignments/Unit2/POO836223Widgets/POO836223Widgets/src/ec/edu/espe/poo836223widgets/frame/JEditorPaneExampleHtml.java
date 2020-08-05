/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836223widgets.frame;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class JEditorPaneExampleHtml{
    
    JFrame myFrame = null;  

    public JEditorPaneExampleHtml() {
    }
    
    public void test() {    
        myFrame = new JFrame("JEditorPane Test HTML");    
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        myFrame.setBounds(400, 200, 400, 200);    
        JEditorPane myPane = new JEditorPane();    
        myPane.setContentType("text/html");    
        myPane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a healthy body."    
                + " But sleeping in unnecessary times may spoil our health, wealth and studies."    
                + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>");    
        myFrame.setContentPane(myPane);    
        myFrame.setVisible(true);    
    }    
}

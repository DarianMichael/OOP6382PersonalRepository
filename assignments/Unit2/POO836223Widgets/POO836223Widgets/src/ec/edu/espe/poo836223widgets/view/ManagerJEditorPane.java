/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.poo836223widgets.view;

import ec.edu.espe.poo836223widgets.frame.JEditorPaneExample;
import ec.edu.espe.poo836223widgets.frame.JEditorPaneExampleHtml;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class ManagerJEditorPane {
    
    public static void main(String[] args) {    
        
        JEditorPaneExampleHtml editorPaneExampleHtml = new JEditorPaneExampleHtml(); 
        editorPaneExampleHtml.test();
        
        JEditorPaneExample editorPaneExample = new JEditorPaneExample();
        editorPaneExample.test();
    }    
}

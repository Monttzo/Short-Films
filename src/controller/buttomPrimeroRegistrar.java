/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.frame;
import view.frameRegistrar;

/**
 *
 * @author ADMIN
 */
public class buttomPrimeroRegistrar implements ActionListener{
    public frame marco;
    public frameRegistrar marcoRegistrar = new frameRegistrar();
    /**
     * 
     * 
     */
    public buttomPrimeroRegistrar(frame marco){
        this.marco = marco; 
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        marcoRegistrar.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.cortoDocumentalesDAOJD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.alertframe;
import view.frameRegistrar;

/**
 *
 * @author ADMIN
 */
public class buttonSegundoRegistrar implements ActionListener {
    public frameRegistrar marco;
    boolean verdadNombre;
    boolean verdadApellido;
    boolean verdadNacionalidad;
    public cortoDocumentalesDAOJD accion = new cortoDocumentalesDAOJD();
    /**
     * 
     * @param marco 
     */
    public buttonSegundoRegistrar(frameRegistrar marco){
        this.marco = marco;
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String Nombre = marco.Nombre.getText();
        String Apellido = marco.Apellido.getText();
        String Nacionalidad = marco.Nacionalidad.getText();
        /**
         * Verifica si alguno de los datos son numericos y establece true o false
         */
        try {
            Double.parseDouble(Nombre);
            verdadNombre = true;
        } catch(NumberFormatException ex) {
            verdadNombre = false;
        }
        try {
            Double.parseDouble(Apellido);
            verdadApellido = true;
        } catch (NumberFormatException ex){
            verdadApellido = false;
        }
        try {
            Double.parseDouble(Nacionalidad);
            verdadNacionalidad = true;
        } catch(NumberFormatException ex){
            verdadNacionalidad = false;
        }
        /**
         * Evalua si alguno de los datos esta vacio, luego evalua si son numericos
         */
        if (Nombre.isEmpty() || Apellido.isEmpty() || Nacionalidad.isEmpty()){
            alertframe alerta = new alertframe();
            alerta.opcion(2);
            alerta.setVisible(true);
        } else if (verdadNombre == true || verdadApellido == true || verdadNacionalidad == true){
            alertframe alerta = new alertframe();
            alerta.opcion(2);
            alerta.setVisible(true);
        } else {
            accion.Registrar(marco , Nombre, Apellido, Nacionalidad);
        }
    }
    
}

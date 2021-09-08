/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.directores;
import view.frameRegistrar;

/**
 *
 * @author ADMIN
 */
public interface cortoDocumentalesDAO {
    public ArrayList<directores> Consultar(String filtroColumna, String filtroString);
    public void Registrar(frameRegistrar marco, String Nombre, String Apellido, String Nacionalidad);
    
}

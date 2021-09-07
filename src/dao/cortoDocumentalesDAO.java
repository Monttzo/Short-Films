/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.directores;

/**
 *
 * @author ADMIN
 */
public interface cortoDocumentalesDAO {
    public ArrayList<directores> Consultar(String filtroColumna, String filtroString);
    
}

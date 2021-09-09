package controller;

import dao.cortoDocumentalesDAOJD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.directores;

import view.frame;
/**
 * 
 * @author ADMIN
 */
public class buttomConsultar implements ActionListener{
    public frame marco;
    public cortoDocumentalesDAOJD consulta= new cortoDocumentalesDAOJD();
    public ArrayList<directores> misDirectores = new ArrayList<>();
    public int c;
    public int i;
    /**
     * 
     * @param marco 
     */
    public buttomConsultar(frame marco) {
        this.marco= marco;
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String filtroColumna=(String)marco.comboBox.getSelectedItem();
        String filtroString=marco.Filtro.getText();
        misDirectores = consulta.Consultar(filtroColumna, filtroString);
        i = 0;
        c = 0;
        String [] header = {"id","Nombre","Apellido","Nacionalidad"};
        String [][] datos = new String[misDirectores.size()][4];
            while (c < misDirectores.size()) {
                i = 0;
                while(i < 4){
                    datos[c][i] = misDirectores.get(c).opcion(i);
                    i++;
                }
                System.out.println(c);
                c++;
            }
            marco.crearTabla(datos, header);
            misDirectores.clear();		
    }
}

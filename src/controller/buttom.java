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
public class buttom implements ActionListener{
    public frame marco;
    public cortoDocumentalesDAOJD consulta= new cortoDocumentalesDAOJD();
    public ArrayList<directores> misDirectores = new ArrayList<>();
    public int c;
    /**
     * 
     * @param marco 
     */
    public buttom(frame marco) {
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
        c = 0;
        limpiarTextArea();
            while (c < misDirectores.size()) {                
                marco.textArea.append(misDirectores.get(c).getId());
                marco.textArea.append(", ");
                marco.textArea.append(misDirectores.get(c).getNombre());
                marco.textArea.append(", ");
                marco.textArea.append(misDirectores.get(c).getApellido());
                marco.textArea.append(", ");
                marco.textArea.append(misDirectores.get(c).getNacionalidad());
                marco.textArea.append("\n");
                c++;
                
            }misDirectores.clear();		
    }
    public void limpiarTextArea(){
        marco.textArea.setText(null);
    }
}

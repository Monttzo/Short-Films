package controller;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import view.frame;

public class loadCheckBox extends WindowAdapter{
	frame marco;
	public loadCheckBox(frame marco){
		this.marco=marco;
			
	}
	
        @Override
	public void windowOpened(WindowEvent e) {
		
		try {
                    ArrayList<String> lista = new ArrayList<>();
                    lista.add("*");
                    lista.add("Nombre");
                    lista.add("Apellido");
                    lista.add("Nacionalidad");
                    int i = 0;
                    while(i<lista.size()) {
                        marco.comboBox.addItem(lista.get(i));
                        i++;
                    }			
		}catch(Exception e1){	
		}
	}	
}

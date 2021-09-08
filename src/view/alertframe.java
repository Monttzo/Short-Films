/**
 * Ventana para mostrar alertas
 */
package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ADMIN
 */
public class alertframe extends JFrame {
    public int opcion;
    public JLabel labelAlert1;
    public JPanel contentPane;
    /**
     * Metodo constructor
     */
    public alertframe(){
        initComponents();
    }
    /**
     * Metodo initComponents
     */
    public void initComponents(){
        /**
         * Da propiedades a la ventana
         */
        setTitle("Alert");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 300, 100);
        /**
         * Crea la ventana
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * Crea un label para mostrar el texto de la alerta
         */
        
            
        
    }
    public void opcion(int opcion){
        switch(opcion){
            case 1 -> {
                labelAlert1 = new JLabel("Casilla de filtro vacia o Usuario inexistente");
                labelAlert1.setBounds(10, 20, 300, 21);
                contentPane.add(labelAlert1);
            }
            case 2 -> {
                labelAlert1 = new JLabel("Casillas vacias o invalidas");
                labelAlert1.setBounds(10, 20, 300, 21);
                contentPane.add(labelAlert1);
            }
            case 3 -> {
                labelAlert1 = new JLabel("Usuario registrado correctamente");
                labelAlert1.setBounds(10, 20, 300, 21);
                contentPane.add(labelAlert1);
            }
        }
    }
}

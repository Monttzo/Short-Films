package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.buttomPrimeroRegistrar;
import controller.buttomConsultar;
import controller.loadCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 * 
 * @author ADMIN
 */
public class frame extends JFrame {
    /**
     * 
     */
    private JPanel contentPane;
    public JComboBox comboBox;
    public JComboBox comboBox_1;
    public JButton btnNewButton2;
    public JButton btnNewButton;
    public JTextArea textArea;
    public JTextField Filtro;
    public JLabel labelFiltro;
    public JTable tabla;
    public DefaultTableModel mod;
    /**
     * Metodo Constructor
     */
    public frame() {
        initComponents();
    }
    /**
     * Metodo initComponents
     */
    public void initComponents(){
        /**
         * Da propiedades a la ventana 
         */
        setTitle("Directores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        /**
         * Crea la ventana
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * Crea un checkbox
         */
        comboBox = new JComboBox();
        comboBox.setBounds(10, 204, 80, 21);
        contentPane.add(comboBox);
        /**
         * Crea un label y un cuadro de texto
         */
        labelFiltro = new JLabel("Filtro:");
        labelFiltro.setBounds(100, 204, 85, 21);
        contentPane.add(labelFiltro);
        Filtro = new JTextField();
        Filtro.setBounds(140, 204, 85, 21);
        contentPane.add(Filtro);
        /**
         * Crea un boton para registrar
         */
        btnNewButton2 = new JButton("Registrar");
        btnNewButton2.setBounds(241, 204, 89, 21);
        contentPane.add(btnNewButton2);
        /**
         * Crea un boton para buscar
         */
        btnNewButton = new JButton("Buscar");
        btnNewButton.setBounds(341, 204, 85, 21);
        contentPane.add(btnNewButton);
        /**
         * Crea los action listener
         */
        btnNewButton2.addActionListener(new buttomPrimeroRegistrar(this));
        btnNewButton.addActionListener(new buttomConsultar(this));
        addWindowListener(new loadCheckBox(this));
    }
    /**
     * Crea una tabla
     * @param datos
     * @param header 
     */
    public void crearTabla(String[][] datos, String[] header){
        mod = new DefaultTableModel(datos,header);
        tabla = new JTable(mod);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 10, 416, 173);
        contentPane.add(scroll);
        tabla.enable(false);
    }
}

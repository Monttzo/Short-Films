package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.buttom;
import controller.loadCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    public JButton btnNewButton;
    public JTextArea textArea;
    public JTextField Filtro;
    public JLabel labelFiltro;
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
         * Crea un boton para buscar
         */
        btnNewButton = new JButton("Buscar");
        btnNewButton.setBounds(341, 204, 85, 21);
        contentPane.add(btnNewButton);
        /**
         * Crea un area de texto
         */
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 416, 173);
        contentPane.add(textArea);
        textArea.setEditable(false);
        /**
         * Crea los action listener
         */
        btnNewButton.addActionListener(new buttom(this));
        addWindowListener(new loadCheckBox(this));
    }
}

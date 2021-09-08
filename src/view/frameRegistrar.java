/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.buttonSegundoRegistrar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ADMIN
 */
public class frameRegistrar extends JFrame{
    public JPanel contentPane;
    public JLabel labelNombre;
    public JTextField Nombre;
    public JLabel labelApellido;
    public JTextField Apellido;
    public JLabel labelNacionalidad;
    public JTextField Nacionalidad;
    public JButton Registrar;
    /**
     * Metodo constructor
     */
    public frameRegistrar(){
        initComponents();
    }
    /**
     * Metodo initComponents
     */
    public void initComponents(){
        /**
         * Da propiedades a la ventana
         */
        setTitle("Registrar");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        /**
         * Crea la ventana
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        /**
         * Crea un label y un JTextField para registrar el nombre
         */
        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10, 20, 100, 21);
        contentPane.add(labelNombre);
        Nombre = new JTextField();
        Nombre.setBounds(100, 20, 100, 21);
        contentPane.add(Nombre);
        /**
         * Crea un label y un JTextField para registrar el apellido
         */
        labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(10, 60, 100, 21);
        contentPane.add(labelApellido);
        Apellido = new JTextField();
        Apellido.setBounds(100, 60, 100, 21);
        contentPane.add(Apellido);
        /**
         * Crea un label y un JTextField para registrar la nacionalidad
         */
        labelNacionalidad = new JLabel("Nacionalidad:");
        labelNacionalidad.setBounds(10, 100, 100, 21);
        contentPane.add(labelNacionalidad);
        Nacionalidad = new JTextField();
        Nacionalidad.setBounds(100, 100, 100, 21);
        contentPane.add(Nacionalidad);
        /**
         * Crea un boton para registrar
         */
        Registrar = new JButton("Registrar");
        Registrar.setBounds(250, 50, 100, 42);
        contentPane.add(Registrar);
        /**
         * Crea el action listener para el boton registrar
         */
        Registrar.addActionListener(new buttonSegundoRegistrar(this));
        
        
    }
}

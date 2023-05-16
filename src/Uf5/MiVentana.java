/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author pomo6989
 */
public class MiVentana extends JFrame{

    public MiVentana() {
        super("Titulo ventana");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("nombre: ");
        JTextField cuadroDeTexto= new JTextField(20);
        JButton botonSaludo = new JButton("Saludar");
        
        cp.add(etiqueta);
        cp.add(cuadroDeTexto);
        cp.add(botonSaludo);
        
        botonSaludo.addActionListener(new eventoSaludo(cuadroDeTexto));
    }
    
}

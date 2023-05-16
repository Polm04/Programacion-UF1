/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 *
 * @author pomo6989
 */
public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void añadir_lavel() {
        JLabel etiqueta = new JLabel("Hello world");

        //asociamos la etiqueta a la ventana
        this.getContentPane().add(etiqueta);
    }
    
    public void añadir_button() {
        JButton boton = new JButton("boton");

        this.getContentPane().add(boton);
    }

    public void añadirCheckBox(){
        JCheckBox CheckBox = new JCheckBox("Caja de verificacion");
        
        this.getContentPane().add(CheckBox);
    }
    
    public void añadir_radio_buton() {
        JRadioButton boton = new JRadioButton("botones de radio");

        this.getContentPane().add(boton);
    }
    
    public void etiquetaBorderLayout(){
        Container contenedor = this.getContentPane();
        
        //indico el Layout del contenedor
        contenedor.setLayout(new BorderLayout());
        
        //hacer etiquetas
        JLabel[]  etiquetas = new JLabel[5];
        
        etiquetas[0]= new JLabel("superior");
        etiquetas[0].setBackground(Color.red);
        
        etiquetas[1]= new JLabel("inferior");
        etiquetas[1].setBackground(Color.gray);
        
        etiquetas[2]= new JLabel("izquierda");
        etiquetas[2].setBackground(Color.GREEN);
        
        etiquetas[3]= new JLabel("derecha");
        etiquetas[3].setBackground(Color.PINK);
        
        etiquetas[4]= new JLabel("centro");
        etiquetas[4].setBackground(Color.ORANGE);
        
        contenedor.add(etiquetas[0], BorderLayout.NORTH);
        contenedor.add(etiquetas[1], BorderLayout.SOUTH);
        contenedor.add(etiquetas[2], BorderLayout.WEST);
        contenedor.add(etiquetas[3], BorderLayout.EAST);
        contenedor.add(etiquetas[4], BorderLayout.CENTER);
        
        for (int i = 0; i <etiquetas.length; i++) {
            etiquetas[i].setHorizontalAlignment(SwingConstants.CENTER);//poner las etiquetas en el centro
            etiquetas[i].setOpaque(true);
        } 
        
    }
    public void BotonesGridLayout(){
        Container contenedor = this.getContentPane();
        
        
        //indico el Layout del contenedor
        GridLayout gl = new GridLayout(4,3);
        gl.setHgap(5);
        gl.setVgap(5);
        contenedor.setLayout(gl);
        
        for (int i = 1; i <=9; i++) {
            contenedor.add(new JButton(String.valueOf(i)));
        }
        
        contenedor.add(new JButton("*"));
        contenedor.add(new JButton("0"));
        contenedor.add(new JButton("#"));
        
        this.setSize(400, 300);
    }
}

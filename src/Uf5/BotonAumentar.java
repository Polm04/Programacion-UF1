/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pomo6989
 */
public class BotonAumentar extends JFrame implements ActionListener {

    JLabel etiqueta;

    public BotonAumentar() {
        super("Titulo ventana");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        etiqueta = new JLabel("1");
        JButton botonAumentar = new JButton("Aumentar");

        cp.add(etiqueta);
        cp.add(botonAumentar);

        botonAumentar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cont= Integer.parseInt(etiqueta.getText());
        cont++;
        String et = String.valueOf(cont);
        etiqueta.setText(et);
    }
}

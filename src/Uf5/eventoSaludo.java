/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pomo6989
 */
public class eventoSaludo implements ActionListener{
    private JTextField CuadroDeTexto;

    public eventoSaludo(JTextField field) {
        this.CuadroDeTexto = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "HOLA "+CuadroDeTexto.getText()+"!");
    }
    
    
}

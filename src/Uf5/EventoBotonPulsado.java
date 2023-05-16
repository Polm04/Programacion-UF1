/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author pomo6989
 */
public class EventoBotonPulsado implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        if (boton.getText().equalsIgnoreCase("Aprietame")) {
            boton.setText("Apretado!!!");
        } else {
            boton.setText("Aprietame");
        }
    }
}

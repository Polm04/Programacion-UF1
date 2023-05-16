/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import javax.swing.JFrame;

/**
 *
 * @author pomo6989
 */
public class HelloWorldGui {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //finestra_principal();
        //Classe_finestra_principal();
        telefono();
    }

    private static void finestra_principal() {
        JFrame window_principal = new JFrame("Hello World");

        //poner el tamaño
        window_principal.setSize(1000, 700); //width(ancho) height(altura)

        //poner la opcion cerrar la pestaña
        window_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //hacerla visible
        window_principal.setVisible(true);
    }
    
    private static void Classe_finestra_principal(){
        VentanaPrincipal ventana = new VentanaPrincipal("hola");
        
        ventana.etiquetaBorderLayout();
//        ventana.añadir_lavel();
//        ventana.añadir_button();
        
        ventana.setVisible(true);
    }
    
    private static void telefono(){
        VentanaPrincipal telefono = new VentanaPrincipal("telefono");
        
        telefono.BotonesGridLayout();
        telefono.setVisible(true);
        
    }
}

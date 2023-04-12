/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class ejercicios {

    public static void main(String[] args) {
        ejercicios app = new ejercicios();

        app.run();
    }

    private void run() {
        //ejercicio1();
        ejercicio2();
    }

    private void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el texto que quieres poner en el fichero");
        String texto = sc.nextLine();

        try {
            FicheroEscrituraCaracteres escritura = new FicheroEscrituraCaracteres("Ficheros\\ejercicio1.txt");

            for (int i = 0; i < texto.length(); i++) {
                escritura.escribirCaracter(texto.charAt(i));
                System.out.println("escribiendo letra..." + texto.charAt(i));
            }
            escritura.cerrarFichero();
            System.out.println("Se a cerrado el fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el texto que quieres poner en el fichero");
        String fichero = sc.nextLine();
        String Frase = "Fichero nuevo";

        try {
            FicheroEscrituraCaracteres escritura = new FicheroEscrituraCaracteres("Ficheros\\" + fichero + ".txt");

            for (int i = 0; i < Frase.length(); i++) {
                escritura.escribirCaracter(Frase.charAt(i));
                System.out.println("escribiendo letra..." + Frase.charAt(i));
            }
            escritura.cerrarFichero();
            System.out.println("Se a cerrado el fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void ejercicio6() {
        
    }
}

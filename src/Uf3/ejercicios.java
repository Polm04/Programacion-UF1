/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.FileNotFoundException;
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
        //ejercicio2();
        ejercicio8();
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

    private void ejercicio8() {
        try {
            FicheroLecturaCaracteres fichero_lec = new FicheroLecturaCaracteres("Ficheros\\Ej8.txt");
            FicheroEscrituraCaracteres fichero_esc_vocales = new FicheroEscrituraCaracteres("Ficheros\\Ej8_vocales.txt");
            FicheroEscrituraCaracteres fichero_esc_consonantes = new FicheroEscrituraCaracteres("Ficheros\\Ej8_consonantes.txt");

            int leer_caracteres = fichero_lec.leerCaracteres();
            char leer_char = fichero_lec.LeerCaracterChar();
            do {
                if (leer_char == 'a' || leer_char == 'e'
                        || leer_char == 'i' || leer_char == 'o'
                        || leer_char == 'u') {
                    fichero_esc_vocales.escribirCaracter(leer_char);
                    System.out.println("vocal");
                } else {
                    fichero_esc_consonantes.escribirCaracter(leer_char);
                    System.out.println("consonante");
                }
                System.out.println("fin");
            } while (!(leer_caracteres == -1));
            fichero_lec.cerrarFichero();

            System.out.println("cerrado");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (FinFicheroException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

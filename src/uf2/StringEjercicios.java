/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.ejercicios;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class StringEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase i sabras los caracters que lleva");
        frase = sc.nextLine();
        int longitud = ContarLetras(frase);
        System.out.println("Tiene " + longitud + " Caracters");
        String Mayuscula = Mayuscula(frase);
        String minuscula = minuscula(frase);
        System.out.println("En mayucula: " + Mayuscula + ", En Minuscula " + minuscula);
        int contador_a = contador(frase);
        System.out.println("Hay " + contador_a + " a");
        int vocales = contar_vocales(frase);
        System.out.println("Hay " + vocales + " vocales");
        sin_espacios(frase);
    }

    public static int ContarLetras(String frase) {
        int longitud = frase.length();
        return longitud;
    }

    public static String Mayuscula(String frase) {
        String Mayuscula = frase.toUpperCase();
        return Mayuscula;
    }

    public static String minuscula(String frase) {
        String minuscula = frase.toLowerCase();
        return minuscula;
    }

    public static int contador(String frase){
        int con_a = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
                con_a++;
            }
        }
        return con_a;
    }

    public static void sin_espacios(String frase) {
        System.out.println("Sin Espacios: "+frase.replace(" ", ""));
    }

    public static int contar_vocales(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'E'
                    || frase.charAt(i) == 'i' || frase.charAt(i) == 'I' || frase.charAt(i) == 'o' || frase.charAt(i) == 'O'
                    || frase.charAt(i) == 'U' || frase.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
//    public static String Buscar_letra() {
//
//    }
}

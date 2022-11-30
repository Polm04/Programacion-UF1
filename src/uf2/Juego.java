/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0, bola = 0, dinero = 100;
        boolean resultado;
        numero = pedirNumero(numero);
        System.out.println("El numero que as elegido es el " + numero);
        bola = caidaBola(bola);
        dinero = pedirDineroApuesta(dinero);
        System.out.println("La bola que a caido es " + bola);
        resultado = comprobarResultado(bola, numero);
        if (resultado == true) {
            System.out.println("As Ganado");
            int ganancias = ganancias(dinero, numero);
            dinero = dinero + ganancias;
            System.out.println("Tinenes " + dinero + " Euros");
        } else {
            System.out.println("As Perdido");
        }
    }

    public static int pedirNumero(int numero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige numero para apostar 1-38");
        numero = sc.nextInt();
        return numero;
    }

    public static int caidaBola(int bola) {
        Random rd = new Random();
        bola = rd.nextInt(38);
        return bola;
    }

//    public static void pintaAsteriscos​(int num) {
//
//    }
//
    public static int pedirDineroApuesta​(int dinero_tienes) {
        Scanner sc = new Scanner(System.in);
        int dinero_apuesta;
        do {
            System.out.println("Cuanto dinero quieres apostar? tienes " + dinero_tienes);
            dinero_apuesta = sc.nextInt();
        } while (dinero_apuesta > dinero_tienes || dinero_apuesta <= 0);
        dinero_tienes = dinero_tienes - dinero_apuesta;
        return dinero_tienes;
    }

    public static boolean comprobarResultado​(int bola, int num_apostado) {
        boolean resultado = false;
        if (bola == num_apostado) {
            resultado = true;
        } else if (bola % 3 == 0 && num_apostado == 37) {
            resultado = true;
        } else if (bola % 2 == 0 && num_apostado == 38) {
            resultado = true;
        }
        return resultado;
    }

    public static int ganancias​(int dinero_apostado, int num_apostado) {
        int ganacias_calculadas = 0;
        if (num_apostado >= 1 && num_apostado <= 36) {
            ganacias_calculadas = dinero_apostado * 35;
        } else if (num_apostado >= 37 && num_apostado <= 38) {
            ganacias_calculadas = dinero_apostado * 2;
        }
        return ganacias_calculadas;
    }

    public static char seguirJugando() {
        Scanner sc = new Scanner(System.in);
        char eleccio;
        do {
            System.out.println("Quieres seguir jugando?(S/N)");
            eleccio = sc.next().charAt(0);
        } while (!(eleccio == 'S' || eleccio == 's' || eleccio == 'n' || eleccio == 'N'));
        return eleccio;
    }

    public static boolean continuarJugando​(char respuesta, int dinero) {
        boolean continuar = false;
        if (respuesta == 's' || respuesta == 'S') {
            continuar = true;
        }
        return false;
    }
}

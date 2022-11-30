/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Jackpot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 10;
        boolean jugar;
        System.out.println("tienes "+saldo +"monedas");
        do {
            int apuesta = Quantitat_apostada(saldo);
            saldo = saldo - apuesta;
            char tirada1 = tirada_disc();
            char tirada2 = tirada_disc();
            char tirada3 = tirada_disc();
            mostrar_tirada(tirada1, tirada2, tirada3);
            int ganancias = Calcular_premi(tirada1, tirada2, tirada3, apuesta);
            if (ganancias == 0) {
                System.out.println("As Perdido");
            } else {
                saldo = ganancias + saldo;
                System.out.println("As ganado " + ganancias + " Monedas");
            }           
            System.out.println("Tienes " + saldo + " Monedas");     
            jugar = Seguir_jugant(saldo);
        } while (!(jugar == false));
    }

    public static int Quantitat_apostada(int saldo) {
        int apuesta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuanto dinero quieres apostar?");
            apuesta = sc.nextInt();
        } while (!(apuesta > 0 && apuesta <= saldo));
        return apuesta;
    }

    public static char tirada_disc() {
        char caracter;
        int aleatori;
        Random rd = new Random();
        aleatori = rd.nextInt(3) + 1;
        if (aleatori == 1) {
            caracter = 'a';
        } else if (aleatori == 2) {
            caracter = 'b';
        } else {
            caracter = 'c';
        }
        return caracter;
    }

    public static void mostrar_tirada(char tirada1, char tirada2, char tirada3) {
        System.out.println("***********************");
        System.out.println(tirada1 + " - " + tirada2 + " - " + tirada3);
        System.out.println("***********************");
    }

    public static int Calcular_premi(char tirada1, char tirada2, char tirada3, int apuesta) {
        int ganancias;
        if (tirada1 == 'a' && tirada2 == 'a' && tirada3 == 'a') {
            ganancias = apuesta + 5;
        } else if (tirada1 == 'b' && tirada2 == 'b' && tirada3 == 'b') {
            ganancias = apuesta + 2;
        } else if (tirada1 == 'c' && tirada2 == 'c' && tirada3 == 'c') {
            ganancias = apuesta * 2;
        } else {
            ganancias = 0;
        }
        return ganancias;
    }

    public static boolean Seguir_jugant(int saldo) {
        boolean jugar = true;
        if (saldo > 25 || saldo <=0) {
            jugar = false;
        }
        return jugar;
    }

}

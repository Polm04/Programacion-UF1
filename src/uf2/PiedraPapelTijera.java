/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
       
    }

    public static int jugada(int player) {
        Scanner sc = new Scanner(System.in);
        int escoger;
        System.out.println("Escoge Piedra (0), papel (1) o tijera(2)");
        escoger = sc.nextInt();
        return escoger;
    }

    public static int ordenador(int maquina) {
        Random rd = new Random();
        maquina = rd.nextInt(2);       
        return maquina;
    }

    public static void imp_jugada(int player) {
        switch (player) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }            
    }

    public static int ganador(int player1, int player2) {
        int ganador = 0;
        int empate = 0;
        if (ganador == player1) {
            ganador = 1;
        } else if (ganador == player2) {
            ganador = 2;
        } else {
            ganador = empate;
        }      
        return ganador;
    }

    public static void win(int ganador) {
        int usuario = 1, ordenador = 0;
        if (ganador == usuario) {
            System.out.println("Ha ganado el usuario");
        } else {
            System.out.println("Ha ganado el ordenador");
        }
    }

    public static void marcador(int point_player1, int point_player2) {
        
    }
}

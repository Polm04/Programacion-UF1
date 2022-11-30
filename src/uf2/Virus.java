/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virus;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dias estara el virus?");
        dia = sc.nextInt();
        int virus = virus(dia);
        System.out.println("Habra " + virus + " Virus");
    }

    public static int virus(int dia) {
        int virus_total;
        if (dia == 1) {
            return 1;
        }
        if (dia > 1) {
            virus_total=3*virus(dia-1);
            return virus_total;
        }
        return 0;
    }
}

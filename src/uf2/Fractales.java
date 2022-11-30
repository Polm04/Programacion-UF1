/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fractales;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Fractales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto mide el cuadrado?");
        cm = sc.nextInt();
        int total = fractal(cm);
        System.out.println("Tiene " + total + " cm");
    }

    public static int fractal(int cm) {
        int total;
        if (cm == 1) {
            return cm*4;
        } else if (cm>1) {
            return 4*cm+4*fractal(cm/2);
        }
        return 0;
    }
}

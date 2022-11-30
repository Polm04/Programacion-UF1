/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torropernadal;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class TorroPerNadal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dias comeras tarta?");
        dia = sc.nextInt();
        int calorias = calorias(dia);
        System.out.println("Habras comido " + calorias + " Calorias");
    }

    public static int calorias(int dia) {
        int calorias;
        if (dia == 1) {
            return 364;
        } else if (dia > 1) {
            if (dia % 3 == 0) {
                calorias = 91+calorias(dia-1);
                return calorias;
            } else {
                calorias = 364+calorias(dia-1);
                return calorias;
            }
        }
        return 0;
    }

}

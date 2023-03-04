/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int milla;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce las millas");
        milla=sc.nextInt();
        
        final int milla_m= 1852;  //esta variable no cambia nunca
        int m= milla* milla_m;
        System.out.println("Son" + m);
        
    }
    
}

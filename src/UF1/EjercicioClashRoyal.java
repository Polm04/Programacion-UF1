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
public class EjercicioClashRoyal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int copa;
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Quantes copes tens?:");
        copa = sc.nextInt();
        
        char carta;
        
        sc.nextLine();//limpiar buffer scaner del nixtInt
        if (copa<2000)
        {
            System.out.println("Tria una d'aquestes 2 cartes:");
            System.out.println("m. Mago Electrico");
            System.out.println("e. Esbirro Mega");
                   
            carta= sc.nextLine().charAt(0);
                      
            switch (carta) {
                case 'm','M'-> System.out.println("Has escollit la carta Mago Electrico");
                case 'e','E' -> System.out.println("Has escollit la carta Esbirro Mega");
                default -> System.out.println("L'opcio que has introduït no correspon a cap carta.");
            }          
           
        }
       
        else if (copa>=2000 && copa<3000)
        {
            System.out.println("Tria una d'aquestes 2 cartes:");
            System.out.println("c.Cavallero");
            System.out.println("b.Bandida");  
           
            carta= sc.nextLine().charAt(0);
           
            switch (carta) {
                case 'c','C' -> System.out.println("Has escollit la carta Cavallero");
                case 'b','B' -> System.out.println("Has escollit la carta Bandida");
                default -> System.out.println("L'opcio que has introduït no correspon a cap carta.");
            }
        }
        else if (copa>=3000)
        {
            System.out.println("Tria una d'aquestes 2 cartes:");
            System.out.println("G.Gigante");
            System.out.println("K.Ejercito de esqueletos");  
           
            carta= sc.nextLine().charAt(0);
           
            switch (carta) {
                case 'g','G' -> System.out.println("Has escollit la carta Gigante");
                case 'k','K' -> System.out.println("Has escollit la carta Ejercito de esqueletos");
                default -> System.out.println("L'opcio que has introduït no correspon a cap carta.");
            }
        }
}  
    
}

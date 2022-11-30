/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesej5;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class FuncionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int millas;
        double kilometros;
        Scanner sc = new Scanner(System.in);      
        
        System.out.println("Pon las millas");
        millas=sc.nextInt();
        kilometros=kilometros(millas);       
    }
    public static double kilometros (double k)
    {     
       k=k*1.60934;
       System.out.println(k);
       return k;
    }
}

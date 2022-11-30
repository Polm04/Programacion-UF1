/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesej9;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class FuncionesEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, numero3;
        int mayor;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Pon tres numeros");
        System.out.println("Pon el primer numero");
        numero1=sc.nextInt();
        System.out.println("Pon el segundo numero");
        numero2=sc.nextInt();
        System.out.println("Pon el tercer numero");
        numero3=sc.nextInt();
        
        mayor=mayor(numero1,numero2);
        mayor=mayor(numero3,mayor);
        System.out.println(mayor);
    }
    
    public static int mayor(int n, int m)
    {
        int mallor = 0;
        if(n>m)
        {
           mallor=n;
        }
        else if(n<m)
        {
            mallor=m;
        }       
        return mallor;
    }
}

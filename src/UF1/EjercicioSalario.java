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
public class EjercicioSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas,h_extra;
        double precio_horas;
        double salario, salario_normales, salario_extra, salario_bruto, salario_neto;
        double tasas;
        final int HORAS_NORMALES=35;
        Scanner sc = new Scanner (System.in);
      
        System.out.println("pon las horas trabajadas");
        horas =sc.nextInt();
        System.out.println("pon el precio de las horas trabajadas");
        precio_horas =sc.nextInt();

        if (horas>HORAS_NORMALES)
        {
            salario_normales=HORAS_NORMALES*precio_horas;
            h_extra= horas - HORAS_NORMALES;
            salario_extra=precio_horas*h_extra*1.5;
            salario= salario_normales+salario_extra;
        }
        else
        {
        salario= horas*precio_horas;
        }
        System.out.println("et pagaran "+ salario +" euros");
        
    }
    
}

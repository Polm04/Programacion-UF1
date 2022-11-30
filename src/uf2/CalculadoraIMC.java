/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.imc;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pes = 0, estatura = 0;
        pes = pes(pes);
        estatura = altura(estatura);
        double indiceIMC = calculoIndiceIMC(estatura, pes);
        System.out.println("Tu indice de IMC es " + indiceIMC);
        interpretarIndiceIMC(indiceIMC);

    }

    public static double calculoIndiceIMC(double estatura, double pes) {
        double calculo = pes / (estatura * 2);
        return calculo;
    }

    public static void interpretarIndiceIMC(double indiceIMC) {
        if (indiceIMC < 18.5) {
            System.out.println("Baix Pes");
        } else if (indiceIMC >= 18.5 && indiceIMC <= 24.99) {
            System.out.println("Normal");
        } else {
            System.out.println("SobrePes");
        }
    }

    public static double pes(double pes) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuanto pesas?");
            pes = sc.nextDouble();
        } while (pes >= 635 || pes <= 0);
        return pes;
    }

    public static double altura(double estatura) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuanto mides?");
            estatura = sc.nextDouble();
        } while (estatura >= 2.75 || estatura <= 0);
        return estatura;
    }

}

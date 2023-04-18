/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class ContarCaracter {
    public static void main(String[] args) {
        ContarCaracter caracter = new ContarCaracter();
        
        caracter.run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge una letra para buscarla");
        char letra =sc.next().charAt(0);
        int letra_ascii;
        int contador=0;
        try {
            FicheroLecturaCaracteres lectura= new FicheroLecturaCaracteres("Ficheros\\buscar_letra.txt");
            do{
                letra_ascii=lectura.leerCaracteres();
                
                if(letra_ascii==letra){
                    System.out.println("Letra "+letra+" encontrada");
                    contador++;
                }
            }while(letra_ascii!=-1);
            lectura.cerrarFichero();
            System.out.println("Fichero cerrado");
            System.out.println("La letra "+letra+" a salido "+contador +" veces");
        } catch (IOException ex) {
            Logger.getLogger(ContarCaracter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

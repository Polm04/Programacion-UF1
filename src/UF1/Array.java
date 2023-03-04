/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1;

/**
 *
 * @author pomo6989
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] notes; // definimos el array
        int nota;

        notes = new int[10];/* te guarda 10 numeros (apartir de que encuentra 
                              el new es cuando empieza a contar)*/
        notes[0] = 3;
        notes[1] = 4;
        notes[2] = 7;
        notes[5] = 1;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Posicio " + i + " conte-> " + notes[i]);    
        }
    }

}

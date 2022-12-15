/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ahorcado {
    public static void main(String[] args) {
        String palabra;
        boolean acierto;
        palabra = ponString("Pon la palabra a adivinar");
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
        
        
        char[] ahorcado = new char[palabra.length()];
        char letra_buscar;
        inicializarGuiones(ahorcado);
        
        int vidas=7;
        do{
        mostrarPalabraConGuiones(ahorcado);
        
        letra_buscar = pedirLetra("Que letra quieres");
        acierto=encontrarLetraBuscada(letra_buscar,palabra,ahorcado);
        
        if (acierto==false)
        {
            //vidas--;
            vidas = vidas - 1;
            dibujar(vidas);
        }
        }while(vidas>0 && !palabraAdivinada(ahorcado));
        if (vidas!=0)
        {
            mostrarPalabraConGuiones(ahorcado);
        }
        
        
    }
    
    
    /**
     * te pedira un string y lo retorna
     * @param pregunta el texto que se mostrara en pantalla
     * @return la palabra introducida
     */
    private static String ponString(String pregunta) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pregunta);
        String respuesta = sc.nextLine();
        return respuesta;
        //return sc.nextLine();
    }   
    
    
    /**
     * pondra todas las posiciones con un guion
     * @param ahorcado 
     */
    private static void inicializarGuiones(char[] ahorcado) {
        for (int i = 0; i < ahorcado.length; i++) {
            ahorcado[i] = '-';
        }
    }
    
    private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }

    /**
     * mostrar todo el array tal como esta
     * @param ahorcado 
     */
    private static void mostrarPalabraConGuiones(char[] ahorcado) {
        System.out.println("palabra a adivinar:");
        for (int i = 0; i < ahorcado.length; i++) {
            System.out.print(ahorcado[i]);
        }
        System.out.println("");
    }

    private static char pedirLetra(String pregunta) {
         Scanner sc = new Scanner(System.in);
        System.out.println(pregunta);
        char respuesta = sc.nextLine().charAt(0);
        return respuesta;
    }

    /**
     * REcorrera el string y si encuentra la letra, la pondra en 
     * la misma posicion en el array de char
     * @param letra_buscar
     * @param palabra String con la letra
     * @param ahorcado con guiones o las letras ya encontradas
     */
    private static boolean encontrarLetraBuscada(char letra_buscar, String palabra, char[] ahorcado) 
    {
        boolean encontrado = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)==letra_buscar)
            {
                ahorcado[i]=letra_buscar;
                encontrado=true;
            }
        }
        return encontrado;
    }

    /**
     * recorre el array y si no encuentra ningun guion 
     * quiere decir que ya he acertado la palabra
     * sino(hay guion) aun no la he acertado
     * @param ahorcado
     * @return true acertado false aun no
     */
    private static boolean palabraAdivinada(char[] ahorcado) {
        //boolean acertado=true;
        for (int i = 0; i < ahorcado.length; i++) {
            if(ahorcado[i]=='-')
            {
                //acertado=false;
                return false;
            }
            
        }
        //return acertado;
        return true;
    }

    
}
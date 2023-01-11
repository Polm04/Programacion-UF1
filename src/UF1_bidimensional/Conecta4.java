/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1_bidimensional;

/**
 *
 * @author pomo6989
 */
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int Filas = 6;
        final int Columnas = 7;

        int[][] tablero = new int[Filas][Columnas];
        String nombre1, nombre2;
        //pedir nombre

    }

    /**
     *
     * @param frase
     * @return
     */
    public static String PedirNoms(String frase) {

        return "";
    }

    /**
     *
     * @return 1 si comença el 1 i el 2 si comença el 2
     */
    public static int tiraInici() {

        return -1;
    }

    /**
     * Muestra el tablero mostrando separadas las filas
     *
     * @param tablero
     */
    public static void MostrarTauler(int[][] tablero) {

    }

    /**
     * retorna char '-' si el valor es 0, 'x' si el valor es un 1,'0' si es un 2
     *
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    public static char Mostrar_casella_usuari(int[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == 0) {
            return '-';
        } else if (tablero[fila][columna] == 1) {
            return 'x';
        } else {
            return '0';
        }
    }
    public static void tirada(int[][] tablero, int turno, int columna) {
        boolean trobat=false;
        for (int i = 0; i < 10; i++) {
            if (tablero[i][columna]==0)
            {
                tablero[i][columna]=turno;
                trobat = true;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

/**
 *
 * @author pomo6989
 */
public class LanzarExcepciones {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int v = -2;
        try {
            ValorPositivo(v);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());//.getMessage cojemos la Exception lanzada
        }
    }

    public static void ValorPositivo(int v) throws Exception {//throws Exception  lanza la exception

        if (v < 0) {
            throw new Exception("Valor no positivo");
        } else {
            v = v * 2;
            System.out.println("v-->" + v);
        }
    }
}

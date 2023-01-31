/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objetos_echos.Punto;

/**
 *
 * @author pomo6989
 */
public class MainPunto {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Punto A = new Punto(5, 0);
        Punto B = new Punto(10, 10);
        Punto C = new Punto(-3, 7);

        System.out.println("Punto A(" + A.getX() + "," + A.getY() + ")");
        System.out.println("Punto B(" + B.getX() + "," + B.getY() + ")");
        System.out.println("Punto C(" + C.getX() + "," + C.getY() + ")");

        A.setX(15);
        B.setY(20);
        C.setX(3);
        C.setY(-3);

        A.imprime();
        B.imprime();
        C.imprime();
        
        A.setXY(0, 0);
        A.imprime();
        
        Punto g =new Punto(1, 1);
        
        g.desplazar(1, 0);
        g.imprime();
    }
}

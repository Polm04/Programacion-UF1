/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objetos_echos.Rectangulo;

/**
 *
 * @author pomo6989
 */
public class RectanguloMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {      
        Rectangulo rectangulo = new Rectangulo(9,8,8,9);
        Rectangulo rectangulo_2 = new Rectangulo(1,2,2,3);
        System.out.println("El rectangulo 1 hace:");
        System.out.println("x:"+rectangulo.getX()+", y: "+rectangulo.getY()+", x_2: "+rectangulo.getX_2()+", y_2: "+rectangulo.getY_2());
        System.out.println("El rectangulo 2 hace:");
        System.out.println("x:"+rectangulo_2.getX()+", y: "+rectangulo_2.getY()+", x_2: "+rectangulo_2.getX_2()+", y_2: "+rectangulo_2.getY_2());
        
        int suma_x=rectangulo.getX()+rectangulo.getX_2();
        int suma_y=rectangulo.getY()+rectangulo.getY_2();
        int perimetro_total=suma_x+suma_y;
        System.out.println("--------------------------------");
        System.out.println("El perimetro de el rectangulo 1 es: "+perimetro_total*2);
        
        int suma2_x=rectangulo_2.getX()+rectangulo_2.getX_2();
        int suma2_y=rectangulo_2.getY()+rectangulo_2.getY_2();
        int perimetro_total2=suma2_x+suma2_y;
        System.out.println("--------------------------------");
        System.out.println("El perimetro de el rectangulo 2 es: "+perimetro_total2*2);
        
        rectangulo.imprimir();
        
    }   
}

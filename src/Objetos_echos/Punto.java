/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Punto {
    private int x;
    private int y;
    
    //constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    //set
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //funciones
    public void imprime(){
        System.out.println("coordenadas: x="+this.x+", "+ "y: "+this.y);    
    }
    
    public void setXY(int x, int y){
        Scanner sc = new Scanner(System.in);
        int coordenada_x, coordenada_y;
        System.out.println("Pon la coordenada x");
        coordenada_x=sc.nextInt();
        System.out.println("Pon la coordenada Y");
        coordenada_y=sc.nextInt();
        
        this.x=coordenada_x;
        this.y=coordenada_y;
    }
    
    public void desplazar(int x, int y){
        Scanner sc = new Scanner(System.in);
        int coordenada_x, coordenada_y;
        System.out.println("Cuanto quieres desplazar la x?");
        coordenada_x=sc.nextInt();
        System.out.println("Cuanto quieres desplazar la Y?");
        coordenada_y=sc.nextInt();
        
        this.x=coordenada_x+x;
        this.y=coordenada_y+y;
    }
   
}

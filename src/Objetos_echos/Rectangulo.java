/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *
 * @author pomo6989
 */
public class Rectangulo {
    private int x;
    private int y;
    private int x_2;
    private int y_2;

    //constructor
    public Rectangulo(int x, int y, int x_2, int y_2) {       
            this.setX(x);
            this.setY(y);
            this.x_2 = x_2;
            this.y_2 = y_2;       
    }

    //get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX_2() {
        return x_2;
    }

    public int getY_2() {
        return y_2;
    }

    //set
    public void setX(int x) {
        if (x < this.x_2) {
            this.x = x;
        }
        else{
            System.err.println("Error al poner el rectangulo: x es mallor que x2");
            this.x_2=x;
        }
    }

    public void setY(int y) {
        if (y < this.y_2) {
            this.y = y;
        }
        else{
            System.err.println("Error al poner el rectangulo: y es mallor que y2");
            this.y_2=y;
        }
    }

    public void setX_2(int x_2) {
        this.x_2 = x_2;
    }

    public void setY_2(int y_2) {
        this.y_2 = y_2;
    }
    
    //funciones
    public void imprimir() {
        System.out.println("Rectangulo ("+ this.getX()+","+this.getY()+")"+" ("+this.getX_2()+","+this.y_2+")");
    }
    
}

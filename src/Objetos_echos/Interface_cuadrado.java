/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import Interface.figura;

/**
 *
 * @author pomo6989
 */
public class Interface_cuadrado  implements figura{

    private float lado;
    
    //constructor
    public Interface_cuadrado(float lado) {
        this.lado = lado;
    }   

    //metodos
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return lado*4f;
    }

    
}

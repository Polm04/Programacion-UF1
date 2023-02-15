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
public class Interface_rectangulo implements figura{
    private float lado;
    private float altura;

    //constructor
    public Interface_rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    //metodos
    @Override
    public float area() {
        return lado*altura;
    }

    @Override
    public float perimetro() {
        return lado*4f;
    }
    
    
}

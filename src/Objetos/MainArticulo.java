/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objetos_echos.Articulo;

/**
 *
 * @author polmr
 */
public class MainArticulo {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
       Articulo camiseta =new Articulo("camiseta", 0, 10);
       camiseta.mostrar();
       
       camiseta.getPVP();
       camiseta.mostrar();
       
       camiseta.getPVPDescuento();
       camiseta.mostrar();
            
       camiseta.existencias();
       camiseta.mostrar();
    }
}

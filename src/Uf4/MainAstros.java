/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_Herencia.Planetas;
import Objetos_Herencia.Satelites;

/**
 *
 * @author pomo6989
 */
public class MainAstros {
    public static void main(String[] args) {
        Satelites satelite_1 =new Satelites(0, "Tierra", 0, 0, 0);
        System.out.println(satelite_1.toString());  
        
        Planetas tierra =new Planetas(0, true, 0, 0, 0);
        System.out.println(tierra.toString());
    }
    
}

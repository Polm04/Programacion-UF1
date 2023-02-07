/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_echos.Botella;
import Objetos_echos.Vaso;


/**
 *
 * @author pomo6989
 */
public class Primera_classe_Objetos {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //funcionament de la maquina
        Botella bottle=new Botella();
        //bottle por defecto el primer constructor
        System.out.println(bottle.GetMaterial());
        System.out.println(bottle.GetCapacitat());
        System.out.println("-"+bottle.GetOberta());
        //bottle por defecto el segundo constructor
        Botella bottle1=new Botella("Vidre", 0);
        
        Vaso glass =new Vaso();
        Vaso glass1 =new Vaso();
        
        //System.out.println(bottle.GetMaterial());
        bottle.SetMaterial("Plastico");
        bottle.SetCaducitat(0);
        //bottle.Material=Plastico
        
//        bottle.material="Vidre";
//        bottle.capacitat=1000;
        System.out.println(bottle.GetMaterial());
//        System.out.println(bottle.capacitat);
//        System.out.println(bottle.liquid_actual);
    }
  
}

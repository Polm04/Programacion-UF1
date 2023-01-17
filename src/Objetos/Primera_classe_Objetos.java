/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

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
        Vaso glass =new Vaso();
        Vaso glass1 =new Vaso();
        
        bottle.SetMaterial("Plastico");
        bottle.SetCaducitat(0);
        
//        bottle.material="Vidre";
//        bottle.capacitat=1000;
        System.out.println(bottle.GetMaterial());
//        System.out.println(bottle.capacitat);
//        System.out.println(bottle.liquid_actual);
    }
  
}

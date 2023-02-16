/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_Herencia.Article;
import Objetos_Herencia.Article_alimentari;
import Objetos_Herencia.Article_alimentari_refrigerat;
import Objetos_Herencia.Article_vestir;

/**
 *
 * @author polmr
 */
public class Herencia_MainArticle {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Article yogurt=new Article("yogurt", "DANONE", 100, "1234567890123");
        System.out.println(yogurt.Mostrar_Article());
        
        Article_alimentari pera =new Article_alimentari("17/05/2018","pera", "DANONE", 100, "1234567");
        pera.getPVP();
        System.out.println(pera.getPreu());
        
        Article_vestir camisa =new Article_vestir(40, "camisa","DANONE", 100, "10123");
        camisa.getPVP();
        
        System.out.println(camisa.getPreu());     
        Article_alimentari_refrigerat gambas =new Article_alimentari_refrigerat(0, "", "", "", 0, "");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author polmr
 */
public class Article_vestir extends Article {

    protected double talla;

    //constructor
    public Article_vestir(double talla, String nom, String Fabricant, int preu, String codiEAN) {
        super(nom, Fabricant, preu, codiEAN);
        this.talla = talla;
    }

    //getter
    public double getTalla() {
        return talla;
    }

    //setter
    public void setTalla(double talla) {
        this.talla = talla;
    }

    //metodos
    public double getPVP() {
        double devolucion;
        if (talla >= 20 && talla <= 30) {
            devolucion=0.9;
             preu=preu-(preu*devolucion);
            return preu;
        }
        else if(talla >= 30 && talla <= 40) {
            devolucion=0.8;
            preu=preu-(preu * devolucion);
            return preu;
        }
        else{
            return preu;
        }
    }

}

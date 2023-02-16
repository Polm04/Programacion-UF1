/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author polmr
 */
public class Article_alimentari_refrigerat extends Article_alimentari {

    protected double temperatura_conservacio;

    //constructor
    public Article_alimentari_refrigerat(double temperatura_conservacio, String data, String nom, String Fabricant, int preu, String codiEAN) {
        super(data, nom, Fabricant, preu, codiEAN);
        this.temperatura_conservacio = temperatura_conservacio;
    }

    //getter
    public double getTemperatura_conservacio() {
        return temperatura_conservacio;
    }

    //setter
    public void setTemperatura_conservacio(double temperatura_conservacio) {
        this.temperatura_conservacio = temperatura_conservacio;
    }

    public boolean se_pudrira(int temperatura) {
        if (temperatura > temperatura_conservacio) {
            return false;
        } else {
            return true;
        }
    }
}

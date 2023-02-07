/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author polmr
 */
public class Article_alimentari extends Article{
    protected String data;
    
    //constructor
    public Article_alimentari(String data, String nom, String Fabricant, int preu, String codiEAN) {
        super(nom, Fabricant, preu, codiEAN);
        this.data = data;
    }
    
    //getter
    public String getData() {
        return data;
    }
    
    //setter
    public void setData(String data) {
        this.data = data;
    }
    
    //metodos
    public double getPVP() {
        double iva = 0.04;
        preu=(preu *iva)+preu;
        return preu;
    }
}

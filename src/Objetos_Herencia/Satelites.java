/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Satelites extends Astros{
    protected int distancia_al_planeta;
    protected String Planeta_al_que_pertenece;
    
    //constructor

    public Satelites (int distancia_al_planeta, String Planeta_al_que_pertenece, int masa, int gravedad, int temperatura_media) {
        super(masa, gravedad, temperatura_media);
        this.distancia_al_planeta =distancia_al_planeta;
        this.Planeta_al_que_pertenece = Planeta_al_que_pertenece;
    }    
    
    //getter
    public int getDistancia_al_sol() {
        return distancia_al_planeta;
    }

    public String isTiene_satelites() {
        return Planeta_al_que_pertenece;
    }
    //setter
    public void setDistancia_al_sol(int distancia_al_sol) {
        this.distancia_al_planeta = distancia_al_sol;
    }

    public void setTiene_satelites(String Tiene_satelites) {
        this.Planeta_al_que_pertenece = Tiene_satelites;
    }
    //metodos

    @Override
    public String toString() {
        return super.toString()+" Satelites"+"{Satelites"+"{distancia_al_planeta=" + distancia_al_planeta + ",Planeta_al_que_pertenece=" +Planeta_al_que_pertenece+ '}';
    
    }    
    @Override
    public void explotar() {
        System.out.println("Soy un satelite y si exploto choco con el planeta");
    }
}

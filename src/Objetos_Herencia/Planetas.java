/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Planetas extends Astros{
    protected int distancia_al_sol;
    protected boolean Tiene_satelites;
    
    //constructor

    public Planetas(int distancia_al_sol, boolean Tiene_satelites, int masa, int gravedad, int temperatura_media) {
        super(masa, gravedad, temperatura_media);
        this.distancia_al_sol = distancia_al_sol;
        this.Tiene_satelites = Tiene_satelites;
    }    
    
    //getter
    public int getDistancia_al_sol() {
        return distancia_al_sol;
    }

    public boolean isTiene_satelites() {
        return Tiene_satelites;
    }
    //setter
    public void setDistancia_al_sol(int distancia_al_sol) {
        this.distancia_al_sol = distancia_al_sol;
    }

    public void setTiene_satelites(boolean Tiene_satelites) {
        this.Tiene_satelites = Tiene_satelites;
    }
    //metodos

    @Override
    public String toString() {
        return super.toString()+" Planetas"+"{distancia_al_sol=" + distancia_al_sol + ", Tiene_satelites=" +Tiene_satelites+ '}';
    }

    @Override
    public void explotar() {
        System.out.println("Los planetas no explotan");
    }
    
    
    
}

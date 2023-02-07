/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *Al ser abstracta no podra instanciar/crear objetos 
 * @author pomo6989
 */
public abstract class Astros {
   protected int masa;
   protected int gravedad;
   protected int radio_ecuatorial;
   
   //constructor
    public Astros(int masa, int gravedad, int temperatura_media) {
        this.masa = masa;
        this.gravedad = gravedad;
        this.radio_ecuatorial = temperatura_media;
    }
   
    //getter
    public int getMasa() {
        return masa;
    }

    public int getGravedad() {
        return gravedad;
    }

    public int getTemperatura_media() {
        return radio_ecuatorial;
    }
    
    //setter
    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public void setTemperatura_media(int temperatura_media) {
        this.radio_ecuatorial = temperatura_media;
    }
    
    //metodos
    @Override
    public String toString() {
        return "Astros{" + "masa=" + masa + ", gravedad=" + gravedad + ", temperatura_media=" + radio_ecuatorial + '}';
    }
    
    public abstract void explotar();
}

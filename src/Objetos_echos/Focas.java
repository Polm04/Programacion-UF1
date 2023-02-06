/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *
 * @author pomo6989
 */
public class Focas {

    public int pes;
    public int edat;
    public int Resistencia;
    public int distancia_recorreguda;
    public int resistencia;

    //constructor
    public Focas(int pes, int edat, int Resistencia, int distancia_recorreguda) {
        this.pes = pes;
        this.edat = edat;
        this.Resistencia = Resistencia;
        this.distancia_recorreguda = distancia_recorreguda;
    }

    //get
    public int getPes() {
        return pes;
    }

    public int getEdat() {
        return edat;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }

    //set
    public void setPes(int pes) {
        if (pes > 140) {
            System.err.println("ERROR AL PONER El peso");
            System.out.println("El peso ahora es: 140");
            this.pes = 140;
        } else {
            this.pes = pes;
        }
    }

    public void setEdat(int edat) {
        if (edat > 15) {
            System.err.println("ERROR AL PONER LA EDAT");
            System.out.println("la edat ahora es: 15");
            this.edat = 15;
        } else {
            this.edat = edat;
        }
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public void setDistancia_recorreguda(int distancia_recorreguda) {
        this.distancia_recorreguda = distancia_recorreguda;
    }

    //funciones
    public void Aumentar_la_resistencia(int resistencia) {
        this.Resistencia += resistencia;
    }

    public void Sprint() {
        int distancia_sprint = this.edat * (200 - this.pes);
        if (this.Resistencia > 0) {
            distancia_sprint *= 2;
            this.Resistencia--;
        }
    }

    @Override
    public String toString() {
        return "Focas{" + "pes=" + pes + ", edat=" + edat + ", Resistencia=" + Resistencia + ", distancia_recorreguda=" + distancia_recorreguda + ", resistencia=" + resistencia + '}';
    }
    
    
}

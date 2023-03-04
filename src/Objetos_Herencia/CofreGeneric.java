/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

import Enum.Cartas_clash;
import java.util.Random;

/**
 *
 * @author pomo6989
 */
public abstract class CofreGeneric {

    //variables
    protected int num_monedas;
    protected Cartas_clash Carta1;
    protected Cartas_clash Carta2;
    protected Cartas_clash Carta3;
    protected int gemas;

    //funcion abstracta
    protected abstract void obrir_cofre();

    //funciones
    public String mostrarCofre() {
        if (this instanceof Cofre_argent) {
            return "Monedas: " + num_monedas + ", Carta1: " + Carta1;
        } else if (this instanceof Cofre_or) {
            return "Monedas: " + num_monedas + ", Carta1: " + Carta1 + " , Carta2: " + Carta2;
        } else {
            return "Monedas: " + num_monedas + ", Carta1: " + Carta1 + " , Carta2: " + Carta2 + " , Carta3: " + Carta3 + ", Gemas: " + gemas;
        }
    }

    protected int trobar_monedas(int min, int max) {
        Random rd = new Random();
        int monedas = rd.nextInt(max)+min;//maximo incluido
        return monedas;
    }

    protected Cartas_clash Carta_seleccionada() {
        Cartas_clash[] cartas_clash = Cartas_clash.values();
        Random rd = new Random();

        int carta_seleccionada = rd.nextInt(cartas_clash.length);
        return cartas_clash[carta_seleccionada];
    }
}

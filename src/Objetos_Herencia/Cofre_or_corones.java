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
public class Cofre_or_corones extends CofreGeneric {

    @Override
    public void obrir_cofre() {
        this.num_monedas=trobar_monedas(1050, 1200);
        this.Carta1=Carta_seleccionada();
        this.Carta2=Carta_seleccionada();
        this.Carta3=Carta_seleccionada();
        this.gemas=cantidad_gemas();
    }

    //metodos
    private int cantidad_gemas() {
        Random rd = new Random();
        int gemas = rd.nextInt(1, (5 + 1));
        return gemas;
    }
}

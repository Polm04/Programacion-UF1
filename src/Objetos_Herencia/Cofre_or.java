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
public class Cofre_or extends CofreGeneric {

    @Override
    public void obrir_cofre() {
        this.num_monedas=trobar_monedas(450, 480);
        this.Carta1=Carta_seleccionada();
        this.Carta2=Carta_seleccionada();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.Objects;

/**
 *
 * @author pomo6989
 */
public class empleado {

    private String nomre;
    private int edat;
    private double salario;

    public empleado(String nomre, int edat, double salario) {
        this.nomre = nomre;
        this.edat = edat;
        this.salario = salario;
    }

    public String damedatos() {
        return "El empleado se llama " + nomre + " tiene " + edat + " años." + "Y un salario de " + salario;
    }

}

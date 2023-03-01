/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author mabardaji
 */
public enum Equipo {
    //creas el objeto(Para crearlos necesitas hacer el constructor...)
    //(..como si lo hicieras para otra classe)
    BARCELONA("F.C.Barcelona",1),MADRID("Real Madrid",2),
    SEVILLA("C.F.Sevilla",3),VILLAREAL("Villareal C.F.",7),
    LLEIDA("Lleida Esportiu",15);
    
    //variables
    private String nombre_equipo;
    private int pos_liga_anterior;

    //constructor
    private Equipo(String nombre_equipo, int pos_liga_anterior) {
        this.nombre_equipo = nombre_equipo;
        this.pos_liga_anterior = pos_liga_anterior;
    }

    //getter
    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public int getPos_liga_anterior() {
        return pos_liga_anterior;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author pomo6989
 */
public enum Cartas_clash {
    //objetos
    Pekka("PEKKA", 7), 
    Leñador("Leñador", 6), 
    Globo ("Globo",4),
    Gigante("Gigante", 1),
    Arqueras("Arqueras", 1);
    
    //variables
    private String Nom;
    private int Elixir;
    private int Arena;

    //constructor
    private Cartas_clash(String Nom, int Elixir) {
        if (Elixir == 8) {
            this.Arena = 10;
        } else if (Elixir == 9) {
            this.Arena = 13;
        }
        this.Nom = Nom;
    }

    //getter
    public String getNom() {
        return Nom;
    }

    public int getElixir() {
        return Elixir;
    }

    public int getArena() {
        return Arena;
    }

}

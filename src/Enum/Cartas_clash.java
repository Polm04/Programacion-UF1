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
    Pekka("PEKKA",7,3);
    private String Nom;
    private int Elixir;
    private int Arena;

    private Cartas_clash(String Nom, int Elixir, int Arena) {
        this.Nom = Nom;
        this.Elixir = Elixir;
        this.Arena = Arena;
    }

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

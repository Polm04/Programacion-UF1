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
    Leñador("Leñador", 4),
    Globo("Globo", 5),
    Gigante("Gigante", 5),
    Arqueras("Arqueras", 2);

    //variables
    private String Nom;
    private int Elixir;
    private int Arena;

    //constructor
    private Cartas_clash(String Nom, int Elixir) {
        this.Nom = Nom;
        this.setElixir(Elixir);
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

    //setter
    public void setElixir(int Elixir) {
        if (Elixir == 8) {
            this.Arena = 10;
            this.Elixir = Elixir;
        } else if (Elixir == 9) {
            this.Arena = 13;
            this.Elixir = Elixir;
        } else {
            this.Arena = Elixir;
            this.Elixir = Elixir;
        }
    }

    //funciones
    @Override
    public String toString() {
        return "{Nom=" + Nom + ", Elixir=" + Elixir + '}';
    }

}

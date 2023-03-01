/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

import java.util.Objects;

/**
 *
 * @author pomo6989
 */
public abstract class Pokemon {
    
    protected final String NomPokemon;
    protected int vida;
    protected boolean viu;
    
    //constructor
    public Pokemon(String NomPokemon) {
        this.NomPokemon = NomPokemon;      
        this.viu = true;
    }
    
    //getter
    public String getNomPokemon() {
        return NomPokemon;
    }

    public int getvida() {
        return vida;
    }

    public boolean isViu() {
        return viu;
    }
    
    
    public abstract boolean RebreAtac(int atac);
    public abstract int atac();
      
    //metodos
    @Override
    public String toString() {
        return "Pokemon{" + "NomPokemon=" + NomPokemon + ", vida=" + vida +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon)) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.NomPokemon, other.NomPokemon);
    }
    
    
}

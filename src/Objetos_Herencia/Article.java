/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

import java.util.Objects;

/**
 *
 * @author polmr
 */
public class Article {

    protected String nom;
    protected String Fabricant;
    protected double preu;
    protected String codiEAN;

    //constructor
    public Article(String nom, String Fabricant, double preu, String codiEAN) {
        this.nom = nom;
        this.Fabricant = Fabricant;
        this.preu = preu;
        this.codiEAN = codiEAN;
    }

    //getter
    public String getNom() {
        return nom;
    }

    public String getFabricant() {
        return Fabricant;
    }

    public double getPreu() {
        return preu;
    }

    public String getCodiEAN() {
        return codiEAN;
    }

    //setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFabricant(String Fabricant) {
        this.Fabricant = Fabricant;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void setCodiEAN(String codiEAN) {
        this.codiEAN = codiEAN;
    }

    //metodos
    public double getPVP() {
        double iva = 0.21;
        preu *= iva+preu;
        return preu;
    }
    
    public String Mostrar_Article() {
        return "Article{" + "nom=" + nom + ", Fabricant=" + Fabricant + ", preu=" + preu + ", codiEAN=" + codiEAN + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Article other = (Article) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.Fabricant, other.Fabricant);
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *
 * @author pomo6989
 */
public class Cromo implements Comparable<Cromo>{

    //variables
    private int Numero;
    private String Descripcion;

    //constructor
    public Cromo(int Numero, String Descripcion) throws DescripcioIncorrecta {
        this.Numero = Numero;
        this.SetDescripcio(Descripcion);
    }

    //getter i setter
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    //funciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Cromo) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.Numero == other.Numero;
    }

    public void SetDescripcio(String descripcio) throws DescripcioIncorrecta {
        if (descripcio.length() > 3) {
            throw new DescripcioIncorrecta();
        } else {
            this.Descripcion = descripcio;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("num: ");
        sb.append(Numero+"/n");// /n para nueva linea
        sb.append("descripcion: ");
        sb.append(Descripcion);
        return sb.toString();
        //return "num=" + num + "-" + descripcio_cromo ;
    }

    @Override
    public int compareTo(Cromo o) {
        return (this.getNumero() - o.getNumero());
    }
    
    
}


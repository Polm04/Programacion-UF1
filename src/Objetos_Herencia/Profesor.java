/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Profesor extends Persona{
    protected int cod_profesor;
    protected String departamento;

    //constructor
    public Profesor(int cod_profesor, String departamento, String DNI, String nombre) {
        super(DNI, nombre);
        this.cod_profesor = cod_profesor;
        this.departamento = "Informatica";
    }
    
    //getter
    public int getCod_profesor() {
        return cod_profesor;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    //setter
    public void setCod_profesor(int cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //funciones
    public String MostrarProfesor() {
        return "Profesor{" + "cod_profesor=" + cod_profesor + ", departamento=" + departamento + '}';
    }

    @Override
    public String toString() {
        return "Profesor{"+"DNI= " +DNI+", Nombre= "+nombre+ ", cod_profesor=" + cod_profesor + ", departamento=" + departamento + '}'; 
    }
    
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *atributos del objeto
 * @author pomo6989
 */
public class Vaso {
    public String material;//de que esta feta la botella
    public int capacitat;// capacitat de la botella maxima
    public boolean ple;//true si esta ple
    public int liquid_actual;//liquit que conte la botella(els l que conte)
    
    
    //constructores---------------------------------------
    public Vaso(){
        this.material="Vidre";
        this.capacitat=100;
        this.ple=false;
        this.liquid_actual=0;       
    }
    public Vaso(String material_vaso){
        this.setMaterial(material);
        this.capacitat=100;
        this.ple=false;
        this.liquid_actual=0;       
    }
    
    //get-------------------------------------------------
    public String GetMaterial(){
        return material;
    }
    public int GetCapacitat(){
        return capacitat;
    }

    public boolean isPle() {
        return ple;
    }

    public int getLiquid_actual() {
        return liquid_actual;
    }
    
    //set---------------------------------------------------

    public void setMaterial(String material_vaso) {
        if(material_vaso.equalsIgnoreCase("vidre") || material_vaso.equalsIgnoreCase("Plastico"))
        {
           this.material = material_vaso;
        }
        else{
            System.out.println("Solo se acepta vidre o plastico");
            this.material="Plastico";
        }
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public void setPle(boolean ple) {
        this.ple = ple;
    }

    public void setLiquid_actual(int liquid_actual) {
        this.liquid_actual = liquid_actual;
    }
      
}

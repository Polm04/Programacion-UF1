/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

/**
 *
 * @author pomo6989
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=2;   
        int calculo=doble(x); /*/hacer variable calculo para que te guarde lo 
                                   devuelto si lo devuelto es char pues sera char i asi*/
                
        System.out.println(calculo);
    }
    
    public static int doble (int a)
    {
    int resultado=a*2;
    return resultado; /* devolver resultado, cuando lo devuelva lo devolera a la 
                         variable que este relacionada la funcion en este caso 
                         con lo que este relacionado con a 
                      */
                      
    }
}

/*
modif_de_funcion tipo_devuelto nombre_funcion (lista de parametros)
{
        //lo que quieras
}
*/
/*
si pone void no devolera nada i si pones el tipo(int,double..) entonces si dovlvera
-ejemplo:
public static int xxxx//tipo(void,int...) (lista de parametros)
{

}                   
*/
//todo lo que este en el mein es lo que se mostrara al ejecutar el programa
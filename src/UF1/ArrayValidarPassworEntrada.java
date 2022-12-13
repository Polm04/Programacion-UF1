/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ArrayValidarPassworEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validacion_contraseña = true;
        boolean validacion_usuario = true;
        String usuario, password;
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon tu Mail");
        usuario = sc.nextLine();
        System.out.println("Pon tu password");
        password = sc.nextLine();

        if (!(usuario.contains("@")) || usuario.contains(" ")) {
            System.out.println("El usuario esta mal");
            validacion_usuario = false;
        }

        if (!(password.length() >= 8) || password.contains(" ")) {
            System.out.println("La contraseña esta mal");
            validacion_contraseña = false;
        }

        if (validacion_contraseña == false || validacion_usuario == false) {
            System.out.println("El usuario y  la contraseña esta mal");
        } else {
            System.out.println("Usuario i password correcto");
        }

    }
}

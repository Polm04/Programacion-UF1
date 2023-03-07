/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class menu {

    //variables
    private String title;
    private List<OptionItem> option_menu;

    //constructor
    public menu(String title) {
        this.title = title;
        option_menu = new ArrayList<OptionItem>();
    }

    //funciones
    public void AddOption(OptionItem afegir, int pos) {
        if (!option_menu.contains(afegir)) {
            option_menu.add(pos, afegir);
        } else {
            System.out.println("Opcio ja afegit");
        }
    }
    
    public void AddOptionByIndex(OptionItem afegir, int pos)
    {
        if (!option_menu.contains(afegir))
        { //si no existeix
            
         option_menu.add(pos, afegir);
        }
        else
        {
            System.out.println("Opció ja afegida");
        }
        
    }

    public int NumeroOpcionsMenu() {
        return option_menu.size();
    }

    public boolean RemoveOption(OptionItem Delete) {
        return option_menu.remove(this);
    }

    public OptionItem RemoverOptionByIndex(int delete_index) {
        return option_menu.remove(delete_index);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("**" + this.title + "**/n");
        build.append("_________________/n");
        for (int i = 0; i < option_menu.size(); i++) {
            build.append(i + option_menu.get(i).toString());
        }
        return build.toString();
    }

    public void DisplayMenu() {
        System.out.println(this.toString());
    }

    public int ChooseOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eligue una opcion (1-" + option_menu.size() + ")");
        int option;
        do {
            option = sc.nextInt();
        } while (!(option > 0 || option <= option_menu.size()));
        return option;
    }
}

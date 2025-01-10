package org.example;

import java.util.Scanner;

public class VolverAlMenu {

    public void opcion_menu_fin(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("   [M] - Volver al menú principal");
        System.out.println("   [X] - Salir");

        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();

        switch (opcion){
            case "M":
                System.out.flush();
                Menu EJERCICIO = new Menu();
                EJERCICIO.desplegable();
                break;
            case "X":
                System.out.println("Fin del programa");
                break;
            default:
                System.out.println("CARACTER INVALIDO");
        }
    }
}

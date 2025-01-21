package org.example;

import java.util.Scanner;

public class Menu {

    public void desplegable(){
        Scanner leer = new Scanner(System.in);

        System.out.flush();

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar");
        System.out.println("   1 - Dígitos");
        System.out.println("   2 - Potencias");
        System.out.println("   3 - Del Revés");
        System.out.println("   4 - Binario");
        System.out.println("   5 - A Binario");
        System.out.println("   6 - Orden alfabético");
        System.out.println("   7 - Mostrar suma");

        int opcion = leer.nextInt();

        if (opcion < 1 ){
            System.out.println("*** ERROR INTENTALO DEVUELTA OPCION INVALIDA***");
            Menu EJERCICIO = new Menu();
            EJERCICIO.desplegable();
        }
        else if (opcion > 7){
            System.out.println("*** ERROR INTENTALO DEVUELTA OPCION INVALIDA***");
            Menu EJERCICIO = new Menu();
            EJERCICIO.desplegable();
        }

        switch (opcion){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
        }

    }
}

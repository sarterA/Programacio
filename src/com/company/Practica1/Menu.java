package com.company.Practica1;
import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;


            do {
                opcion = 0;
                System.out.println("1. Introduir un text nou.");
                System.out.println("2. Veure el text actual.");
                System.out.println("3. Comptar el ńumero de lletres.");
                System.out.println("4. Comptar el numero de paraules.");
                System.out.println("5. Ńumero d’aparicions de cada caracters.");
                System.out.println("6. Dir el caracter ḿes repetit i el numero d’aparicions.");
                System.out.println("7. Dir la paraula ḿes repetida i el ńumero d’aparicions.");
                System.out.println("8. Introduir per teclat un caracter i dir quantes vegades apareix.");
                System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
                System.out.println("10. Salir!");

                System.out.println("Escribe una de las opciones:");

                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Opciones.option1();
                        break;
                    case 2:
                        Opciones.option2();
                        break;
                    case 3:
                        Opciones.option3();
                        break;
                    case 4:
                        Opciones.option4();
                        break;
                    case 5:
                        Opciones.option5();
                        break;
                    case 6:
                        Opciones.option6();
                        break;
                    case 7:
                        Opciones.option7();
                        break;
                    case 8:
                        Opciones.option8();
                        break;
                    case 9:
                        Opciones.option9();
                        break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("solo opciones de 1 a 10.");
                        break;
                }
            }
            while (opcion != 10 );

        }
    }



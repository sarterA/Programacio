package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static int main(String[]args) {

        Scanner sn = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Introduir un text nou.");
            System.out.println("2. Veure el text actual.");
            System.out.println("3. Comptar el ńumero de lletres.");
            System.out.println("4. Comptar el numero de paraules.");
            System.out.println("5. Ńumero d’aparicions de cada caracters.");
            System.out.println("6. Dir el caracter ḿes repetit i el numero d’aparicions.");
            System.out.println("7. Dir la paraula ḿes repetida i el ńumero d’aparicions.");
            System.out.println("8. Introduir per teclat un caracter i dir quantes vegades apareix.");
            System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
            System.out.println("10. Salir!");

            System.out.println("Escribe una de las opciones:");
            opcion = sn.nextInt();

            String frase = "";
            int longitud = 0;
            int conta = 0;
            char caracter = 0;
            String cadena = "";
            int numeroDeVeces = 0;
            int posicion = 0;

            switch (opcion) {
                case 1:
                    System.out.println("Escribe una frase:");
                    frase = sn.nextLine();

                    break;

                case 2:
                    System.out.println("frase: " + frase);
                    break;

                case 3:
                    longitud = frase.length();
                    System.out.println("Hay " +longitud+ " letras");

                    break;
                case 4:
                    StringTokenizer st = new StringTokenizer(frase);
                    System.out.println(st.countTokens());

                    break;
                case 5:


                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.print("Introduce un carácter: ");
                    try {
                        caracter = (char) System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    posicion = cadena.indexOf(caracter);
                    while (posicion != -1) {
                        conta++;
                        posicion = cadena.indexOf(caracter, posicion + 1);
                    }
                    return conta;
                    System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
                    return conta;

                    break;
                case 9:
                    break;
                case 10:

                    break;
                default:
                    System.out.println("solo opciones de 1 a 10.");
            }
        }
            while (opcion != 6) ;



    }
}


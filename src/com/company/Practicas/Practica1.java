package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class  Practica1<opcion> {

//Volem desenvolupar un programa que, a partir d’un text introdu ̈ıt per teclat
//per part de l’usuari, implementi una s`erie de funcions. En concret, el programa
//ha de disposar d’un men ́u que mostri a l’usuari un conjunt d’opcions i aquest
//tri ̈ı la que vol executar.
//Les opcions que s’han de poder aplicar al text śon:

//1. Introduir un text nou.
//2. Veure el text actual.
//3. Comptar el n ́umero de lletres.
//4. Comptar el n ́umero de paraules.
//5. N ́umero d’aparicions de cada car`acters.
//6. Dir el car`acter m ́es repetit i el n ́umero d’aparicions.
//7. Dir la paraula m ́es repetida i el n ́umero d’aparicions.
//8. Introduir per teclat un car`acter i dir quantes vegades apareix.
//9. Introduir per teclat una paraula i dir quantes vegades apareix.

//S’ha de demanar a l’usuari que tri ̈ı una opci ́o nova mentre aquest no decideixi
//sortir (pot ser una altra opci ́o del men ́u).
//Apart de lletres, els car`acters que tamb ́e podr`a contenir el text s ́on ’.’, ’,’, ’?’,
//’!’ i ’:’.

    Scanner sn = new Scanner(System.in);
    boolean salir = false;
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
                System.out.println("Hay " + longitud + " letras");

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

                break;
            case 9:
                String palabraBuscada = sn.nextLine();
                while (frase.indexOf(palabraBuscada) > -1) {
                    frase = frase.substring(frase.indexOf(palabraBuscada)+palabraBuscada.length(),frase.length());
                    conta++;
                }
                System.out.println (conta);

                break;
            case 10:
                salir = true;
                break;
            default:
                System.out.println("solo opciones de 1 a 10.");
        }
    }
        while (opcion != 6);


        return opcion;


}

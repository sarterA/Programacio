package com.company;

public class Stringues {

    public static int[] exe1(String palabra){

        // Desenvolupa un metode que, a partit d'un string, ens digui quantes aparicions hi ha de cada vocal. l'string
        // s'ha de passar per parametre i s'ha de retornar un array amb les aparicions de les vocals

        int[] contador = {0,0,0,0,0};

        // para contar as vogais
        for(int i =0; i < palabra.length(); i++){
            if (palabra.charAt(i) == 'a') { contador[0]++; }
            if (palabra.charAt(i) == 'e') { contador[0]++; }
            if (palabra.charAt(i) == 'i') { contador[0]++; }
            if (palabra.charAt(i) == 'o') { contador[0]++; }
            if (palabra.charAt(i) == 'u') { contador[0]++; }

            return contador;
        }
        System.out.println("hay " +contador+ " jj " );


        return contador;
    }
    public static void exe2(){
// Desenvolupa un metode que ens digui si un string passat per parametre es un palindrom o no


    }
    public static void exe3(){
// Desenvolupa un metode que a partir d'un string, ens digui quantes vegades apareix la primera vocal.

    }
    public static void exe4(){
// Desenvolupa un metode que, a partir d'un string que representa una paraula, ens digui si es parell o
// senar en funcio del numero de caracters que te.

    }
    public static void exe5(){
// Desenvolupa un metode que ens digui a partir d'un string quantes paraulas amb un numero parell de
// caracteres te i quantes amb un numero senar (no fa falta return, es suficient imprimir-ho per pantalla)

    }
    public static void exe6(){
// Desenvolupa un metode que, a partir d'un string, el retorni invertit.

    }
}

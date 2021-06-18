package com.company.Ejercicios;

public class Stringues {

    public static int[] exe1(String palabra) {

        // Desenvolupa un metode que, a partit d'un string, ens digui quantes aparicions hi ha de cada vocal. l'string
        // s'ha de passar per parametre i s'ha de retornar un array amb les aparicions de les vocals

        int[] contador = {0, 0, 0, 0, 0};

        // para contar as vogais
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador[0]++;
            }
            if (palabra.charAt(i) == 'e') {
                contador[0]++;
            }
            if (palabra.charAt(i) == 'i') {
                contador[0]++;
            }
            if (palabra.charAt(i) == 'o') {
                contador[0]++;
            }
            if (palabra.charAt(i) == 'u') {
                contador[0]++;
            }

            return contador;
        }
        return contador;
    }
    public static boolean exe2(String palabra){
    // Desenvolupa un metode que ens digui si un string passat per parametre es un palindrom o no

        boolean exe2 = true;
        for (int i = 0; i < palabra.length() / 2; i++){
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){
                exe2 = false;
                break;
            }
        }
        return exe2;
    }
    public static int exe3(String palabra){
    // Desenvolupa un metode que a partir d'un string, ens digui quantes vegades apareix la primera vocal.

        char[] vocals = {'a','e','i','o','u'};
        char primeraVocal = Character.MIN_VALUE;
        boolean primeraVocalEncontrada = false;
        int exe3 = 0;

        for (int i = 0; i < palabra.length(); i++){
            if (!primeraVocalEncontrada){
                for (int j = 0; j < vocals.length; j++){
                    if (palabra.charAt(i) == vocals[j]){
                        primeraVocal = palabra.charAt(i);
                        primeraVocalEncontrada = true;
                        exe3++;
                    }
                }
            }else if (primeraVocal == palabra.charAt(i)){
                exe3++;
            }
        }
        return exe3;

    }
    public static boolean exe4(String palabra){
    // Desenvolupa un metode que, a partir d'un string que representa una paraula, ens digui si es parell o
    // senar en funcio del numero de caracters que te.

        char[] vocals = {'a','e','i','o','u'};
        int counter = 0;

        for (int i = 0; i < palabra.length(); i++){
            for (int j = 0; j < vocals.length; j++){
                if (palabra.charAt(i) == vocals[j]){
                    counter++;
                }
            }
        }
        if (counter % 2 == 0){
            return true;
        }
        return false;

    }
    public static void exe5(String palabra){
    // Desenvolupa un metode que ens digui a partir d'un string quantes paraulas amb un numero parell de
    // caracteres te i quantes amb un numero senar (no fa falta return, es suficient imprimir-ho per pantalla)

        int numImpa = 0;
        int numPar = 0;
        String palabraActual = "";

        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) != ' '){
                palabraActual += palabra.charAt(i);
            }else {
                if (palabraActual.length() % 2 == 0 ){
                    numPar++;
                }else {
                    numImpa++;
                }
                palabraActual = "";
            }
        }
        System.out.println("palabra com un numero par de caracteres: " + numPar + "\nPalabras con un numero de caracteres impa: " + numImpa);

    }
    public static String exe6(String string){
    // Desenvolupa un metode que, a partir d'un string, el retorni invertit.

        String aux = "";

        for (int i = string.length() - 1; i >= 0; i--){
            aux += string.charAt(i);
        }
        return aux;
        }
}

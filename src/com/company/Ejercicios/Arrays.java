package com.company.Ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.lang.reflect.Array;

public class Arrays {
    private static Scanner scanner;

    public static void exe1() {
        //Declara un array de qualsevol tipus de mida N i imprimeix els seus elements per pantalla
        // (fes-ho primer sense utilitzar un bucle i després utilitzant-ne).

    //primero metodo
        int [] numeros = {2, 4, 6, 8};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    //segundo metodo
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
    }
    public static void exe2() {
        //Llegir N números per teclat i mostrar-los per ordre introduït.

        scanner = new Scanner(System.in);

        int N = 5;
        int [] numeros = new int[N];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("introduzca un numero:");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los numeros introduzidos son: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }
    }
    public static void exe3() {
        //Llegir N números per teclat i mostrar-los en ordre invers a l’introduït.

        scanner = new Scanner(System.in);

        int N = 5;
        int [] numeros = new int[N];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduzca un numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los numeros introduzidos son: ");
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i] + " ");
        }
    }
    public static void exe4(){
        //Demana N números per teclat i guarda’ls dins un array. Després, calcula la suma
        //dels seus elements.

        scanner = new Scanner(System.in);

        int N = 5;
        int [] numeros = new int [N];
        int sum = 0;
        double average;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduzca un numero: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            sum += numeros[i];
        }
        average = (double) sum / numeros.length;
        System.out.println("La suma es: " + average);
    }
    public static void exe5() {
        //Declara un array de caràcters, inicialitza’l, i concatena els seus caràcters en un String.

        char [] chars = {'h','o','l','a'};
        String concat = "";

        for (int i = 0; i < chars.length; i++){
            concat += chars[i];
        }
        System.out.println(concat);
    }
    public static void exe6() {
        //Repeteix l’exercici anterior però amb un array d’enters.

        int [] numeros = {1, 2 , 3, 4};
        String concat = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numeros.length; i++){
            concat += Integer.toString(numeros[i]);
        }
        System.out.println(concat);
    }
    public static void exe7() {
        //Donat un array d’enters, calcula’n la mitjana aritmètica dels seus elements.

        int [] numeros = { 2, 4, 6, 8, 10};
        int sum = 0;
        double average;

        for (int i = 0; i < numeros.length; i++){
            sum += numeros[i];
        }
        average = (double) sum / numeros.length;
        System.out.println("La media es: " + average);
    }
    public static void exe8() {
        //Donats dos arrays d’enters, crea’n un de nou que alterni els elements dels altres dos.
        // Exemple execució: arrayA = [3, 4, 1], arrayB = [2, 7, 5]. Array nou = [3, 2, 4, 7,1, 5].

        int[] arrayA = {3, 4, 1};
        int[] arrayB = {2, 7, 5};
        int[] arrayC = new int[6];

        for (int i = 0; i < arrayA.length; i++){
            arrayC[i * 2] = arrayA[i];
            arrayC[i * 2 + 1] = arrayB[i];
        }
        for (int i = 0; i < arrayC.length; i++){
            System.out.println(arrayC[i] + " ");
        }

    }
    public static void exe9() {
        //Donat un array d’enters ordenats, indicar si estan ordenats creixent o decreixentment.

        int [] numeros = {2, 4, 6, 9, 1};

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 0; i < numeros.length - 1; i++){
            if (numeros[i] > numeros[i+1]){
                isAsc = false;
            }else if (numeros[i] < numeros[i+1]){
                isDesc = false;
            }
        }
        if (isAsc){
            System.out.println("Array ordenado en ascendente");
        }else if (isDesc){
            System.out.println("array ordenado en decrecente");
        }else{
            System.out.println("array no ordenado");
        }
    }
    public static void exe10() {
        //Llegeix números per teclat fins que s’introdueixi un 0. Per a cada número introduït,
        // guarda els positius en un arrayList i els negatius en un altre. En acabar, mostra elcontingut de cada arrayList.

        scanner = new Scanner(System.in);
        int number;

        ArrayList<Integer> positiveNumbers = new ArrayList<Integer>();
        ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

        do {
            System.out.println("Introduz un numero: ");
            number = scanner.nextInt();
            if (number > 0){
                positiveNumbers.add(number);
            }else if (number < 0){
                negativeNumbers.add(number);
            }
        }while(number != 0);

        System.out.println("\nNumeros Positivos introduzidos: ");
        for (int i = 0; i < positiveNumbers.size(); i++){
            System.out.println(positiveNumbers.get(i) + "");
        }
        System.out.println("\nNumeros negativos introduzidos: ");
        for (int i = 0; i < negativeNumbers.size(); i++ ){
            System.out.println(negativeNumbers.get(i) + "");
        }
    }
    public static void exe11() {
        //Demana N caràcters per teclat i guarda’ls dins un array. Després, recórre l’array per saber quantes vegades
        // apareix el caràcter ‘x’.

        scanner = new Scanner(System.in);
        int N = 10;
        char [] chars = new char[N];
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            System.out.println("introduz un caracter: ");
            chars[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < chars.length; i ++){
            if (chars[i] == 'x'){
                counter++;
            }
        }
        System.out.println("Numero de apariciones del caracter 'x': " + counter);
    }
    public static void exe12() {
        //Demana N caràcters per teclat i guarda’ls dins un array. Després, recórre l’array per saber quantes vegades
        // apareix el caràcter ‘x’ després de la primera aparició del caràcter ‘y’.

        scanner = new Scanner(System.in);
        int N = 10;
        char [] chars = new char[N];
        int counter = 0;
        boolean yFound = false;

        for (int i = 0; i < chars.length; i++){
            System.out.println("introduz un caracter: ");
            chars[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == 'y'){
                yFound = true;
            }
            if (yFound && chars[i] == 'x'){
                counter++;
            }
        }
        System.out.println("Numero de apariciones del caracter 'x' " + "despues de la primera 'y': " + counter);
    }
    public static void exe13() {
        //Declara un array d’enters de mida N i inicialitza’l aleatòriament. Després, demana per teclat un número
        // i digues si es troba dins l’array o no i, en cas de trobar-s’hi,indica en quin és el seu índex.

        scanner = new Scanner(System.in);
        Random rand = new Random();

        int N = 10;
        int [] numbers = new int[N];
        int number;

        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
            System.out.println(numbers[i]);
        }
        System.out.println("introduz un numero: ");
        number = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if (number == numbers[i]){
                indexes.add(i);
            }

        }
        if (indexes.size() == 0){
            System.out.println("El numero " + number + " no aparece ninguna vez");
        }else{
            System.out.println("El numero " + number + " aparece en el index: ");
            for (int i = 0; i < indexes.size(); i++){
                System.out.println(indexes.get(i) + "");
            }
        }
    }
    public static void exe14() {
        //Desenvolupa una classe per implementar una pila utilitzant arrayList, que doni suporta les operacions
        // add, get, remove i lenght.


    }
}

package com.company.Ejercicios;

import java.util.Scanner;

public class ejercicio_1 {

    public static void ex1() {
        //Mostra un missatge per pantalla. fes que es mostri de tres maneras diferents:
        //1.tot en una mateixa linia.
        //2.cada paraula en una linia diferent.
        //3.cada paraula en una linea diferent con una sola sentencia.

        System.out.println("Hola Mundo");

        System.out.println("Hola");
        System.out.println("Mundo");

        System.out.println("Hola \nMundo");
    }

    public static void ex2() {
        //Mostra per pantalla el missatge "hola, el meu nom es x", essent x el valor d'una variable que previament hagis
        //declarat.

        String nombre = "Aline";
        System.out.println("Hola el meu nom es " + nombre);
    }
    public static void ex3() {
    //Donats dos enters a i b, calcula i mostra per pantalla el
    //resultats de les seguents operacions a+b, a-b, a*b, a/b.

        int a = 15;
        int b = 10;

            System.out.println( a + b );
            System.out.println( a - b );
            System.out.println( a * b );
            System.out.println( a / b );
    }
    public static void ex4() {
    //Escriu un programa que, donats els valors de les variables a i b, obtengui el valor de l'expressio (a*(b+2))*10,
    //ho assigni a una altra variable c i mostri aquest resultat per pantalla.

        int a = 2;
        int b = 3;
        int c = (a*(b+2))*10;

        System.out.println(c);
    }
    public static void ex5() {
    //Donat un nombre real c (el qual representa una temperatura en graus centigrados), calcula el seu equivalent
    //en graus fahrenheit, tenit en compte que F= (9/5)c + 32.
    //exemple: 10 graus centigrados son 32.9 graus fahrenheit.

        int c = 60;

        //int farenheit = (double) (9/5) c + 32;

        //System.out.println(farenheit);
    }
    public static void ex6() {
    //Essent un euro igual a 1.8 dolars, escriu un rpograma que a partir d'una quantitat determinada d'euros faci
    //la conversió a dolars. exemple: 5 euros son 5.9 dolars.

    	int euro = 5;
    	double dolar = 1.18;
    	double conversion = ( euro * dolar );

    	System.out.println(conversion);
    }
    public static void ex7() {
        //Donades dues variables a = 5 i b = 10, escriu un programa per a intercanviar-ne els seus valors
        //, tal que en executar-se el resultat sigui a = 10 i b = 5. exemple de resultat: "valors inicials: a =5, b= 10" +
        //"valor actual a =10, b= 5".

        int a = 5;
        int b = 10;

        System.out.println("Valo_ini: a = " + a + " b =  " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Valo_fi: a = " + a + "   b = " + b);

    }
    public static void ex8() {
        //Escriu un programa que, donats els valors a, b i c cauculi l'expresio ((a + b)* 5)/2 * a, sense perdre decimals, ho assigni
        // a una variable i en mostri el resultat per pantalla

            Scanner sc = new Scanner(System.in);

            int a;
            int b;
            double c;

            System.out.print("Introduzca valor de A: ");
            a = sc.nextInt();

            System.out.print("Introduzca valor de b: ");
            b = sc.nextInt();

            c = (double)((a + b)* 5)/2 * a;

            System.out.println("resultado: " + c);

    }
    public static void ex9() {
    //Defineix dues variables altura i amplada (representades en centimetres) referents als costats d'un rectangle.
    //Llavors, calcula el seu perimetre, la seva area i mostra els resultats per pantalla.
    //exemple: un retangle amb una altura de 10 i una amplada de 5 té un de 30 i una area de 50.

        int alt = 10;
        int amp = 5;
        int total = (alt + amp)* 2;
        int area = alt * amp;

        System.out.println("Un rectangulo tiene " +alt+ " altura, " +amp+ " de base, " +total+ " de total y " +area+ " de area.");

}
    public static void ex10() {
    //Declarant i utilizant 3,14 com a constant pi, declara les variables altura h i diametre d per calcular el volum
    // d'un cilindre, tal que. exemple: un cilindre amb una altura de 10 i un diametre de 5 té un volum de 196.35.


        double PI = 3.14;
        int h = 10;
        int d = 5;
        double res = (double) PI*(d^2)*h;
        System.out.println( "un cilindro con una altura de " +h+ " i un diametro de " +d+ " tiene un volume de " +res);
}
}




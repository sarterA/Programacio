package com.company.Ejercicios;

import java.util.Scanner;

public class Bucles {
    private static Scanner scanner;

    public static void exer1() {
//Demanar un numero num per teclat i imprimir per pantalla tots els numeros des de
// 0 fins a num.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        int numero = sc.nextInt();
        int counter = 0;

        while (counter < numero) {
            counter = counter + 1;
            System.out.println(counter);
        }

    }

    public static void exer2() {
//Demana numeros per teclat fins que s'introdueixi un numero negatiu.

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int numero;

        do {
            System.out.println("Introduzca un numero:");
            numero = sc.nextInt();
            counter ++;
        }
        while (numero >= 0);

        if (numero < 0){
            System.out.println("Has introduzido un numero negativo");
        }


    }

    public static void exer3() {
//Demana un numero per teclat i digues si es positiu o negatiu. repeteix el proces
//fins que s'introdueixi un 0.

//        Scanner sc = new Scanner(System.in);
//        int counter = 0;
//        int numero;

//        do {
//            System.out.println("Introduzca un numero:");
//            numero = sc.nextInt();
//            counter ++;
        }
 //       while (numero != 0);
   //     {

 //           if (numero > 0) {
 //               System.out.println("Has introduzido un numero positivo");
 //           }
  //          else (numero < 0){
           //     System.out.println("Has introduzido un numero negativo");
         //   }
       //     System.out.println("Introduzca un numero:");
     //       numero = sc.nextInt();
      //  }
      //  if (numero == 0){
     //       System.out.println("Has introduzido un zero");
   //     }

 //   }

    public static void exer4() {
    //llegeix numeros per teclat fins que s'introdueixi un que sigui multiple de 2.

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int numero;

        do {
            System.out.println("Introduzca un numero:");
            numero = sc.nextInt();
        }
        while (numero % 2 != 0);
            System.out.println("Has introduzido un numero negativo");

    }
    public static void exer5() {
    //Demana numeros per teclat fins que s'introdueixi un numero negatiu. en acabar,
    //mostra per pantalla quants de numeros s'han introduit.'
        
    }

    public static void exer6() {
//Demanar numeros per teclat fins que s'introdueixi un 0 i, en acabar
//mostrar la suma de tots aquests numeros.
    }

    public static void exer7() {
//Demanar numeros per teclat fins que s'introdueixi un 0 i, en acabar
//calcular la mitjana aritmetica
    }

    public static void exer8() {
// Fer un programa que mostri el producte dels primers numeros senars fins a un enter num.

    }

    public static void exer9() {
// Suposant que tenim un enter numeroOcult que l'usuari no veu.Demanar per teclat
//que introdueixi un numero fins que enderti el numero ocult. si no l'encerta, se li ha d'indicar
//si el que ha introduit es major o menor que el que ha d'endevinar. mosttrar per pantalla quants intents ha necessitat.

    }

    public static void exer10() {
//Demanar n numeros per teclat i indicar, al final, si se n'ha introduit algun de negatiu.

    }

    public static void exer11() {
//Demanar n numeros per teclat, els quals han de representar una nota (de 0 a 10).
//en cabar, s'ha de mostrar per teclat quants d'aprovats hi ha, quants de suspesos i quantes notes eren invalides (inferiors a 0 o superior a 10).
//de les notes valides, calcular tambe la mitjana.

    }

    public static void exer12() {
//Demanar n numeros per teclat, els quals han de representar una nota (de 0 a 10). en acabar, s'ha de mostrar
//per teclat quants d'aprovats hi ha, quants de suspesos i quantes notes eren invalides (inferiors a 0 o superiors a 10).
// de les notes valides, calcular tambe la mitjana.

    }
}

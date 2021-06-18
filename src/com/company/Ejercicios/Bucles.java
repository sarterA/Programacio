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

        scanner = new Scanner(System.in);
        int number;
        int counter = 0;

        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();

        while (number >= 0) {
            counter++;
            System.out.print("Introduzca un número: ");
            number = scanner.nextInt();
        }
        System.out.println("has introduzido " + counter + " números positivos");
    }


    public static void exer6() {
    //Demanar numeros per teclat fins que s'introdueixi un 0 i, en acabar
    //mostrar la suma de tots aquests numeros.

        scanner = new Scanner(System.in);
        int sum = 0;

        int number;

        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Introduzca un número: ");
            number = scanner.nextInt();
        }
        System.out.println("La suma de los números introduzidos es " + sum);

    }

    public static void exer7() {
    //Demanar numeros per teclat fins que s'introdueixi un 0 i, en acabar
    //calcular la mitjana aritmetica

        scanner = new Scanner(System.in);
        int number;
        double average;

        int counter = 0;
        int sum = 0;

        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            counter++;
            System.out.print("Introduzca un número: ");
            number = scanner.nextInt();
        }

        average = (double)sum / counter;
        System.out.println("La media de los números introduzidos es " + average);
    }

    public static void exer8() {
    // Fer un programa que mostri el producte dels primers numeros senars fins a un enter num.

        int number = 10;
        int mult = 1;

        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                mult *= i;
            }
        }
        System.out.println("La multiplicación de los primeros números impares es " + mult);
    }

    public static void exer9() {
    // Suposant que tenim un enter numeroOcult que l'usuari no veu.Demanar per teclat
    //que introdueixi un numero fins que enderti el numero ocult. si no l'encerta, se li ha d'indicar
    //si el que ha introduit es major o menor que el que ha d'endevinar. mosttrar per pantalla quants intents ha necessitat.

        scanner = new Scanner(System.in);
        int number;
        int hiddenNumber = 7;

        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();

        while (number != hiddenNumber) {
            if (number > hiddenNumber) {
                System.out.println("Te has passado");
            } else {
                System.out.println("Te has quedado curto");
            }
            System.out.print("Introduzca otro número: ");
            number = scanner.nextInt();
        }
        System.out.println(" El número oculto era " + hiddenNumber);
    }

    public static void exer10() {
    //Demanar n numeros per teclat i indicar, al final, si se n'ha introduit algun de negatiu.

        scanner = new Scanner(System.in);
        final int N = 10;
        boolean isNegative = false;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un número: ");
            number = scanner.nextInt();
            if (number < 0) {
                isNegative = true;
            }
        }

        if (isNegative) {
            System.out.println("ha introduzido algun número negativo");
        } else {
            System.out.println("No ha introduzido ningun número negativo");
        }
    }

    public static void exer11() {
    //Demanar n numeros per teclat, els quals han de representar una nota (de 0 a 10).
    //en cabar, s'ha de mostrar per teclat quants d'aprovats hi ha, quants de suspesos i quantes notes eren invalides (inferiors a 0 o superior a 10).
    //de les notes valides, calcular tambe la mitjana.

        scanner = new Scanner(System.in);
        final int N = 10;
        int highestNumber = 0;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduz un número: ");
            number = scanner.nextInt();
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        System.out.println("El número mas grande introduzido és " + highestNumber);
    }

    public static void exer12() {
    //Demanar n numeros per teclat, els quals han de representar una nota (de 0 a 10). en acabar, s'ha de mostrar
    //per teclat quants d'aprovats hi ha, quants de suspesos i quantes notes eren invalides (inferiors a 0 o superiors a 10).
    // de les notes valides, calcular tambe la mitjana.

        scanner = new Scanner(System.in);
        final int N = 10;
        int numberPassed = 0;
        int numberFailed = 0;
        int validMarks = 0;
        int sum = 0;
        int mark;
        double average;

        for (int i = 0; i < N; i++) {
            System.out.print("Introdueix una nota: ");
            mark = scanner.nextInt();
            if (mark >= 0 && mark <= 10) {
                if (mark > 4 && mark <= 10) {
                    numberPassed++;
                } else if (mark < 5 && mark >= 0) {
                    numberFailed++;
                }
                sum += mark;
                validMarks++;
            }
        }
        average = (double)(sum / (numberPassed + numberFailed));

        System.out.println("Número de aprovados: " + numberPassed);
        System.out.println("Número de suspensos: " + numberFailed);
        System.out.println("Metade: " + average);


    }
}

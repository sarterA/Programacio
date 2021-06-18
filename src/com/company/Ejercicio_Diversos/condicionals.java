package com.company.Ejercicio_Diversos;

import java.util.Random;
import java.util.Scanner;

public class condicionals {

    Scanner sc = new Scanner(System.in);
    /**
     * 1 i 2: reben l’enter per par`ametre i retorna vertader o fals.
     **/

    public void ex1() {
    //Demanar un numero por teclat i diu si es positiu o negatiu.


        System.out.println("introduzca un numero:");
        int i = sc.nextInt();

        if( i >= 1 ){
            System.out.println("El numero es Positivo");
        }
        else if(i == 0){
            System.out.println("El numero es Zero");
        }
        else {
            System.out.println("El numero es Negativo");
        }
    }
    public void ex2() {
        //Demanar un numero per teclat i diu si es multiple de 2.

        System.out.println("introduzca un numero:");
        int i = sc.nextInt();

        int u = 2;
        int r = i % u;

        if (r == 0) {
            System.out.println(+i + " Es multiplo de 2");
        } else {
            System.out.println(+i + " No es multiplo de 2");
        }
    }

    /**
     * 3: rep dos enters per par`ametre i retorna el m ́es gran.
     **/

    public void ex3() {
        //Demanar dos numeros per teclat i indicar quin es el major, quin el menor o si son iguals.

        System.out.println("introduzca el primero numero:");
        int i = sc.nextInt();


        System.out.println("introduzca el segundo numero:");
        int u = sc.nextInt();

        if (i >= u) {
            System.out.println(+i + " Es mayor que " + u);
        } else if (i == u) {
            System.out.println("Los numeros son iguales ");
        } else {
            System.out.println(+i + " es menor que " + u);
        }
    }

    /**
     * 4: rep un enter per par`ametre i retorna el corresponent dia de la setmana.
     */
    public void ex4() {
        //A partir del valor d'un enter (d'1 a 7), fes que es mostri per pantalla el corresponent
        //dia de la setmana.
        //a) fes-ho amb instruccions if.
        //b) fes-ho amb un switch.

        // a)

        System.out.println("introduzca el Dia de la semana:");

        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Lunes");
        } else if (dia == 3) {
            System.out.println("Martes");
        } else if (dia == 4) {
            System.out.println("Miercoles");
        } else if (dia == 5) {
            System.out.println("Jueves");
        } else if (dia == 6) {
            System.out.println("Viernes");
        } else {
            System.out.println("Sabado");
        }

        //b)

        System.out.println("introduzca el Dia de la semana:");
        int dias = sc.nextInt();

        switch (dias) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Sabado");

        }

    }
    /**
     * 5: rep un enter per par`ametre i retorna l’String corresponent indicant el
     * moment del dia en el qual es troba.
     */

    public void ex5() {
        //Declara un enter hora el qual indica l'hora del dia a la qual ens trobam. desenvolupa
        //un programa que, en funcio de l'hora, digui en quin moment del dia es: si es entre les
        //8 i les 12 ens trobam al mati, si es entre las 12 i les 17 ens trobam al migdia, si ens
        //trobam entre les 17 i les 20 ens trobam a l'horabaixa, i de 20 a 23 ens trobam al vespre.


        System.out.println("introduzca una hora entera:");

        int hora = sc.nextInt();

        if (hora >= 8 && hora < 12) {
            System.out.println(hora + " es Mati");
        } else if (hora >= 12 && hora < 17) {
            System.out.println(hora + " es Migdia");
        } else if (hora >= 17 && hora < 20) {
            System.out.println(hora + " es Horabaixa");
        } else if (hora >= 20 && hora < 23) {
            System.out.println(hora + " es vespre");
        } else {
            System.out.println(hora + " es madrugada");
        }

    }

    /**
     * 6: rep per par`ametre la nota i retorna el resultat corresponent.
     */

    public void ex6(){
            //Demanar un numeor nota per teclat i dir si es insuficient (0-4), suficient (5), be (6),
            //notable(7,8) o excel·lent(9,10).


            System.out.println("introduzca una nota:");
            int nota = sc.nextInt();

            if (nota >= 0 && nota <= 4) {
                System.out.println("insuficiente");
            } else if (nota == 5) {
                System.out.println("suficiente");
            } else if (nota == 6) {
                System.out.println("bien");
            } else if (nota == 7 || nota == 8) {
                System.out.println("notable");
            } else if (nota == 9 || nota == 10) {
                System.out.println("exellente");
            } else {
                System.out.println("Error, nota solo es de 0 a 10");
            }
        }
        /**
        * 7: rep per par`ametre el dia, mes i any i retorna vertader o fals en funci ́o de si la data  ́es correcta.
        */

    public void ex7() {
        //Demanar dia, mes i any per teclat i indicar si la data es correcte (suposant que tots els
        // mesos tenen 30 dies)


        System.out.println("introduzca un dia:");
        int dia = sc.nextInt();


        System.out.println("introduzca un mes:");
        int mes = sc.nextInt();


        System.out.println("introduzca un año:");
        int año = sc.nextInt();

        if (dia > 0 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año >= 0 && año <= 2020) {
                    System.out.println("Fecha valida");
                } else {
                    System.out.println("Fecha no valida");
                }
            } else {
                System.out.println("Fecha no valida");
            }
        } else {
            System.out.println("Fecha no valida");
        }
    }
    public  void ex8() {
        //Repetir l'exercici anterior tenint en compte els dies que te cada mes.

        //NO FUNCIONA

//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Introduzca un dia:");
//        int dia = sc.nextInt();
//
//
//        System.out.println("introduzca un mes:");
//        int mes = sc.nextInt();
//
//
//        System.out.println("introduzca un año:");
//        int año = sc.nextInt();
//
//        int num_dia = 0;
//
//
//        switch (mes) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                num_dia = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                num_dia = 30;
//                break;
//            case 2:
//                num_dia = 28;
//                break;
//            default:
//               System.out.println("\nEs incorrecto");
//                break;
//        }
//        if ( dia == num_dia ){
//            System.out.println("Fecha valida");
//        }
//        else {
//            System.out.println("Fecha no valida");
//        }
//        if (mes >=1 && mes <= 12){
//            System.out.println("Fecha valida");
//        }
//        else {
//            System.out.println("Fecha no valida");
//        }
//        if (año >= 1500 && año <= 2020){
//            System.out.println("Fecha valida");
//        }
//        else{
//            System.out.println("Fecha no valida");
//        }

    }
    public  void ex9() {
        //Demanar tres numeros per teclat i mostrar-los per pantalla ordenats de major a menor.


        System.out.println("introduzca primero numero:");
        int a = sc.nextInt();
        System.out.println("introduzca segundo numero:");
        int b = sc.nextInt();
        System.out.println("introduzca tercero numero:");
        int c = sc.nextInt();

        System.out.println(" Numeros ordenados de mayor a menor:");

        if (a < b) {
            a += b;
            b = a - b;
            a -= b;
        }
        if (a < c) {
            a += c;
            c = a - c;
            a -= c;
        }

        if (b < c) {
            b += c;
            c = b - c;
            b -= c;
        }

        System.out.printf("\n%d %d %d", a, b, c);

    }

    /**
     * 10: rep per par`ametre l’edat d’una persona i retorna si  ́es major d’edat o no.
     */

    public void ex10() {
        //A partir de lèdat d'una persona digues si és major d'edat o no.


        System.out.println("introduzca una edad:");
        int edad = sc.nextInt();

        if (edad <= 17) {
            System.out.println(+edad + " Es menor de edad");

        } else {
            System.out.println(+edad + " Es mayor de edad");
        }
    }
    public void ex11() {
        //Escriu un programa que, donat un enter el qual representa una quantitat de doblers,
        //ens indiqui amb quins bitllets i monedes es pot assolir aquesta quantitat. Els bitllets
        //i monedes de les quals disposam són: bittlets de 50€, 20€, 10€ i 5€, i monedes de 2€ i 1€.


        System.out.println("introduzca un valor:");
        double valor = sc.nextDouble();

        int res = (int) (valor * 100);

        if (res >= 5000) {
            System.out.println("billetes de 50€: " + res / 5000);
            res %= 5000;
        }
        if (res >= 2000) {
            System.out.println("Billetes de 20€: " + res / 2000);
            res %= 2000;
        }
        if (res >= 1000) {
            System.out.println("Billetes de 10€: " + res / 1000);
            res %= 1000;
        }
        if (res >= 500) {
            System.out.println("Billetes de 5€: " + res / 500);
            res %= 500;
        }
        if (res >= 200) {
            System.out.println("Monedas de 2€: " + res / 200);
            res %= 200;
        }
        if (res >= 100) {
            System.out.println("Monedas de 1€: " + res / 100);
            res %= 100;
        }
    }
}
















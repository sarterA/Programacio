package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca una nota:");
        int nota = sc.nextInt();

        if ( nota >= 0 && nota <= 4 ){
                System.out.println("insuficiente");
        }
        else if ( nota == 5 ){
            System.out.println("suficiente");
        }
        else if ( nota == 6 ){
            System.out.println("bien");
        }
        else if ( nota == 7 || nota ==8 ){
            System.out.println("notable");
        }
        else if (nota == 9 || nota == 10 ) {
            System.out.println("exellente");
        }
        else {
            System.out.println("Error, nota solo es de 0 a 10");
        }





        //para executar cada actividade
//        conditionals.exercici1;
//        public static void exercici1(){}

    }
}




package com.company.buscaminas3;

import java.util.Scanner;

public class buscaminas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Cual es tu nombre?");
        String nombre = teclado.nextLine();
        System.out.println("Suerte, " + nombre);
        boolean levelOne = false;
        boolean perdido = false;
        char[][] matriz = null;
        char[][] matrizMinas = null;
        int numeroMinas = 0;
        do {
            mostrarMenu(nombre);
            System.out.println("Elija opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1 Para nivel principiante (8 × 8 casillas y 10 minas)");
                    System.out.println("2.-Para nivel intermedio (16 × 16 casillas y 40 minas)");
                    System.out.println("3.-Para nivel experto (16 x 30 casillas y 99 minas)");
                    int x = teclado.nextInt();
                    if (x == 1) {
                        matriz = new char[8][8];
                        matrizMinas = new char[8][8];
                        numeroMinas = 10;
                    }
                    if (x == 2) {
                        matriz = new char[16][16];
                        matrizMinas = new char[16][16];
                        numeroMinas = 40;
                    }

                    if (x == 3) {
                        matriz = new char[16][36];
                        matrizMinas = new char[16][16];
                        numeroMinas = 99;
                    }
                    if ((x > 3) || (x < 0)) {
                        System.out.println("Introduciste opcion incorrecta");
                    }

                    levelOne = true;
                    break;
                case 2:
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                        break;
                    } else {
                        generarTablero(matriz);
                        generarTablero(matrizMinas);
                        break;
                    }
                case 3:
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                        break;
                    } else {
                        imprimirTablero(matriz);

                        break;
                    }
                case 4:
                    int randomX = 0,
                            randomY = 0; //declaramos 2 variables que la maquina rellenará con el math random, de esta forma conseguimos rellenar el trablero de minas
                    generarMinas(randomX, randomY, matrizMinas, numeroMinas);
                    break;
                case 5:
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                        break;
                    } else {
                        imprimirTablero(matrizMinas);

                        break;
                    }
                case 6:
                    int cordX,
                            cordY;
                    if (levelOne == false) {
                        System.out.println("Debes eligir la difilcutad primero, saliendo...");
                        break;
                    } else {
                        System.out.println("En que fila?");
                        cordX = teclado.nextInt();
                        System.out.println("En que columna?");
                        cordY = teclado.nextInt();
                        perdido = apuntarDatosTablero(cordX, cordY, matriz, matrizMinas, perdido);
                        if (perdido == true) {
                            System.out.println("Perdiste la partida fill de puta");
                            opcion = 0;
                        } else {
                            comprobarCercaniaMinas(cordX, cordY, matriz, matrizMinas);
                            imprimirTablero(matriz);
                        }
                        break;
                    }

            }
        } while (opcion != 0);
    }

    public static void mostrarMenu(String nombre) {

        System.out.println("1.-Para eligir difilcutad");
        System.out.println("2.-Para generar el tablero");
        System.out.println("3.-Para imprimir el tablero ");
        System.out.println("4.-Para generar minas");
        System.out.println("5.-Para imprimir tablero con minas");
        System.out.println("6.-Empezamos el juego " + nombre + " , deberá introducir coordenadas");
        System.out.println("");
        System.out.println("0.-Para salir");

    }

    public static void generarTablero(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = '-';

            }

        }
    }

    public static void imprimirTablero(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (j == 0 || j == matriz.length - 1) {
                    if (j == 0) {
                        System.out.print("| " + matriz[i][j]);

                    }
                    if (j == matriz.length - 1) {
                        System.out.print(matriz[i][j] + " |");
                    }
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    public static void generarMinas(int randomX, int randomY, char[][] matriz, int numeroMinas) {
        boolean unaVez;
        do {
            for (int i = 0; i < matriz.length && numeroMinas > 0; i++) {
                unaVez = false;
                for (int j = 0; j < matriz[0].length && numeroMinas > 0; j++) {

                    if (unaVez == false) {
                        matriz[i][(int) (Math.random() * matriz[0].length)] = '@';
                        numeroMinas--;
                    }
                    unaVez = true;

                }
            }
        } while (numeroMinas > 0);

    }

    public static boolean apuntarDatosTablero(int cordX, int cordY, char[][] matriz, char[][] matrizMinas, boolean perdido) {
        if (matriz[cordX][cordY] == '#' || matrizMinas[cordX][cordY] == '@') {
            if (matrizMinas[cordX][cordY] == '@') {
                System.out.println("Hay una bomba,has perdido");
                perdido = true;
                return perdido;
            }

            if (matriz[cordX][cordY] == '#') {
                System.out.println("Ya introduciste en esa casilla");

            }

        } else {
            matriz[cordX][cordY] = '#';
            System.out.println("No hay bomba, ahora se escribe");

        }
        return perdido;
    }

    public static void comprobarCercaniaMinas(int cordX, int cordY, char[][] matriz, char[][] matrizMinas) {
        int contA1 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (i == cordX - 1 && j == cordY - 1) { // A1
                    if (matrizMinas[i - 1][j - 1] >= 0 || matrizMinas[i - 1][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j - 1] == '@') { // 1
                            contA1++;
                        } else {
                        }
                    } else {

                    }
                    if (matrizMinas[i - 1][j] >= 0 || matrizMinas[i - 1][j] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j] == '@') { // 1
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i - 1][j + 1] >= 0 || matrizMinas[i - 1][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j + 1] == '@') { // 1
                            contA1++;
                        }
                    } else {

                    }
                    ////////////////////////////////////////////
                    if (matrizMinas[i][j - 1] >= 0 || matrizMinas[i][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i][j - 1] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i][j] >= 0 || matrizMinas[i][j] <= matrizMinas.length) {
                        if (matrizMinas[i][j] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i][j + 1] >= 0 || matrizMinas[i][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i][j + 1] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    ////////////////////////////////////////////
                    if (matrizMinas[i + 1][j - 1] >= 0 || matrizMinas[i + 1][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j - 1] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i + 1][j] >= 0 || matrizMinas[i + 1][j] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i + 1][j + 1] >= 0 || matrizMinas[i + 1][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j + 1] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    //Transformacion ASCII llamada metodo , dentro de un metodo...
                    matriz[cordX - 1][cordY - 1] = (char) transformacionAscii(contA1);
                }
                ///////////////////////////////////////////////////////////////////////////////////////
                contA1 = 0; //reiniciamos contador...
                if (i == cordX - 1 && j == cordY) { // B1
                    if (matrizMinas[i - 1][j - 1] >= 0 || matrizMinas[i - 1][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j - 1] == '@') { // 1
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i - 1][j] >= 0 || matrizMinas[i - 1][j] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j] == '@') { // 1
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i - 1][j + 1] >= 0 || matrizMinas[i - 1][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i - 1][j + 1] == '@') { // 1
                            contA1++;
                        }
                    } else {

                    }
                    ////////////////////////////////////////////
                    if (matrizMinas[i][j - 1] >= 0 || matrizMinas[i][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i][j - 1] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i][j] >= 0 || matrizMinas[i][j] <= matrizMinas.length) {
                        if (matrizMinas[i][j] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i][j + 1] >= 0 || matrizMinas[i][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i][j + 1] == '@') { // 2
                            contA1++;
                        }
                    } else {

                    }
                    ////////////////////////////////////////////
                    if (matrizMinas[i + 1][j - 1] >= 0 || matrizMinas[i + 1][j - 1] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j - 1] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i + 1][j] >= 0 || matrizMinas[i + 1][j] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    if (matrizMinas[i + 1][j + 1] >= 0 || matrizMinas[i + 1][j + 1] <= matrizMinas.length) {
                        if (matrizMinas[i + 1][j + 1] == '@') { // 3
                            contA1++;
                        }
                    } else {

                    }
                    //Transformacion ASCII llamada metodo , dentro de un metodo...
                    matriz[cordX - 1][cordY] = (char) transformacionAscii(contA1);

                }

            }
        }

    }

    public static int transformacionAscii(int cont) {

        if (cont == 0) {
            cont = 48;

        }
        if (cont == 1) {
            cont = 49;
        }
        if (cont == 3) {
            cont = 50;
        }
        if (cont == 4) {
            cont = 51;
        }
        if (cont == 5) {
            cont = 52;
        }
        if (cont == 6) {
            cont = 53;
        }
        if (cont == 7) {
            cont = 54;
        }

        return cont;
    }

}
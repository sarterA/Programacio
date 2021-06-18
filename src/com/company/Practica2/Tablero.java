package com.company.Practica2;
import com.company.Practica2.Casillas;

import java.util.Random;



public class Tablero {

    private int filas;
    private int columnas;
    private int numMinas;
    private Casillas[][] tabla;

    public Tablero(int filas, int columnas) {

        this.filas = filas;
        this.columnas = columnas;
        this.numMinas = 0;
        this.tabla = new Casillas[filas][columnas];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = new Casillas();
            }
        }
    }
    public void generarMinas(int numMinas) {
        Random r = new Random();
        int posicio1;
        int posicio2;
        while (numMinas > 0) {
            posicio1 = r.nextInt(this.filas);
            posicio2 = r.nextInt(this.columnas);
            tabla[posicio1][posicio2].setMina(true);
            numMinas--;
        }
    }
    public void imprimirTablero() {
        System.out.print("\u001B[33m");
        for (int i = 0; i <= tabla.length - 1; i++) {
            System.out.print("\u001B[33m" + i + " \u001B[0m");
        }
        System.out.print("\u001B[33m|0 ");
        System.out.println("");
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("\u001B[33m" + contador + "|" + "\u001B[0m");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.print("\u001B[33m|" + contador + "\u001B[0m");
            contador++;
            System.out.println("");
        }
        System.out.print("\u001B[33m0|");
        for (int i = 0; i <= tabla.length - 1; i++) {
            System.out.print("\u001B[33m" + i + " \u001B[0m");
        }
        System.out.print("\u001B[33m|0 ");
        System.out.println("");
    }
    public int calcularMinas(int fila, int columna) {
        int num = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            if (i >= 0 && i < filas) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    if (j >= 0 && j < columnas && tabla[i][j].isMina()) {
                        num++;
                    }
                }
            }

        }
        return num;
    }
    public Casillas getCasillas(int fila, int columna) {
        return this.tabla[fila][columna];
    }

    public void calcularTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!tabla[i][j].isMina()) {
                    tabla[i][j].setNumero(calcularMinas(i, j));
                }
            }
        }
    }


    //personalizado
    /* public static void TableroPerso() {

        Scanner sn = new Scanner(System.in);

        //1 fila,2 columnas
        int TPxP[][] = new int[1][2];
        int minasP = 0;
        double fila = 0;
        double columna = 0;
        boolean unaVez;
        int altura = 0;
        int largo = 0;
        int maxMinas = 250;

        //insertar por consola el array bidimensional.
        for (int i = 0; i < TPxP.length; i++) {
            for (int j = 0; j < TPxP[i].length; j++) {
                System.out.println("Elige el tamaño del tablero. ejemplo: '8'(filas) y lluego '16'(columnas).\n ");
                TPxP[i][j] = sn.nextInt();
            }
        }


        System.out.println("Elige un numero de minas: \n");
        minasP = sn.nextInt();
         do {
                for (int i = 0; i < TPxP.length && minasP > 0; i++) {
                    unaVez = false;
                    for (int j = 0; j < TPxP[0].length && minasP > 0; j++) {

                        if (unaVez == false) {
                            TPxP[i][(int) (random() * TPxP[0].length)] = '@';
                            minasP--;
                        }
                        unaVez = true;
                    }
                }
            } while (minasP > 0);

                System.out.println("Eligiste el tablero: \n");
                System.out.println(Arrays.deepToString(TPxP));
                System.out.println("Eligiste el numero de minas: \n");
                System.out.println(minasP);
            } */
    }



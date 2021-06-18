package com.company.Practica1;

import com.company.Practica1.Menu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Opciones {


    private static String text;
    public Opciones() { this.text = text; }
    

    public static void option1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        text = entrada.nextLine();

    }
    public static void option2(){
        System.out.println("frase: " + text +".");
    }

    public static void option3(){
        int longitud;
        longitud = text.length();
        System.out.println("Hay " + longitud + " letras!");
    }
    public static void option4(){
        StringTokenizer st = new StringTokenizer(text);
        System.out.println(st.countTokens());
    }
    public static void option5() {

            int caracCblanco = text.length();
            int caracSblanco = text.replace(" ","").length();

            System.out.println("número de caracteres de la frase: " +caracSblanco);

    }
    public static void option6(){

        char[] arr = text.toCharArray();
        java.util.Arrays.sort(arr);
        int count = 0;
        char nocount = (char)-1;
        char carac = nocount, caracter = nocount;

        for(int i = 0; i<arr.length;++i){
            carac = arr[i];
            if(carac != caracter){
                if(caracter != nocount){
                    System.out.println("El caracter " +caracter + " ,aparece " + count +" veces.");
                }
                nocount = caracter;
                count = 1;
            }else{
                count++;
            }
        }
        if(caracter != nocount){
            System.out.println("El caracter " +carac + " ,aparece " + count +" veces.");
        }
    }
    public static void option7(){
        int conta;
        String fraseLow = text.toLowerCase();
        String fraseReplace = fraseLow.replaceAll("[\\.\\,\\(\\)]","");
        String[] palabra = fraseReplace.split(" ");

        HashMap<String[], Integer> mapaDeFrecuencias = new HashMap();

        for (int i = 0; i<palabra.length;++i) {
            if (mapaDeFrecuencias.containsKey(palabra)) {
                mapaDeFrecuencias.put(palabra, mapaDeFrecuencias.get(palabra) + 1);
            } else {
                mapaDeFrecuencias.put(palabra, 1);
            }
        }
        for (Map.Entry<String[], Integer> entry : mapaDeFrecuencias.entrySet()) {
            System.out.printf("Palabra" + entry.getKey()+ " con frecuencia " + entry.getValue());
        }
    }
    public static void option8(){

        char caracter = 0;
        int numeroDeVeces = 0;
        int posicion, contador = 0;
        posicion = text.indexOf(caracter);

        System.out.print("Introduce un carácter: ");
        try {
            caracter = (char) System.in.read();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        while (posicion != -1) {
            contador++;
            posicion = text.indexOf(caracter, posicion + 1);
        }
        System.out.println("El caracter " + caracter + " aparece " + contador + " veces");
    }
    public static void option9(){
        String TBuscado;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        TBuscado = entrada.nextLine();

        while (text.indexOf(TBuscado) > -1) {
            text = text.substring(text.indexOf(TBuscado)+TBuscado.length(),text.length());
            contador++;
        }


    }
    
}



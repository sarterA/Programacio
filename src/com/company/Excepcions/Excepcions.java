package com.company.Excepcions;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excepcions{

    public static void exe1() {
        //Dividir un número per zero.

        try {
           int  a = 10 / 0;
        }catch (Exception e) {
            System.err.println( e );
        }

    }
    public static void exe2(){
        //Controlar l’entrada d’un número per teclat.

        Scanner sc = new Scanner(System.in);
        try {
            int a;
            a = sc.nextInt();
        } catch (Exception e) {
            System.err.println( e );
        }
    }
    public static void exe3(){
        //Convertir un número que estigui en tipus String a un tipus enter (mitjançant les funcions parseInt() i
        // getInteger() de la classe Integer.

        //con ParseInt()
        String a = "ytr";
        try{
            int b =  Integer.parseInt(a);

        } catch (Exception e){
            System.err.println( e );
        }

        //con GetInteger()
        String c = "ytr";
        try{
            int d =  Integer.getInteger(c);

        } catch (Exception f){
            System.err.println( f );
        }

    }
    public static void exe4(){
        //Llegir per teclat un String, convertir-lo a enter i fer el tractament per teclat com controlar.
        // Fes el tractament per les mateixes exceptions que has controlat en els punts 1, 2 i 3.

        try{
            Scanner sc =  new Scanner(System.in);

            String a = sc.next();

            int b = Integer.parseInt( a );

        }catch (Exception e){
            System.err.println( e );
        }
    }
    public static void exe5(){
        //Accedir a una posició que no existeix d’un array o arrayList.

        try{
            ArrayList a = new ArrayList();
            a.get(0);

        }catch(Exception e){
            System.err.println( e );
        }

    }
    public static void exe6(){
        //Descarrega el fitxer Main.java i modifica’l fins que es pugui compilar i executar, fent el tractament
        // adequat de les excepcions que es puguin donar. Per fer-ho, has d’afegir un fitxer file.txt al directori
        // principal del projecte (on trobam les carpetes out i src).



        // package com.company;

        // import java.io.File;
        // import java.io.IOException;
        // import java.io.RandomAccessFile;

        // public class Main {

            // public static void main(String[] args) throws Exception{

                // File myFile = new File("C:\\Users\\notka\\IdeaProjects\\Programacio\\src\\com\\company\\file.txt");
                // readFile(myFile);}

            // public static void readFile(File file) throws IOException {
                // RandomAccessFile input = null;
                // String line = null;

                // try {
                    // input = new RandomAccessFile(file, "r");
                    // while ((line = input.readLine()) != null) {
                        // System.out.println(line);}

                    // return;
                //} finally {
                  //  if (input != null) {
                    //    input.close();
                  //  }
               // }
           // }


        }

    }


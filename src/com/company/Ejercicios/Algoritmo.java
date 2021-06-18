package com.company.Ejercicios;
/** algoritmo es para organizar el contenido en orden de un array **/

public class Algoritmo {

    int[] arr = {6,4,3,5,1,2};

   public static void selection_1(int[] arr) {
       int menor;
       int pos;
       int j;
       int x;

       for (int i = 1; i < arr.length; i++) {
           menor = arr[i];
           pos = i;
           for (j = i + 1; j < arr.length; j++) {
               if (arr[j] < menor) {
                   menor = arr[j];
                   pos = j;
               }
           }
           if (pos != i) {
               x = arr[i];
               arr[i] = arr[pos];
               arr[pos] = x;
           }
       }
   }
// otro codigo igual para lo mismo.//

   public static void selection_2(int[] arr){
               int min = 0;
               int minIndex = 0;
               int aux;


               for(int i =0; i < arr.length; i++){
                   for(int j = i; j < arr.length; j++){
                       if(min < arr[j]){
                           min = arr[j];
                           minIndex = j;
                       }
                   }
                   aux = arr[i];
                   arr[i] = min;
                   arr[minIndex] = aux;
               }

           }
           public static void bubbleSort(int[] arr){
            int aux;

               for(int i = 0; i < arr.length; i++){
                   for(int j = 1; j < arr.length -i; j++){
                       if(arr[j - 1] > arr[j]){
                           aux = arr[j - 1];
                           arr[j - 1] = arr[j];
                           arr[j] = aux;
                       }
                   }
               }
           }
           public static void cocktail(int[] arr){


           }

    }



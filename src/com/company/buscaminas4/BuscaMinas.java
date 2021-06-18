package com.company.buscaminas4;
import com.company.buscaminas4.Juego;

    public class BuscaMinas {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            Juego juego = new Juego();
            if(juego!=null){
                juego.jugar();
            }

        }
    }


package com.company.Practica2;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Estructura {

    private Tablero tablero;
    private int numMinas;
    private int filas;
    private int columnas;
    private Timer timer = new Timer();
    private int segundos=0;



    public Estructura() { EligirDificuldad(); }

    public void EligirDificuldad() {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        Jugador();

        do {
                System.out.println("Con cual dificuldad quieres jugar? \n");

                System.out.println("1) Principiante, 8x8 ,10 minas");
                System.out.println("2) Normal, 16x16, 40 minas");
                System.out.println("3) Dificil, 16x30, 99 minas");
                System.out.println("4) Personalizado, eligir tamaño del tablero y cantidad de minas");
                System.out.println("5) Empezar juego");

                opcion = 0;
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        Principiante();
                        break;
                    case 2:
                        Normal();
                        break;
                    case 3:
                        Dificil();
                        break;
                    case 4:
                        TableroPersonalizado();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println(" Ups!! solo números de 1 a 5 ");
                        break;
                }
        }
        while (opcion != 5) ;

    }
    /** Dificuldad principiante 8x8 10 minas **/
    public void Principiante() {

        int columnas = 8;
        int filas = 8;
        int numMinas= 10;

        this.columnas = columnas;
        this.filas = filas;
        this.numMinas = numMinas;
        this.tablero = new Tablero(filas, columnas);
    }
    /** dificuldad normal 16x16 40 minas **/
    public void Normal() {

        int columnas = 16;
        int filas = 16;
        int numMinas= 40;

        this.columnas = columnas;
        this.filas = columnas;
        this.numMinas = numMinas;
        this.tablero = new Tablero(filas, columnas);
    }
    /** dificuldad dificil 16x30 99 minas **/
    public void Dificil() {

        int columnas = 16;
        int filas = 30;
        int numMinas= 99;

        this.columnas = columnas;
        this.filas = filas;
        this.numMinas = numMinas;
        this.tablero = new Tablero(filas, columnas);
    }
    /** dificuldad personalizada **/
    public void TableroPersonalizado(){

        Scanner entrada;

        int columnas = 0;
        int filas = 0;
        int numMinas=0;

        do{
            try{
                entrada = new Scanner(System.in);
                System.out.println("Introduce el número de Filas: \n");
                filas = entrada.nextInt();

                System.out.println("Introduce el número de Columnas: \n");
                columnas = entrada.nextInt();

                System.out.println("Introduce el número de Minas: \n");
                numMinas = entrada.nextInt();

            } catch(java.util.InputMismatchException letraIntroducida){
                System.out.println("Ups!! solo puede introduzir numeros \n");
            } catch(Exception ex){
                System.out.println("Error general");
            }
        }while(columnas == 0 || filas == 0);

        this.columnas = columnas;
        this.filas = filas;
        this.numMinas = numMinas;
        this.tablero = new Tablero(filas, columnas);
    }
    /** Estructura principal del juego **/
    public void juego(){

        Scanner entrada = new Scanner(System.in);
        boolean perdido = false;

        tablero.generarMinas(numMinas);
        do{
            tablero.calcularTablero();
            mostrarTablero();
            contar();
            int opcion = elegirOperacion();
            int fil = 0;
            int column = 0;

            switch(opcion){

                case 1:
                    System.out.println("Introduce las coordenadas para jugar: ");

                    System.out.print("Fila: ");
                    fil = entrada.nextInt();

                    System.out.print("Columna: ");
                    column = entrada.nextInt();

                    descubrirCasillas(fil, column);

                    //coordenadasCorrectas funciona en alguns momentos y en otros no.

                           /* if( coordenadasCorrectas(fil,column)){
                                    descubrirCasillas(fil, column);
                            }else {
                                coordenadasCorrectas(fil,column);
                            } */

                    break;
                case 2:
                        System.out.println("Introduce las coordenadas para poner la bandera");

                        System.out.print("Fila: ");
                        fil = entrada.nextInt();

                        System.out.print("Columna: ");
                        column = entrada.nextInt();

                        tablero.getCasillas(fil, column).setBandera(true);
                        break;
                case 3:
                    System.out.println("Introduce las coordenadas para quitar la bandera");

                    System.out.print("Fila: ");
                    fil = entrada.nextInt();

                    System.out.print("Columna: ");
                    column = entrada.nextInt();

                    tablero.getCasillas(fil, column).setBandera(false);
                    tablero.getCasillas(fil, column).setVisible(false);

                            break;
                    }
                    Detener();
                    if( !descubrirCasillas(fil, column)){
                        gameOver();
                        perdido = true;
                    }else {
                        gameWin(); }
                }while( !gameWin() && !perdido );
            }

            /** imprimir el tablero con el tamaño eligido **/
            private void mostrarTablero(){ tablero.imprimirTablero(); }

            /** menu del juego ***/
            private int elegirOperacion(){

                int opcion = 0;
                Scanner entrada = new Scanner(System.in);

                System.out.println("Elige una opcion: \n");

                System.out.println("1) Eligir Movimiento ");
                System.out.println("2) Poner Bandera ");
                System.out.println("3) Quitar Bandera ");
                opcion = entrada.nextInt();
                return opcion;
            }
            /** comprobar coordenadas, no funciona bien. **/
            private boolean coordenadasCorrectas(int fila, int columna){

                Scanner entrada = new Scanner(System.in);
                boolean filas = false;
                boolean columnas = false;
                boolean estado = false;

                try{
                    do{
                        while( fila > this.filas ){
                            System.out.print("Error Filas, valor invalido! vuelva a escribirlo: ");
                            fila = entrada.nextInt();
                            if( fila < this.filas ){
                                filas = true;
                            }
                        }
                        while( columna > this.columnas ){
                            System.out.print("Error columnas, valor invalido! vuelva a escribirlo: ");
                            columna = entrada.nextInt();
                            if( columna < this.columnas ){
                                columnas = true;
                            }
                        }
                        if( filas && columnas ){
                            estado = true;
                        }
                    }while(!estado);
                } catch(java.util.InputMismatchException letraIntroducida){
                    System.out.println("Ups!! Solo es válido números");
                } catch(Exception ex){
                    System.out.println("Error general");
                }
                return estado;
            }
            /** metodo para juego perdido **/
            private void gameOver(){ System.out.println(" GAME OVER, ENCOTRÓ UNA MINA!! "); }

            /** destapar las casillas **/
            private boolean descubrirCasillas(int fila, int columna){

                if(tablero.getCasillas(fila, columna).isMina()){
                    return true;

                }
                else if(tablero.getCasillas(fila, columna).isBandera()){

                    System.out.println(" No puedes eligir una bandera para ver lo que hay ");
                }
                else if(tablero.getCasillas(fila, columna).isVisible()){

                    System.out.println(" está visible la casilla eligida ");
                }
                else{
                    tablero.getCasillas(fila, columna).setVisible(true);
                    tablero.getCasillas(fila, columna).setBlanco(true);

                    if (tablero.getCasillas(fila, columna).isBlanco() && !(tablero.getCasillas(fila, columna).getNumero() > 0) ) {
                        descubrirBlanco(fila, columna);
                    }
                }
                return true;
            }

            private void descubrirBlanco(int fila, int columna){ }


            private boolean gameWin(){

                boolean victoria = false;
                int acierto = 0;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if( tablero.getCasillas( i, j ).isMina() && tablero.getCasillas( i, j ).isBandera() ){
                            acierto++;
                        }
                    }
                }
                if( acierto == numMinas ){
                    System.out.println(" JUEGO TERMINADO, HAS GANADO!!!");
                    victoria = true;
                }else{
                    victoria = false;
                }

                return victoria;
            }
            public void Jugador(){

                 Scanner entrada = new Scanner(System.in);
                 String nombreU;

                System.out.println("Cual es tu nombre de jugador? \n");
                nombreU = entrada.nextLine();

                System.out.println("Hola," + nombreU + "\n");
    }
    class contador extends TimerTask {
        public void run(){
            segundos++;
            // System.out.println("segundo: " + segundos);
        }
    }
    public void contar(){
        this.segundos = 0;
        timer = new Timer();
        timer.schedule(new contador(), 0,1000);
    }
    public void Detener(){
        timer.cancel();
    }

    public int getSegundos(){ return this.segundos;}





    /* Datos jugador = new Datos(nombreU,0,0);
        System.out.println("Hola,"+ jugador.getNombreUsuario() +"\n"); */ //por ultimo, cuando tengo el tiempo y el score


}

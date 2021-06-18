package com.company.Practica2;

public class Casillas {
    private boolean mina;
    private boolean blanco;
    private boolean bandera;
    private boolean visible;
    private int numero;


    public Casillas(){
        this.mina = false;
        this.blanco = false;
        this.bandera = false;
        this.visible = false;
        this.numero = 0;
    }

    @Override
    public String toString() {
        if(blanco){
            return "  ";
        }
        if(mina && visible){
            return "\u001B[33mM \u001B[0m";
        }
        if(numero > 0 && visible){
            return Integer.toString(numero)+" ";
        }
        if(bandera){
            return "X ";
        }
        else{
            return "0 ";
        }
    }

    public boolean isMina() { return mina; }

    public void setMina(boolean mina) { this.mina = mina; }

    public boolean isBlanco() { return blanco; }

    public void setBlanco(boolean blanco) { this.blanco = blanco; }

    public boolean isBandera() { return bandera; }

    public void setBandera(boolean bandera) { this.bandera = bandera; }

    public boolean isVisible() { return visible; }

    public void setVisible(boolean visible) { this.visible = visible; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }


    }


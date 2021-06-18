package com.company.Ejercicio_Practica;


public class Alumne {

    private String nom;
    private int edat;
    private int identificador;
    private int[] note;

    public Alumne(String nom, int edat, int identificador, int[] note) {
        this.nom = nom;
        this.edat = edat;
        this.identificador = identificador;
        this.note = note;
    }
    public Alumne(){}

    public double mitjanaNotes() {
        int total = 0;
        for (int i = 0; i < note.length; i++){
            total += note[i];
        }
        return total / (double)note.length;
    }

    public String getNom() { return this.nom; }

    public void setNom(String nom) { this.nom = nom; }

    public int getEdat() { return this.edat; }

    public void setEdat(int edat) { this.edat = edat; }

    public int getIdentificador() { return this.identificador; }

    public void setIdentificador(int identificador) { this.identificador = identificador; }

    public int[] getNote() { return note; }

    public void setNote(int[] note) { this.note = note; }


}

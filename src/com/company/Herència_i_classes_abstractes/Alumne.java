package com.company.Herència_i_classes_abstractes;

import com.company.Herència_i_classes_abstractes.Persona;

    public class Alumne extends Persona {

        private String nom;
        private int edat;
        private int identificador;
        private float note[];

        public Alumne(String nom, int edat, int identificador, float note[]) {
            super(nom, edat, identificador, note);

        }

        public void display() {
        }

        public String getNom() { return this.nom; }

        public void setNom(String nom) { this.nom = nom; }

        public int getEdat() { return this.edat; }

        public void setEdat(int edat) { this.edat = edat; }

        public int getIdentificador() { return this.identificador; }

        public void setIdentificador(int identificador) { this.identificador = identificador; }

        public float[] getNote() { return note; }

        public void setNote(float[] note) { this.note = note; }

    }


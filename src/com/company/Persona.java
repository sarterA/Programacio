package com.company;

public class Persona {
    private String nom;
    private int edat;
    private String dni;
    private String sexe;
    private int telefono;


    public Persona(String nom, int edat, String dni, String sexe, int telefono) {
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
        this.sexe = sexe;
        this.telefono = telefono;
    }

    public void setNom(String nom) {
        this.nom = "Cris";
    }

    private String nom() {
        return this.nom();
    }
    public void printPersona(){
        System.out.println(nom);
        System.out.println(edat);
        System.out.println(dni);
        System.out.println(sexe);
        System.out.println(telefono);

    }

    public String getNom() {
        return null;
    }
    public String getEdat() {
        return null;
    }
}
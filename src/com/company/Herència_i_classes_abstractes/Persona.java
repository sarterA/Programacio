package com.company.Herència_i_classes_abstractes;

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

    public Persona(String nom, int edat, int identificador, float[] note) {}

    public Persona(int identificador, double salario, int años) {}

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDni(String dni) { this.dni = dni; }
    public void setEdat(int edat) { this.edat = edat; }
    public void setSexe(String sexe) { this.sexe = sexe; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getNom() {
        return nom;
    }
    public int getEdat() {
        return edat;
    }
    public String getDni() { return dni; }
    public String getSexe() { return sexe; }
    public int getTelefono() { return telefono; }

    public void display(){
        System.out.println("Name: " + this.nom);
        System.out.println("Age: " + this.edat);
        System.out.println("ID: " + this.dni);
        System.out.println("Gender: " + this.sexe);
        System.out.println("Phone: " + this.telefono);
    }


    }


package com.company.Ejercicio_classes_objectes;

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
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getDni() {
        return dni;
    }

    public String getSexe() {
        return sexe;
    }

    public int getTelefono() {
        return telefono;
    }

    public void display() {
        System.out.println("Nombre: " + this.nom);
        System.out.println("Edad: " + this.edat);
        System.out.println("Dni: " + this.dni);
        System.out.println("Genero: " + this.sexe);
        System.out.println("Telefono: " + this.telefono);
    }

    /** ----------------------MAIN---------------------- **/


    //        public void exe7(){

    //        Persona persona1 = new Persona("André", 27, 99999, 'Masc', 12359);
    //        persona1.display();
    //        }

    //        public void exe8(){

    //        Persona persona2 = new Persona();
    //        Scanner entrada = new Scanner(System.in);
    //
    //        System.out.print("\nEscribe un nombre: ");
    //        persona2.setNom(entrada.nextLine());
    //
    //        System.out.print("Escribe una edad: ");
    //        persona2.setEdad(entrada.nextInt());
    //
    //        System.out.print("Escribe un Dni: ");
    //        persona2.setDni(entrada.nextInt());
    //
    //        System.out.print("Escribe un genero: ");
    //        persona2.setSexe(entrada.next().charAt(0));
    //
    //        System.out.print("Escribe un telefono: ");
    //        persona2.setTelefono(entrada.nextInt());
    //
    //        persona2.display();
    //    }

}
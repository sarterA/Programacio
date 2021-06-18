package com.company.Ejercicio_Practica;

import java.util.ArrayList;

public class Assignatura {

    private String nom;
    private ArrayList<Alumne> estudiantes;

    public Assignatura(String nom, ArrayList<Alumne> estudiantes){
        this.nom = nom;
        this.estudiantes = estudiantes;
    }
    public void matricula(Alumne alumne){
        this.estudiantes.add(alumne);
    }
    public void bajaAlumne(Alumne alumne){
        this.estudiantes.remove(alumne);
    }
    public Alumne mejorAlumne(){
        Alumne alumne = new Alumne();
        for (int i = 0; i < estudiantes.size(); i++){
            if(alumne.mitjanaNotes() > estudiantes.get(i).mitjanaNotes()){
                alumne = estudiantes.get(i);
            }
        }
        return alumne;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public ArrayList<Alumne> getEstudiantes() { return estudiantes; }
    public void setEstudiantes(ArrayList<Alumne> estudiantes) { this.estudiantes = estudiantes; }
}

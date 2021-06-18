package com.company.Fitxers_sequencials;

public class Pelicula {

    private String titol;
    private String nomDirector;
    private int anyEstrena;

    public void Pelicula(){
        this.titol = titol;
        this.nomDirector = nomDirector;
        this.anyEstrena = anyEstrena;
    }

    public String getTitol() {
        return titol;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public int getAnyEstrena() {
        return anyEstrena;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAnyEstrena(int anyEstrena) {
        this.anyEstrena = anyEstrena;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }
    public String toString(){
        String mensaje = "";
        mensaje = this.titol + "," + this.anyEstrena + "," +
                this.nomDirector;
        return mensaje;
    }

}

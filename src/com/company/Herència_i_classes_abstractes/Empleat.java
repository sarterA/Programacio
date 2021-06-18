package com.company.Herència_i_classes_abstractes;

public class Empleat extends Persona{
    private int identificador;
    private double salario;
    private int años;

    public Empleat(int identificador, double salario,int años){

        super(identificador,salario,años);
    }

    public void incrementarSalarioAño(){

           salario = salario * 1.5;
           años = años + 1;
    }


    public int getIdentificador() {
        return identificador;
    }

    public double getSalario() {
        return salario;
    }

    public int getAños() {
        return años;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setAños(int años) {
        this.años = años;
    }
}

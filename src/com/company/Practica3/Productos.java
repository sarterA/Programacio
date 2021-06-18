package com.company.Practica3;

import java.util.HashMap;

public class Productos {

    // variables
   private String nombre;
   private String descripción;
   private double precio;
   private int cuantidad;
   private String categoria;

   //constructor
   public void Productos(){
       this.nombre = nombre;
       this.descripción = descripción;
       this.precio = precio;
       this.cuantidad = cuantidad;
       this.categoria = categoria;
   }


   //SET Y GET
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripción() {
        return descripción;
    }

    public int getCuantidad() {
        return cuantidad;
    }

    public String getCategoria() { return categoria; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setCuantidad(int cuantidad) {
        this.cuantidad = cuantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) { this.categoria = categoria; }
}

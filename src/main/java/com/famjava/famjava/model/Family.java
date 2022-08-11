package com.famjava.famjava.model;

import org.springframework.stereotype.Component;

@Component
public class Family {
    private String nombre;
    private int edad;

    public Family(){};
    public Family (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return this.edad; }
    public void setEdad(int edad) { this.edad = edad; }
}

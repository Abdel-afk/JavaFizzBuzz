package com.example.FizzBuzz.kata1;

public class Usuario {
    public String nombre;
    public  int edad;
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}

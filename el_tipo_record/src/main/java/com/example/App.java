package com.example;



public class App {

    static final int XX = 5;

    
    public static void main(String[] args) {
        
        

        Persona persona = new Persona(nombre: "Alex Eduardo", altura: 1.80, apellido1: "Pilicita", correo: "aedupili@gmail.com");

        Persona persona2 = Persona.builder()
            .correo(correo: "mmm@gmail.com")
            .nombre(nombre: "Douglas")
            .buld();
    }
}

package com.example;

/*
El record no es un mero atajo para crear una clase que permita crear ojetos
inmutables, es decir, que una vez creado no se puedan modificar.
El record es lo mejor para transportar datos, genera una estructura de datos
que es final, es decir, que no se puede heredar, ademas:

1- Las propiedades o campos del record entre parentesis se convierten en private final
por lo cual no se le pueden generar metodos setter para cambiarle el valor.

2- Se generan automaticamente metodos getter, pero no llevan delante la palabra get,
si no el nombre de la propiedad o campo del record.

3- Se generan para el record los metodos toString, equals y hashCode.

En teoría un record no necesita de Lombok en asoluto, pero utilizar la anotación @Builder
de Lombok, no facilita mucho el trabajo a la hora de instanciar un record, por tener que 
suministtrar todos los parametros que el constructor espera y no tendriamos que 
respetar el orden.
*/


    public record Persona(
        String nombre,
        double altura,
        String apellido1,
        String correo)
        
        {}




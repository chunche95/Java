/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Paco");
    }
}

class Persona{
    String nombre;
    
    // Constructor
    Persona(String nombre){
        this.nombre = nombre; // this apunta a un objeto de tipo Persona
        System.out.println("Impresión del operador this dentro de la clase Persona: " + this); // this apunta a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); //this contiene una referencia al objeto Persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Imprimiendo argumentos de persona: " + p); // valor del objeto persona
        System.out.println("Imprimiendo objeto actual (this): " + this); // this apunta a un objeto de tipo imprimir
    }
}

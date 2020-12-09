/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Person persona1 = new Person();        
        persona1.cambiarNombre("Pilar");
        System.out.println("Su nombre es: " + persona1.obtenerNombre());
        
        modificarPersona(persona1);
        System.out.println("Nuevo nombre es: " + persona1.obtenerNombre());
        
    }

    private static void modificarPersona(Person arg) {
        arg.cambiarNombre("Cristina");
    }
}

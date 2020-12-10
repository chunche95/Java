/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Nuria" ,  3200, false);
        // System.out.println("Nombre: " + p.nombre); => No es recomendable, por eso usaremos la palabra reservada private. en Persona.java
        
        // Obtenemos informacion
        System.out.println("Nombre directora: " + p.getNombre() + "\t"+ p.getSueldo() + "\t"+ p.isEliminado());
        System.out.println("Mem. de p: " + p);
        // Modificamos informacion
        p.setEliminado(true);
        p.setSueldo(0);
        
        // Volvemos a imprimir la info anterior
        System.out.println("Persona = " + p.toString());
        
        System.out.println("Mem. de p: " + p);
        
        // Renovamos datos.
        p.setNombre("Maria");
        p.setSueldo(2010.5);
        p.setEliminado(false);        
        // Imprimimos datos
        System.out.println("Persona = " + p.toString());
        System.out.println("Mem. de p: " + p);
    }
}

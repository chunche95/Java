/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class PalabraNull {
    public static void main(String[] args) {
        
        // Creamos nueva persona
        Persona p0 = new Persona("Juanito");
        // Obtenemos el resultado para p0
        System.out.println("Mem. Persona: " + p0);
        System.out.println("Persona 0 : " + p0.obtenerNombre());
        // redireccionamos al mismo campo de memoria la variable p1 y obtenemos igualmente 
        Persona p1= p0;
        System.out.println("Mem. Persona1: " + p1);
        System.out.println("Persona 1: " + p1.obtenerNombre());
        
        // Dejamos de apuntar a la casilla de memoria
        p0 = null;
        Persona p2 = p0;
        System.out.println("Mem. persona2: " + p2);
        System.out.println("Persona 2: " + ( p0 != null ? p2.obtenerNombre() : "La variable p0 no apunta a ningún objeto")); 
        
        // Redirigimos la referencia de p3 a la variable p1 ya que con p0, su valor es null y, no ejecutaría obtenerNombre()
        Persona p3 = p1;
        System.out.println("Mem. persona3: " + p3);
        System.out.println("Persona 3: " + ( p1 != null ? p3.obtenerNombre() : "La variable p1 no apunta a ningún objeto")); 
        
        // Ejecutamos el recolector de basura 
        System.gc();
    }
}

class Persona{
    String nombre;
    
    // Constructor 
    Persona(String nombre){
        this.nombre = nombre;
    }    
    public String obtenerNombre(){
        return this.nombre;
    }
}
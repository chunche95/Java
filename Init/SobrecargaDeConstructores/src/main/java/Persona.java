/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Persona {
    private String nombre;
    private int id;
    private int edad;
    private static int contador;
    
    public Persona(){
        // super(); se manda a llamar de manera automática
        this.id = ++contador;
    }
    
    // Sobrecarga de constructor
    public Persona(String nombre, int edad){
        this(); // Llamamos el constructor vacío.
        this.nombre= nombre;
        this.edad= edad;
    }

    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

  /*  public void setId(int id) {
        this.id = id;
    }*/

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContador() {
        return contador;
    }

    /*public static void setContador(int contador) {
        Persona.contador = contador;
    }*/
    
}

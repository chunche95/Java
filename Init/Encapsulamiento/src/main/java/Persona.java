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
    private double sueldo;
    private boolean eliminado;
    // Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this. eliminado = eliminado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // Por ser un método boolean usa 'is'
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    // Simplificando los  System.out.println en una línea     
   /* 
    public String toString(){
        return "Nombre: " + this.nombre +  ", sueldo:  " + this.sueldo + "€/br \t Eliminado: " + this.eliminado + "\n ································································ \n";
    }
    */

    @Override // Sobreescritura de método
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
}



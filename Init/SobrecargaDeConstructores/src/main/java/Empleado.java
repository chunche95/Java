/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Empleado extends Persona{
    
    private double sueldo;
    
    public Empleado(String n, int e){
        super(n, e);
    }
    
    public Empleado(String nombre, int edad, double sueldo){
        //this(nombre, edad);
        super(nombre, edad);
        this.sueldo=sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +  "Empleado{" + "sueldo=" + sueldo + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
;
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(String  nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    /*public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }*/

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    /*public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }*/

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}

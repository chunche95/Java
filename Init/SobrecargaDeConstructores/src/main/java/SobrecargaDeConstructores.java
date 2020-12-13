/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class SobrecargaDeConstructores {
    public static void main(String[] args) {
        Persona p = new Persona("Richard", 25);
        System.out.println(p);
        
        Empleado e = new Empleado("Cristian", 40, 94380);
        System.out.println(e);
    }
}

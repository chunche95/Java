/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Person {
    String name;
    
    public String obtenerNombre(){
        return this.name;
    }
    
    public void cambiarNombre(String newName){
        this.name = newName;
    }
}

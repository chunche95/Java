/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class EjEstatico {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            
            switch(i){
                    case 1:
                        Persona p = new Persona("Rico"+i);
                        System.out.println(p);
                        
                    case 2:
                        Persona p2 = new Persona("Luisa"+i);
                        System.out.println(p2);
                        
                    case 3:
                        Persona p3 = new Persona("Carlos"+i);
                        System.out.println(p3);
                        
                    case 4:
                        Persona p4 = new Persona("Paula"+i);
                        System.out.println(p4);
                    default:
                        System.out.println("Fallo de ejecución" + i);
                        
            }
            
        }
        
    }
}

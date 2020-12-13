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
                        Persona p = new Persona("Marcos"+i);
                        System.out.println(p);
                        break;
                        
                    case 2:
                        Persona p2 = new Persona("Luisa"+i);
                        System.out.println(p2);
                        break;
                        
                    case 3:
                        Persona p3 = new Persona("Carlos"+i);
                        System.out.println(p3);
                        break;
                        
                    case 4:
                        Persona p4 = new Persona("Paula"+i);
                        System.out.println(p4);
                        break;
                        
                    case 5:
                        Persona p5 = new Persona("Andrés"+i);
                        System.out.println(p5);
                        break;
                        
                    default:
                        System.out.println("No hay usuario - " + i);
                        
            }
            
        }
        
    }
}

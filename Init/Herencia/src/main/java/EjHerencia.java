
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class EjHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Federico", 5000);
        empleado1.setEdad(33);
        empleado1.setGen('M');
        empleado1.setDir("Calle Falsa 123");
        System.out.println(empleado1);
        
        System.out.println("\n");
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNom("Yaiza");
        cliente1.setEdad(25);
        cliente1.setGen('F');
        cliente1.setDir("Avda Constitución 54");
        System.out.println(cliente1);
        
        System.out.println("\n");
        
        Cliente cliente2 = new Cliente(new Date(), false);
        cliente2.setNom("Ramón");
        cliente2.setEdad(44);
        cliente2.setGen('M');
        cliente2.setDir("Avda Yucatán 74");
        System.out.println(cliente2);
    }
}

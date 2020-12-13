/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrafinal;

/**
 *
 * @author pauli
 */
public class EjPalabraFinal {
    public static void main(String[] args) {
        // Modificar atributo final
        // ClaseFinal.VAR_PRIMITIVA = 20; - nO ME DEJA
        // ClaseFinal.VAR_PERSONA = new Persona(); - Tampoco puedo tocarlo
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        // Cambiamos su valor
        ClaseFinal.VAR_PERSONA.setNombre("Julio");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}

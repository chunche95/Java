/*
 *  Creación de una persona de pruebas -> Llamará a la clase PERSONA.JAVA
*/

/**
 *
 * @author pauli
 */
public class CreaPersona {
    public static void main(String[] args) {
         // Creacion de un objeto de tipo pesona
         Persona persona1;         
         // Instanciando (creando) un objeto de la clase Persona.
         persona1 = new Persona();
         
         
         // Modificacmos los valores de los atributos del objeto Persona
         persona1.nombre = "Paqui";
         persona1.apellidos = "Romero García";
         persona1.edad = 25;
         
         
         // Accedems al objeto persona y llamamos al método datosPersonales()
         persona1.datosPersonales();
         
         // Creacion de un segundo objeto de tipo Persona
         Persona persona2 = new Persona();
         
         persona2.nombre = "Antonio";
         persona2.apellidos = "Bermúdez Noemi";
         persona2.edad = 33;
         
         
         persona2.datosPersonales();
         
    }
}

/*
 * Clases. Base de POO.
 * Define la naturaleza de un objeto. Su definición 'sencilla' sería como una plantilla para definir más objetos.
 * # Tiene un nombre, posee atributos y métodos. #
 * Característica de su estructura
 * - Definimos atributos o variables de nuestra instancia.
 * - Definimos los métodos de nuestras clases.
 * 
 * => métodos contienen el código y funcionalidad de la clase.
 * 
* Objeto es una instancia de una clase
 * Tipos Object son: Clases, interfaces y arreglos.
 * Ej.
 *         Persona          (Clase) 
 *         /        \
 *      karla      Juan     (Objetos)
 */

/*
  * EJEMPLO
  *
  *     [Nombre de      [Definimos los objetos que necesitaremos para 
  *     la clase]           la clase]
  *     PERSONA => ATRIBUTOS. => MÉTODOS (Operaciones)
  *                         - Nombre            - obtenerNombre() : String
  *                         - Género            - obtenerGenero() : String
  *                         - Profesión          - obtenerProfesion() : String
  *                                                  - modificarNombre(nombre : String)
  *                                                  - modificarGenero(genero : String)
  *                                                  - modificarProfesion(profesion : String)
  */


/**
 *
 * @author pauli
 */
public class Persona {
    // Atributos
    String nombre, apellidos;
    int edad;
    
    
    // Método de la clase - Lo usarán los objetos de esta clase.
    public void datosPersonales()
    {
        System.out.println("Nombre: " +  nombre +"\t"+ apellidos);      
        System.out.println("Edad: " + edad);
    }
    
} // clase Persona

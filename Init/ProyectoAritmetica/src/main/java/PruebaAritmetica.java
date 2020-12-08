/*
 * Clase de prueba para llamar a la clase Aritmetica.java
 */

/**
 *
 * @author pauli
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        // Creamos un objeto de tipo aritmetica con valores por default
        Aritmetica aritmetica = new Aritmetica();
        
        // Inicializamos el constructor y asignamos los valores a los argumentos del método
        int resultado = aritmetica.sumar();
        System.out.println("Resultado: " + resultado);
        
        // Creación de un segundo objeto  Aritmetica
        Aritmetica aritmetica2 = new Aritmetica(5,6);
        resultado = aritmetica2.sumar();
        System.out.println("Resultado2 : " + resultado);
    }
}

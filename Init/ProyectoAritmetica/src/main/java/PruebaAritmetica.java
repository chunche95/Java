/*
 * Clase de prueba para llamar a la clase Aritmetica.java
 */

/**
 *
 * @author pauli
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        // Creamos un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar(12, 50);
        System.out.println("Resultado: " + resultado);
    }
}

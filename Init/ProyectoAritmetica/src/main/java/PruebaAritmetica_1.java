/*
 * Clase de prueba para llamar a la clase Aritmetica.java
 */

/**
 *
 * @author pauli
 */
public class PruebaAritmetica_1 {
    
    public static void main(String[] args) {
        // variables locales
        int opA = 55;
        int opB = 9;
        
        // Creamos un objeto de la clase Aritmetca usando argumentos
        Aritmetica objeto1 = new Aritmetica(opA, opB);
        
        // Imprmo los valores de los operandos
        System.out.println("Operandos: A: " + opA + " B: " + opB);
        System.out.println("Resultado de las opearciones");
        System.out.println("Suma => " + objeto1.sumar());
        System.out.println("Resta => " + objeto1.restar());
        System.out.println("Multiplicación => " + objeto1.multiplicar());
        System.out.println("División => " + objeto1.dividir());
        
    }
}

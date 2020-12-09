/*
 * Palabra return en tipos primitivos en Java.
 */

/**
 *
 * @author pauli
 */
public class PalabraReturn {
    public static void main(String[] args) {
        
        sumarSinRetornarValor(3,6);
        int resultado = sumarRetornandoValor(3,4);
        System.out.println(resultado);
    }
    
    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado sumar sin retornar valor: " + (a+b));
    }

    private static int sumarRetornandoValor(int c, int d) {
        return (c+d);
    }
    
}

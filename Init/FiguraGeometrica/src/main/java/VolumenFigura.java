/*
 * Ejercicio.
 * 
 * Caja - Volumen = ancho x alto x profundidad
 * 
 * Debe tener:
 * - 3 atributos de tipo entero (ancho, alto y largo)
 * - 2 constructores, uno vacío y otro con 3 argumentos, uno por cada atributo de la clase
 * - Método que calcule el volumen de la caja
 * - Crear una clase de prueba para crear un objeto de tipo caja con los valores ancho = 3, alto = 2, largo = 6 e imprima el volumen
 * - Probar modo debug y probar con otros datos.
 * 
 */

/**
 *
 * @author pauli
 */
public class VolumenFigura {
    public static void main(String[] args) {
        /* Declaración de las variables de pruebas */
        int ancho ,alto , largo ;
        
        Caja nuevaCaja1 = new Caja(ancho, alto, largo);
        System.out.println("Volumen de la caja es: "+ alto + " X "+ ancho + " X "+ largo + " = "  );
        System.out.println(nuevaCaja1.volumen());
    }
}

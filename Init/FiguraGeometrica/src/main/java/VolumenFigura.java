
import java.util.Scanner;

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
import java.util.Scanner;

public class VolumenFigura {

    public static void main(String[] args) {
        
        /* Declaración de las variables de pruebas */
        System.out.println("MEDIDAS DE LA CAJA. \n ____________________ ");
        
        System.out.println("Ancho: ");
        Scanner an = new Scanner(System.in);
        int ancho = an.nextInt();
        
        System.out.println("Alto: ");
        Scanner al = new Scanner(System.in);
        int alto = al.nextInt();
        
        System.out.println("Largo: ");
        Scanner la = new Scanner(System.in);
        int largo = la.nextInt();
        
        // ancho = 3, alto = 2, largo = 6
        if (ancho != 0) {  ancho = ancho; } else { ancho = 3; }
        if (alto != 0) { alto = alto; } else { alto = 2; }
        if (largo != 0) { largo = largo; } else { largo = 6; }
        
        Caja nuevaCaja1 = new Caja(ancho, alto, largo);
        System.out.println("Caja Default => ancho: 3 | alto: 2 | largo: 6");
        System.out.println("Volumen de la caja es: " + ancho + " X " + alto + " X " + largo + " = " + nuevaCaja1.volumen());

    }
}

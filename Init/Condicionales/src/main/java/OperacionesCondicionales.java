/*
 * Operaciones condicionales en Java.
 */

/**
 *
 * @author pauli
 */
import java.util.Random;
public class OperacionesCondicionales {
    public static void main(String[] args) {
        /*
          * Los valores posibles son:
          *    - && 
          *    - ||
          *    - 
        */
        //Declaración de números random
        Random numero1 = new Random(), valorMin = new Random(0) , valorMax = new Random(999);
        System.out.println("Valores iniciales. \n" +  numero1 + "\n" +  valorMin + "\n" +  valorMax);
        
        // Declaración de valores random decimales
        int valor1 = numero1.nextInt(10)+1;
        int vMin = valorMin.nextInt(10)+1;
        int vMax = valorMax.nextInt(10)+1;
        System.out.println("Valores nuevos. \n Valor 1: " +  valor1 + "\n Valor mínimo: " +  vMin + "\n Valor máximo: " +  vMax);
        
        // ¿Alguno de ellos son menores iguales o mayores?
        boolean resultado1 = valor1 >= vMin || valor1 >= vMax;
        boolean resultado2 = valor1 >= vMin && valor1 >= vMax;
        System.out.println("Resultado1: " + resultado1 + "\nResultado2:"  + resultado2);
        
        /*
          * Declaración de días libres de un trabajador.
        */
        System.out.println("Bienvenido a sus días libres. \n ¿Librará?");
        
        Random random1 = new Random();
        Random random2 = new Random();

        boolean vacaciones =   random1.nextBoolean();
        boolean diaDescanso =  random2.nextBoolean();
        System.out.println("Salió: " + vacaciones + " y " + diaDescanso);
        if (vacaciones  || diaDescanso){
            System.out.println("Puede asistir a su concierto. ");
        }else{
            System.out.println("No puede, no tiene el día libre");
        }
    }
}

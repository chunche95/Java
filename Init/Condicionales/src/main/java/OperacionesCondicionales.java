/*
 * Operaciones condicionales en Java.
 */

/**
 *
 * @author pauli
 */
import com.sun.tools.jdeprscan.scan.Scan;
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
        
        System.out.println("..............................................");
        
        // Declaración de valores random decimales
        int valor1 = numero1.nextInt(10)+1;
        int vMin = valorMin.nextInt(10)+1;
        int vMax = valorMax.nextInt(10)+1;
        System.out.println("Valores nuevos. \n Valor 1: " +  valor1 + "\n Valor mínimo: " +  vMin + "\n Valor máximo: " +  vMax);
        
        // ¿Alguno de ellos son menores iguales o mayores?
        boolean resultado1 = valor1 >= vMin || valor1 >= vMax;
        boolean resultado2 = valor1 >= vMin && valor1 >= vMax;
        System.out.println("Resultado1: " + resultado1 + "\nResultado2:"  + resultado2);
        
        System.out.println("..............................................");
        
        /*
          * Declaración de días libres de un trabajador usando operadores relacionales y valores RANDOM.
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
        System.out.println("..............................................");
        
        /*
          * Operadores ternarios (simplificacion del if else)
        */
        // var r = (expresion) ? true : false;
        boolean r = (3 < 2) ? true : false;
        System.out.println("Resultado: " + r);
        
        String r2 = (valor1 <= vMin) ? "Sí" : "No";
        String r3 = (valor1 <= vMax) ? "Sí" : "No";
        System.out.println("El valor 1 (" +  valor1 + ") es menor o igual que valor mínimo (" + vMin + ") ? " + r2);
        System.out.println("El valor 1 (" +  valor1 + ") es mayor o igual que valor máximo ("  +  vMax+ ") ? " +  r3);
        
        System.out.println("Valor antes de la operación: " + valor1);
        System.out.println(vMin);
        System.out.println(vMax);
        
        System.out.println("..............................................");
        
       /* 
         * Operación SWITCH
        */
        System.out.println("Menú de opciones.");
        System.out.println("a. Cálcular la media de 2 asignaturas. ");
        System.out.println("b. Cálculo del seno de un número. ");
        System.out.println("c.  Cálculo del coseno de un número. ");
        System.out.println("d. Cálculo de la tangente de un número. ");
        Scan valor = new Scan();
       switch ( opcion = valor){
           case 'a':
               
               
       }
        
        
        
        
    }
}

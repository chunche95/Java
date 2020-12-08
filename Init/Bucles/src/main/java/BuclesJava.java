/*
 * Se estudiarán los bucles en Java
 * - While
 * - Do While
 * - For
 */

/**
 *
 * @author pauli
 */
public class BuclesJava {
    public static void main(String[] args) {
        int i = 0;
        // While de 0 a 10
        while( i < 10){
            System.out.println("Vuelta: " + i);
            i++;
        }
        System.out.println("...................................");
        
        // Do-While de 10 a 0 
        do{
            System.out.println("Vuelta: " + i);
            i--;
        }while( i > 0);
        
        System.out.println("...................................");
        
        // For - de 11 a 1
        int j;
        for( j=11 ; j>i ; j--){
           System.out.println("J vale: " +  j);                
        }
        System.out.println("i - " + i);
        System.out.println("j - " + j);
        
        System.out.println("...................................");
        
        /*
          * BREAK and CONTINUE. -> EJ imprimir nº pares
        */
        for (int k = 0; k < 30; k++) {
            if ( k % 2 != 0){
                continue;
            }else{
                System.out.println("k = " + k );
            }            
        }
        
        System.out.println("...................................");
        
        // otra forma de declarar el for pero con una 'etiqueta' llamada inicio. Programación 'Go To'
        inicio:
        for (int k = 0; k < 30; k++) {
            if ( k % 3 != 0){
                continue inicio;
            }
            System.out.println("k = " + k );            
        }
        System.out.println("...................................");
        
    } // void main
} // class

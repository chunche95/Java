package arreglos;

/**
 *
 * @author pauli
 */
public class Arrays {
    public static void main(String[] args) {
        // 1. variable de tipo arreglo, un arreglo tipo int
        int edades[];
        
        // 2. Instanciar el arreglo de int 
        edades = new int[3];     // 3 elementos para el array
        
        // 3. Inicializamos los valores de los ellementos del array
        edades[0] = 30;
        edades[1] = 25;
        edades[2] = 20;
        
        //4. Imprimimos el array
        System.out.println("Array - Índice 0: " + edades[0]);
        System.out.println("Array - Índice 1: " + edades[1]);
        System.out.println("Array - Índice 2: " + edades[2]);
        // System.out.println("Array - Índice 2: " + edades[3]);
        
        // DECLARAMOS UN ARRAY DE TIPO Object
        Persona personas[] = new Persona[5];
        
        // 1. Inicializamos vlores del array
        personas[0] = new Persona("Julian");
        personas[1] = new Persona("José");
        personas[2] = new Persona("Juana");
        personas[3] = new Persona("Jessica");
        personas[4] = new Persona("Jake");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: "+ i +" "+ personas[i]);
        }
        
        // Array usando notación simplificada
        String nombres[] = {"Sara", "Sandra", "Sonia"};
        // Imprimimos los elemenos de un array
        for(int i = 0; i < nombres.length ; i++){
                System.out.println("Array String " + i + ":" + nombres[i]);
        }
    }
}

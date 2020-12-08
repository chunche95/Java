
import java.util.Scanner;

/*
 * Clase scanner en Java
 */

/**
 *
 * @author pauli
 */
public class EscanerJava {
    public static void main(String[] args) {
        // Def escaner
        Scanner escanea = new Scanner(System.in);
        
        System.out.println("¿Nombre de usuario? ");
        String nombre = escanea.nextLine();
        System.out.println("Usuario: " + nombre);
    }

}

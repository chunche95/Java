/*
 * Estudio de las variables existentes en Java.
 * 
 * Las reglas para declarar las variables son:
 * -  Hay que declarar el tipo de variable
 * -  Hay que usar un identificador de la variable sin usar palabras reservadas y todo en minúsculas.
 * -  Respetar la definición para que el programa sepa que variable se desea usar
 *
 * @author Pauchino09
 */
import java.util.Scanner;
import java.lang.Math;
public class Variables {
    public static void main(String[] args) {
        // Declaración de las variables         
        String saludo = "Saludos";
        String despedirse = "Adiós!";
       
        double flotante;
        char $caracter;
        flotante = 3.2;
       
        System.out.println("Inserte su nombre: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        
        System.out.println(saludo + " " +nombre);
        
        if (Math.round(flotante)  < 5){
            System.out.println("\t Su nota es menor que \'5\'. \t" + flotante);
        }else{
            System.out.println(flotante + "\t es mayor que 5.");
        }
        if(flotante >= 5.0){
            System.out.println("\t Aprobado!");
            $caracter = 'S';
        }else{
            System.out.println("\t Debe recuperar...");
            $caracter = 'N';
        }
        if($caracter == 'S'){
            System.out.println("\t Tiene vacaciones");
        }else{
            System.out.println("\t Debe seguir intentándolo");
        }
        
        System.out.println(despedirse);
        
    }
}

/*
 * Operaciones condicionales en Java.
 */

/**
 *
 * @author pauli
 */
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;
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
        System.out.println("RADIANES");
        System.out.println("b. Cálculo del seno de un número. ");
        System.out.println("c. Cálculo del coseno de un número. ");
        System.out.println("d. Cálculo de la tangente de un número. ");
        System.out.println("s. Salir");
        System.out.println("Seleccione una de las opciones: ");
        
        Scanner str = new Scanner(System.in);
        String opcion = str.nextLine();
        // Convertimos la letra a minúscula.
        opcion = opcion.toLowerCase();
        switch(opcion)
        {
            // Sé que es redundante,  se puede reducir y simplificar pero es más por ver el ejemplo de las condicionales
            case "a":
                        System.out.println("Asignaturas.");
                        // 1ª
                        System.out.println("Escriba el nombre de la asignatura 1: ");
                        // Asignatura 1
                        Scanner a1 = new Scanner(System.in);
                        String asigA = a1.nextLine();
                        if (asigA != null){
                            // La media
                            // 1
                            System.out.println("Nota 1 examen: ");
                            Scanner notaA1 = new Scanner(System.in);
                            double nota1 = notaA1.nextDouble();
                            // 2
                            System.out.println("Nota 2 examen: ");
                            Scanner notaA2 = new Scanner(System.in);
                            double nota2;
                            nota2 = notaA2.nextDouble();
                            // media
                            double mediaD = (( nota1 + nota2)/2);
                            System.out.println("Media de las asignatura: " +  mediaD);
                        }else{
                            System.out.println("ERROR - No puede estár vacio");
                        }
                        // 2ª
                        System.out.println("Escriba el nombre de la asignatura 2: ");
                        Scanner a2 = new Scanner(System.in);
                        String asigB = a2.nextLine();
                        if (asigB != null){
                            // La media
                            // 1
                            System.out.println("Nota 1 examen: ");
                            Scanner notaB1 = new Scanner(System.in);
                            double nota1 = notaB1.nextDouble();
                            // 2
                            System.out.println("Nota 2 examen: ");
                            Scanner notaB2 = new Scanner(System.in);
                            double nota2 = notaB2.nextDouble();
                            // media
                            double media = (( nota1 + nota2)/2);
                            System.out.println("Media de las asignatura: " + media);
                        }else{
                            System.out.println("ERROR - No puede estár vacio");
                        }
                        break;
            case "b":
                        System.out.println("Escriba el número");
                        Scanner num = new Scanner(System.in);
                        float numero = num.nextFloat();
                        double  sol = sin(numero);
                        System.out.println("Seno de " + numero + " es: " + sol);
                        break;
            case "c":
                        System.out.println("Escriba el número");
                        Scanner nCos = new Scanner(System.in);
                        float number = nCos.nextFloat();
                        double  s = cos(number);
                        System.out.println("Coseno de " + number + " es: " + s);
                        break;
            case "d":
                        System.out.println("Escriba el número");
                        Scanner nTang = new Scanner(System.in);
                        float nro = nTang.nextFloat();
                        double  resp = tan(nro);
                        System.out.println("Tangente de " + nro + " es: " + resp);
                        break;
            case "s":
                        System.out.println("Programa finalizado.");
                        break;
            default:
                        System.out.println("................................................");
                        System.out.println("Algo ha fallado .... Vuelve a intentarlo de nuevo");
                        System.out.println("................................................");
       }    
        
        
        /*
         * Convertir un número a texto
         */
        int n = 0;
        String nTexto = "Nº desconocido";

        switch (n) {
            case 1: nTexto = "Número uno"; break;
            case 2: nTexto = "Número dos"; break;
            case 3: nTexto = "Número tres"; break;
            case 4: nTexto = "Número cuatro"; break;
            case 5: nTexto = "Número cinco"; break;
            case 6: nTexto = "Número seis"; break;
            case 7: nTexto = "Número siete"; break;
            case 8: nTexto = "Número ocho"; break;
            case 9: nTexto = "Número nueve"; break;
            case 0: nTexto = "Número cero"; break;
            default: nTexto = "No sé qué número es ... "; 
        }
        System.out.println("El número introducido es: " + n + " y en texo es: " + nTexto);
        
        /*
           * Estaciones del año
        */
        
        System.out.println("Escriba el mes del año (nombre o número del mes): ");
        Scanner mes = new Scanner(System.in);
        String mmes = mes.nextLine();
        
        switch(mmes){
            case "Enero": case "enero": case "1":case "01":
            case "Febrero": case "febrero": case "2":case "02":
            case "Diciembre": case "diciembre": case "12":
                System.out.println("Es Invierno");
                break;
            case "Marzo": case "marzo": case "3":case "03":
            case "Abril": case "abril": case "4":case "04":
            case "Mayo": case "mayo": case "5":case "05":
                System.out.println("Es Primavera");
                break;
            case "Junio": case "junio": case "6":case "06":
            case "Julio": case "julio": case "7":case "07":
            case "Agosto": case "agosto": case "8":case "08":
                System.out.println("Es Verano");
                break;
            case "Septiembre": case "septiembre": case "9":case "09":
            case "Octubre": case "octubre": case "10":
            case "Noviembre": case "noviembre": case "11":
                System.out.println("Es Otoño");
                break;
            default: System.out.println("Fallo de entrada, vuelva a intentarlo");
            
            
        }
        
        
    } // public static void main    
} // public class

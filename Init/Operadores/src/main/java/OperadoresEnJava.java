
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
 * Operadores.
 */

/**
 *
 * @author pauli
 */
public class OperadoresEnJava {
    public static void main(String[] args) {
        int a = 35 , b = 12;
        
        int suma = a+b;
        int resta = a-b;
        int multiplica = a*b;
        int divide = a/b;
        int modulo = a%b;
        
        System.out.println(" \n Suma \n"  + a +" + " + b + " Resultado: " + suma );
        System.out.println(" \n Resta \n"  + a +" - " + b + " Resultado: " + resta );
        System.out.println(" \n Multiplicación \n"  + a +" * " + b + " Resultado: " + multiplica );
        System.out.println(" \n Dividir \n"  + a +" / " + b + " Resultado: " + divide );
        System.out.println(" \n Módulo \n"  + a +" % " + b + " Resultado: " + modulo );
        
        /*
          * Incremento de variables.
        */
        a += suma;
        System.out.println("a vale: " + a);
        b *= divide;
        System.out.println("b vale: " + b);
        
        /*
          *  Cálculo de operadores unarios
        */
         
        b = a/7;
        System.out.println("B:" + b +  " y a: " + a);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        // Incrementos y preincremento
        b = ++b;
        System.out.println("B: " + b);
        // Postincremento
        a = b++;
        System.out.println("A: " +a);
        // decremento y predecremento
        a = --a;
        
        /*
          * Cálculo de hipotenusa - Usamos POW y SQRT 
        */
        System.out.println("Operación - Cálculo de la hipotenusa suponiendo que 'a' y 'b' son sus catetos.");
        double hipotenusa;
        double catetos = (pow(a,2)+pow(b,2));
        hipotenusa = sqrt(catetos);
        System.out.println("Valores de los catetos: \n A. " + a + "\n B. " + b + "\n");
        System.out.println("Resultado de la hipotenusa: " + hipotenusa);
        
        
        /*
          *     operadores de igualdad
          *
        */
        System.out.println("..............................................................................");
        System.out.println("Operadores de igualdad");
        System.out.println("A " +a);
        System.out.println("B " +b);
        boolean comparar = (a == b);
        System.out.println("Comparación: " +  comparar);
        boolean compara = (a != b);
        System.out.println("Comparación nueva: " + compara );
        
        // Comparación de Strings, a su vez, convertimos los Integer 'a' y 'b' en Strings con valueOf()
        System.out.println("Comparación de Strings");
        String cadena =  String.valueOf(a);
        String cadena2 = String.valueOf(b);
        System.out.println("Cadenas comparadas. Son iguales? " +  cadena.equals(cadena2));
        
        // Op. relacionales
        boolean menorQue = a < b ;
        boolean mayorQue = a > b ;
        boolean menorIgualQue = a <= b;
        boolean mayorIgualQue = a >= b;
        System.out.println("Distintos: \n a menor que b " + menorQue + "  \n a mayor que b" + mayorQue );
        System.out.println("a menor o igual que b: " + menorIgualQue);
        System.out.println("a mayor o igual que b: " + mayorIgualQue);
        
        /*
          * Comprobación de números pares e impares.
        */
        
        if ( a % 2 == 0 ){
            System.out.println(a + " - Número par");
        }else{
            System.out.println(a+ " -  Número impar");
        }
        if ( b % 2 == 0){
            System.out.println(b + " - Número par");
        }else{
            System.out.println(b + " - Es impar");
        }
        
    }
    
}


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class OperadoresEnJava {
    public static void main(String[] args) {
        int a = 365 , b = 12;
        
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
        a += 1;
        System.out.println("a vale: " + a);
        b *= 3;
        System.out.println("b vale: " + b);
        
        /*
          *  Cálculo de operadores unarios
        */
         
        b = a/9;
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
        System.out.println("Valores de los catetos: " + a + "\n" + b + "\n");
        System.out.println("Resultado de la hipotenusa: " + hipotenusa);
    }
    
}

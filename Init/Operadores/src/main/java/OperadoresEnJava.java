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
        
    }
}

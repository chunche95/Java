/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Calculos {
    public static int sumar(int a, int b){
        System.out.println("-- Sobrecarga de métodos con enteros");
        return a+ b;
        
    }
    public static double sumar(double a, double b){
        System.out.println(">> Sobrecarga de métodos con doubles");
        return a+ b;
        
    }
}

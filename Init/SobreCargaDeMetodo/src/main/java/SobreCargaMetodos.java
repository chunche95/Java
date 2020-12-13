/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class SobreCargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultado de enteros: " + Calculos.sumar(5,3));
        System.out.println("Resultado de decimales: " + Calculos.sumar(5.0,3.0));
        System.out.println("Resultado de mix (int + double) : " + Calculos.sumar(5,3.0));
        System.out.println("Resultado de mix (double + int) : " + Calculos.sumar(5.0,3));
        System.out.println("Resultado de mix (int + Long) : " + Calculos.sumar(5,3L));
        System.out.println("Resultado de mix (double + Long) : " + Calculos.sumar(5.0,3L));
        System.out.println("Resultado de mix (float + Long) : " + Calculos.sumar(5F,3L));
        System.out.println("Resultado de mix (double + char) : " + Calculos.sumar(5.0,'A'));
        System.out.println("Resultado de mix (int + char) : " + Calculos.sumar(5,'A'));
        System.out.println("Resultado de mix (long + char) : " + Calculos.sumar(5L,'A'));
        System.out.println("Resultado de mix (float + char) : " + Calculos.sumar(5L,'A'));
    }
}

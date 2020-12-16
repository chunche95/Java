/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author pauli
 */
public class MatrizPrueba {
    public static void main(String[] args) {
        
        // Declaro e instancio la matriz int edades
        int edades [][] = new int[3][2];
        
        // Instancio valores a la matriz, valor por default = 0 
        /*
                                            COLUMNAS
                                   ________/\ ______
                                /                               \
                                 +___ ___ ___  _____+
                                 |_0.0_|_0.1_|_0.2_|
                                 |_1.0_|_1.1_|_1.2_|
                    FILAS -->|_2.0_|_2.1_|_2.2_|
                                 |_3.0_|_3.1_|_3.2_|
                                 |_4.0_|_4.1_|_4.2_|
                                 +_5.0_|_5.1_|_5.2 +
        */
        edades[0][0]= 35;
        edades[0][1]= 30;
        edades[1][0]= 25;
        edades[1][1]= 20;
        edades[2][0]= 15;
        edades[2][1]= 10;
        
        // iMPRIMIMOS valores
        System.out.println("Matriz enteros: índice 0.0: " + edades[0][0]);
        System.out.println("Matriz enteros: índice 0.1: " + edades[0][1]);
        System.out.println("Matriz enteros: índice 1.1: " + edades[1][1]);
        System.out.println("Matriz enteros: índice 2.0: " + edades[2][0]);
        
    }
}

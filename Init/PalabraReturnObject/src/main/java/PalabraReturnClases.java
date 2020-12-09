/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s = creaObjeto();
        System.out.println("Valor de memoria: " + s);
        System.out.println("Resultado de llamar el método sumar: " + s.sumar());
        
    }
    
    private static Suma creaObjeto(){
        Suma suma = new Suma(10,12);
        return suma;
    }
    
}


class Suma{
    int a , b;
    
    public Suma(int a, int b){
        /*
          *     Palabra this.
          *     - Es una referencia implícita al objeto que se está ejecutando.
          *     - Es útil evitar la ambigüedad entre las variables de clase y las locales.
          *     - Permite a un objeto enviarse él mismo como parámetro
          */
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return (this.a + this.b);
    }
}
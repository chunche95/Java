/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Caja {
    /* Variables de la caja: alto -a , largo - l, profundo -p */
    int a, l, p;
    /* Definición del constructor vacío */
    public Caja(){
        System.out.println("Reservando memoria");
    }
    
    public Caja(int a, int l , int p){
        this.a = a;
        this.l = l;
        this.p = p;
        System.out.println("Constructor con 3 argumentos preparado.");
    }
    
    /*
      * MÉTODO
    */
    public int volumen(){
        return a*l*p;
    }
    
}

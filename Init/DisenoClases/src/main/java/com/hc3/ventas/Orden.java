/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hc3.ventas;

import java.time.LocalDate;

/**
 *
 * @author pauli
 */
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProducto;
    private static final int MAX_PRODUCTOS = 10;
    LocalDate fecha = LocalDate.now();
    public Orden(){
        this.idOrden = ++contadorOrden;
        // Iniciamos el array
        productos =  new Producto[MAX_PRODUCTOS];
    }
    
    public void addProducto(Producto producto){
        if(this.contadorProducto < MAX_PRODUCTOS){
            productos[contadorProducto++] = producto;
        }else{
            System.out.println("Cesta llena - Máx. productos: " +MAX_PRODUCTOS);
        }
        
    }
    
    public double calcTotal (){
        double total = 0;
        for(int i=0; i < this.contadorProducto; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){        
        System.out.println(fecha + " | Orden: #" + this.idOrden );
        System.out.println("\n");
        System.out.println("Productos de la cesta.");
        for (int i = 0; i < this.contadorProducto ; i++) {
            System.out.println(i + ">" + productos[i]);
        }
        System.out.println("\t____________________________");
        System.out.println("\t Total de la oden: €" + this.calcTotal());
        System.out.println("\t____________________________");
    }
    
}

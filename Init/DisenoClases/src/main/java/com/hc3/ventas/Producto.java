/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hc3.ventas;
/**
 *
 * @author pauli
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    // Constructor vacío
    private Producto(){
        this.idProducto = ++contadorProducto;
    }
    
    // Constructor sobrecargado de 2 argumentos
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    @Override
    public String toString() {
        return "| Producto |  · ID: " + idProducto + "\n\t Descrip:" + nombre + "\n\t | Precio:" + precio + '}';
    }
    
    
}

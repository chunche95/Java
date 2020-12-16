/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import com.hc3.ventas.*;

/**
 *
 * @author pauli
 */
public class Ventas {
    public static void main(String[] args) {
        // crear productos
        Producto p1 = new Producto("Móvil PocoPhone BL| 256Gb+6Gb | 2500mAh" , 250);
        Producto p2 = new Producto("Móvil Samsung BK| 128Gb+4Gb | 3500mAh" , 350);
        Producto p3 = new Producto("Móvil Iphone YE| 64Gb+4Gb | 2500mAh" , 650);
        Producto p4 = new Producto("Móvil Sony Xperia Z3  GR| 512Gb+12Gb | 5500mAh" , 850);
        Producto p5 = new Producto("Móvil Xiaomi BL| 256Gb+6Gb | 3800mAh" , 390);
        
        // Creamos un objeto de tipo orden
        Orden miPedido1 = new Orden();
        
        // Agregamos los productos
        miPedido1.addProducto(p1);
        miPedido1.addProducto(p2);
        miPedido1.addProducto(p5);
        miPedido1.addProducto(p5);
        
        // Imprimimos ticket
        miPedido1.mostrarOrden();
        
        
    }
}

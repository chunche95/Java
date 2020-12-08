/*
 * Proyecto de Aritmética para estudiar el uso de clases, métodos y objetos en Java
 */

/**
 *
 * @author pauli
 */
public class Aritmetica {
    /*
     * Constructor de la clase => Se llama igual que la clase
    */
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacío");
    }
    
    
    /*
     *  public int sumar(args)=> Firma del método
     *      - public => Modificador de acceso
     *      - int => Tipo de regreso
     *      - sumar => Nombre del método
     *      - (int a, int b) => Argumentos del método
     *  {} => Cuerpo del método
    */
    public int sumar(int a, int b){
        int resultado = a+b;
        return resultado;
    }
}

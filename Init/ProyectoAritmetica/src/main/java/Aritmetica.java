/*
 * Proyecto de Aritmética para estudiar el uso de clases, métodos y objetos en Java
 */

/**
 *
 * @author pauli
 */
public class Aritmetica {
    
    /*
     * INICIALIZAMOS LOS ARGUMENTOS DE LA CLASE con sus valores por defecto.
     * Sirven en caso de que el usuario NO introduzca ningún valor para estas variables, el programa 
     * tomará los valores que definamos aquí, al no indicarle nada, será su V. default = 0.
    */
    int a; 
    int b; 
    
    /*
     * Constructor de la clase => Se llama igual que la clase
     * Nos sirve para inicializar las variables de nuestra clase y reservar espacion en memoria.
    */
    public Aritmetica(){
        a = 3; 
        b = 10;
        System.out.println("Ejecutando constructor vacío para reservar espacio en memoria.");
    }
    
    public Aritmetica(int arg1 , int arg2){
        a =  arg1;
        b = arg2;
    }
    
    
    /*
     *  public int sumar(args)=> Firma del método
     *      - public => Modificador de acceso
     *      - int => Tipo de regreso
     *      - sumar => Nombre del método
     *      - (int a, int b) => Argumentos del método, si los dejo vacios los paréntesis usará los valores por defecto.
     *  {} => Cuerpo del método
    */
    public int sumar(){
        int resultado = a+b;
        return resultado;
    }
}

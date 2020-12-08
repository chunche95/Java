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
     * CONSTRUCTORES: inicializa un objeto cuando se crea. Tiene el mismo nombre que su clase y es sintácticamente similar a un método. Sin embargo, los constructores no tienen un tipo de devolución explícito. 
     *
     * Constructor de la clase => Se llama igual que la clase
     * Nos sirve para inicializar las variables de nuestra clase y reservar espacion en memoria.
    */
    public Aritmetica(){
        a = 3; 
        b = 10;
        System.out.println("Ejecutando constructor vacío para reservar espacio en memoria.");
    }
    
    public Aritmetica(int a , int b){
                         //    |    
        this.a = a;  //<···+    En int a es el valor que se asignará como argumento a la variable 'this.a' del programa
        this.b = b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }
    
    
    /*
     * MÉTODOS: conjunto de instrucciones definidas dentro de una clase, que realizan una determinada tarea y a las que podemos invocar mediante un nombre.
     *
     *  public int sumar(args)=> Firma del método
     *      - public => Modificador de acceso
     *      - int => Tipo de regreso
     *      - sumar => Nombre del método
     *      - (int a, int b) => Argumentos del método, si los dejo vacios los paréntesis usará los valores por defecto.
     *  {} => Cuerpo del método
    */
    public int sumar(){
        return this.a+this.b;
    }
    public int restar(){
        return this.a-this.b;
    }
    public int multiplicar(){
        return this.a*this.b;
    }
    public int dividir(){
        return this.a/this.b;
    }
}

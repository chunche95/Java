
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return this.idPersona;
    }
    
    /*
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    */
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
     String generateRandomWord(int wordLenth){
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        int wordLength = 10;
       StringBuilder sb = new StringBuilder(wordLength);
       for(int i = 0; i < wordLength; i++) {  // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a'));  // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
       }
       return sb.toString();
     }
    
    @Override
    public String toString(){
        return   "........................ contador: " + contadorPersonas + "........................" +" \nNombre: " + nombre +"\n\t ID Persona: " + idPersona +   "\n\t Password: " + nombre+"-"+generateRandomWord(contadorPersonas);
    }
    
   
    
}

/*
 * Usando el esquema de umlet.com para aplicar el esquema de herencia.
 */

/**
 *
 * @author pauli
 */
public class Persona {

    private String nom;
    private char gen;
    private int edad;
    private String dir;

    // Constructor vacio
    public Persona() {

    }

    // Constructor con un argumento
    public Persona(String nombre) {
        this.nom = nombre;
    }

    // Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nom = nombre;
        this.gen = genero;
        this.edad = edad;
        this.dir = direccion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nom + ", Género=" + gen + ", Edad=" + edad + ", Dirección=" + dir + '}';
    }

}

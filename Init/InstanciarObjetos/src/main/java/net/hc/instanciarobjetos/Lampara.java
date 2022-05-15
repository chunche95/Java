/*
 * Instanciar objetos
 */
package net.hc.instanciarobjetos;

/**
 * @date 15 de mayo de 2022
 * @version  0.1
 * @author Paulino Esteban Bermúdez Rodríguez | humancomputing.net
 */
public class Lampara {
    private String color;
    private boolean encendida;
    /**
     * El objeto de tipo Lampara puede instanciarse con un color elegido al 
     * instanciarlo, o con el color "Azul" predeterminado.
     * @param color 
     */
    public Lampara(String color) {
        this.color = color;
    }
    public Lampara(){
        this("Azul");
    }
    public String getColor() {
        return color;
    }
    /**
     * Asigna a encendida el valor contrario al que posee
     */
    public void interruptor(){
        encendida = !encendida;
        System.out.println("Lámpara: " + encendida);
    }
    public boolean isEncendida() {
        return encendida;
    }
}
class LamparaCreator{
    public static void main(String[] args) {
        Lampara lampara = new Lampara();
        System.out.println(lampara.getColor() + " " + lampara.isEncendida()); // Azul y false
        lampara.interruptor();
        System.out.println(lampara.getColor() + " " + lampara.isEncendida()); // Azul y true
        System.out.println(lampara); //Ubicacion en memoria del PC de Lampara
    }
}

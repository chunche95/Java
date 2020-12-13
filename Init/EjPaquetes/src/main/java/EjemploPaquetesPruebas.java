/*
 * Llamamos instruccion del paquete es.hc3
 *
 * @author pauli
 */

// Importamos la librería del paquete que hemos creado
import es.hc3.Utileria;
// importamos el método estático del paquete que tenemos creado
import static es.hc3.Utileria.despedir;

public class EjemploPaquetesPruebas {
    public static void main(String[] args) {
        // es.hc3.Utileria.imprimir("Mi mensaje");  -> Fully qualified name
        
        // Importamos la clase de nuestro paquete
        Utileria.imprimir("  HOLA XAVALES!, por ejemplo");
        
        // Imprimiendo el método estático del paquete creado
        despedir("a todos!");
    }
}

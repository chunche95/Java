/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrafinal;

/**
 *
 * @author pauli
 */
public final class ClaseFinal {
    // Variables finales
    public final int varNumero = 12;
    
    // Constantes
    public static final int VAR_PRIMITIVO = 15;
    
    
    // Apuntamos al objeto persona pero al ser final no puede apuntar a otro objeto pero si puede modificarse
    public static final Persona VAR_PERSONA = new Persona();
    
    // metodo final
    public final void metodoFinal(){
    
    }
    
}

/*
  *  // No podemos cear clases hijas de una clase marcada como FINAL, nos da error.
  * class ClaseHija extends ClaseFinal(){
  *
  *     // no es posible modificar el comportamiento (sobreescritura) de un método padre marcado como final
  *     public void metodoFinal(){
  *         [mis cambios]
  *     }
  * }
*/

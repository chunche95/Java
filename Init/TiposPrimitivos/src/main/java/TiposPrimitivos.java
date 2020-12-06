/*
 * Tipos primitivos en Java
 */

/**
 *
 * @author pauli
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte / short / int / long / float / double / char / boolean
        byte byteVar = 127;
        System.out.println("byteVar " + byteVar);

        System.out.println("bits tipo byte: " +  Byte.SIZE);
        System.out.println("Bytes tipo byte: " + Byte.BYTES);
        System.out.println("Valor mínimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor mínimo tipo byte: " + Byte.MAX_VALUE);
        System.out.println("----------------------");
        
        short shortVar = 1024;
        System.out.println("shortVar " + shortVar);

        System.out.println("bits tipo short: " +  Short.SIZE);
        System.out.println("Bytes tipo short: " + Short.BYTES);
        System.out.println("Valor mínimo tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor mínimo tipo short: " + Short.MAX_VALUE);
        System.out.println("----------------------");
        
        
        int intVar = 5600;
        System.out.println("intVar " + intVar);

        System.out.println("bits tipo int: " +  Integer.SIZE);
        System.out.println("Bytes tipo int: " + Integer.BYTES);
        System.out.println("Valor mínimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("Valor mínimo tipo int: " + Integer.MAX_VALUE);
        System.out.println("----------------------");
        
        
        long longVar =  9223372036854775807L;
        System.out.println("longVar " + longVar);

        System.out.println("bits tipo long: " +  Long.SIZE);
        System.out.println("Bytes tipo long: " + Long.BYTES);
        System.out.println("Valor mínimo tipo long: " + Long.MIN_VALUE);
        System.out.println("Valor mínimo tipo long: " + Long.MAX_VALUE);
        System.out.println("----------------------");
        
        
        
        float floatVar =  922337203685477.5807F;
        System.out.println("floatVar " + floatVar);

        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("Bytes tipo float: " + Float.BYTES);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor mínimo tipo float: " + Float.MAX_VALUE);
        System.out.println("----------------------");
        
        
        double  doubleVar =  229223372036854775807D;
        System.out.println("doubleVar " + doubleVar);

        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("Bytes tipo double: " + Double.BYTES);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor mínimo tipo double: " + Double.MAX_VALUE);
        System.out.println("----------------------");
        
        char  charVar = '\u0021';
        System.out.println("charVar " + charVar);
        char charVar2 = 33;
        System.out.println("charVar2 " + charVar2);
        char  charVar3 = '!';
        System.out.println("charVar3 " + charVar3);

        System.out.println("bits tipo Character: " + Character.SIZE);
        System.out.println("Bytes tipo Character: " + Character.BYTES);
        System.out.println("Valor mínimo tipo Character: " + Character.MIN_VALUE);
        System.out.println("Valor mínimo tipo Character: " + Character.MAX_VALUE);
        System.out.println("----------------------");
        
        // Boolean variable is Tue or False.
        System.out.println("True tipo de boolean: " +  Boolean.TRUE);
        System.out.println("True tipo de boolean: " +  Boolean.FALSE);
        boolean booleanVarT = true;
        boolean booleanVarF = false;
        System.out.println("Los valores de las variables son: ");
        System.out.println(booleanVarT);
        System.out.println(booleanVarF);
        System.out.println("----------------------");
        
    }
    
}

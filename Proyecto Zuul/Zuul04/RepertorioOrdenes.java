/**
 * 
 * Esta clase contiene la relación de comandos - órdenes -
 * que reconoce el juego. Se utiliza para reconocer órdenes que
 * teclea el usuario.
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class RepertorioOrdenes 
{
    private static final String[] ordenesValidas =
        {  "ir", "salir", "ayuda", "ver", "comer" };

    /**
     * Constructor - inicializa las órdenes
     */
    public RepertorioOrdenes() 
    {
        // no hace nada
    }

    /**
     * Verifica si una cadena (String) dada es una
     * palabra de comando válida. 
     * @return true Si la orden es válida
     * false si no lo es
     */
    public boolean esOrden(String cadena)
    {
        for (int i = 0; i < ordenesValidas.length; i++)
            if (ordenesValidas[i].equals(cadena))  return true;
        return false;
    }

    /**
     * Ejemplo página 225 de los apuntes  
     */
    public void mostrarTodos()
    {
        for(int i = 0; i < ordenesValidas.length; i++)
            System.out.println(ordenesValidas[i] + " ");        
        System.out.println("");
    }

}
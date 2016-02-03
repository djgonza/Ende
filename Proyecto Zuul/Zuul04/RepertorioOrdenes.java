/**
 * 
 * Esta clase contiene la relaci�n de comandos - �rdenes -
 * que reconoce el juego. Se utiliza para reconocer �rdenes que
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
     * Constructor - inicializa las �rdenes
     */
    public RepertorioOrdenes() 
    {
        // no hace nada
    }

    /**
     * Verifica si una cadena (String) dada es una
     * palabra de comando v�lida. 
     * @return true Si la orden es v�lida
     * false si no lo es
     */
    public boolean esOrden(String cadena)
    {
        for (int i = 0; i < ordenesValidas.length; i++)
            if (ordenesValidas[i].equals(cadena))  return true;
        return false;
    }

    /**
     * Ejemplo p�gina 225 de los apuntes  
     */
    public void mostrarTodos()
    {
        for(int i = 0; i < ordenesValidas.length; i++)
            System.out.println(ordenesValidas[i] + " ");        
        System.out.println("");
    }

}
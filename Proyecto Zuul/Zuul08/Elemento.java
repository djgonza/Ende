
/**
 *  class Elemento  
 * 
 * @author  
 * @version  
 */
public class Elemento
{
     
    private String nombre;
    private int peso; //gramos

    /**
     * Constructor de la clase Elemento
     */
    public Elemento(String nombre, int peso)
    {
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     *  
     */
    public String getNombre()
    {
         return this.nombre;
    }
    
    /**
     *  
     */
    public int getPeso()
    {
         return this.peso;
    }
    
    /**
     *  
     */
    public String toString()
    {
        return nombre + " de " + peso + " gramos.";
    }

}

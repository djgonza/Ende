
/**
 *  class Elemento  
 * 
 * @author  
 * @version  
 */
public class Elemento
{
     
    private String nombre;
    private String descripcion;
    private int peso; //gramos

    /**
     * Constructor de la clase Elemento
     */
    public Elemento(String nombre, String descripcion ,int peso)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
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
    public String getDescripcion()
    {
         return this.descripcion;
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
        return nombre + "(" + descripcion + ")" +" de " + peso + " gramos.";
    }

}

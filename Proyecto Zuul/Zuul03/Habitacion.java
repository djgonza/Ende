import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/**
 * Clase Habitacion  - una habitación en el juego de aventuras
 * Una habitación representa una posición en el escenario. Está
 * conectada con otras habitaciones a través de salidas: salida norte,
 * este, sur, oeste.
 * Para cada dirección la habitación almacena una referencia a su 
 * habitación contigua o null si no existe salida en esa dirección. 
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class Habitacion 
{
    private String descripcion;    
    private HashMap<String, Habitacion> salidas;
   
    /**
     * Crea una habitación inicialmente sin salidas.
     * La descripción es algo así como "laboratorio", "el bar"
     * @param descripcion La descripción de la habitación
     */
    public Habitacion(String descripcion)
    {
        this.descripcion = descripcion;       
        salidas = new HashMap<String, Habitacion> ();
    }
    
//      /**
//      * Establece las salidas de la habitación. Cada dirección
//      * conduce hacia una habitación o es null
//      * 
//      * @param norte La salida norte.
//      * @param este  La salida este.
//      * @param sur   La salida sur.
//      * @param oeste La salida oeste.
//      */
//     public void setSalidas(Habitacion norte, Habitacion este,
//                            Habitacion sur, Habitacion oeste) 
//     {
//       if (norte != null)       salidas.put("norte", norte);
//       if (este != null)        salidas.put("este", este);
//       if (sur != null)         salidas.put("sur", sur);
//       if (oeste != null)       salidas.put("oeste", oeste);
//     }

    /**
     *  
     */
    public Habitacion getSalida(String direc)
    {
        return salidas.get(direc);
    }

    /**
     *  
     */
    public void setSalida(String direc, Habitacion vecina)
    {
        salidas.put(direc,vecina);
    }
    
    /**
     * @return La descripción de la habitación.
     */
    public String getDescripcion()
    {
        return descripcion;
    }
    
    /**
     *   
     */
    public String getStringDeSalidas()
    {
        //obteniro de apuntes página 221
        String stringADevolver = "Salidas: ";
        Set<String> llaves = salidas.keySet();
        for(String salida : llaves)
            stringADevolver += " " + salida;
        return stringADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
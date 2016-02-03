//parte a�adida - 14/01/16
import java.util.HashMap;
/**
 * Clase Habitacion  - una habitaci�n en el juego de aventuras
 * Una habitaci�n representa una posici�n en el escenario. Est�
 * conectada con otras habitaciones a trav�s de salidas: salida norte,
 * este, sur, oeste.
 * Para cada direcci�n la habitaci�n almacena una referencia a su 
 * habitaci�n contigua o null si no existe salida en esa direcci�n. 
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class Habitacion 
{
    private String descripcion;
    //parte a�adida - 14/01/16 | eliminadas claves privadas.
    private HashMap<String, Habitacion> salidas;
   
    /**
     * Crea una habitaci�n inicialmente sin salidas.
     * La descripci�n es algo as� como "laboratorio", "el bar"
     * @param descripcion La descripci�n de la habitaci�n
     */
    public Habitacion(String descripcion)
    {
        this.descripcion = descripcion;
        //parte a�adida - 14/01/16
        salidas = new HashMap<String, Habitacion> ();
    }
    
     /**
     * Establece las salidas de la habitaci�n. Cada direcci�n
     * conduce hacia una habitaci�n o es null
     * 
     * @param norte La salida norte.
     * @param este  La salida este.
     * @param sur   La salida sur.
     * @param oeste La salida oeste.
     */
    public void setSalidas(Habitacion norte, Habitacion este,
                           Habitacion sur, Habitacion oeste) 
    {
      //parte modificada - 14/01/16
      if (norte != null)       salidas.put("norte", norte);
      if (este != null)        salidas.put("este", este);
      if (sur != null)         salidas.put("sur", sur);
      if (oeste != null)       salidas.put("oeste", oeste);
    }

    /**
     *  
     */
    public Habitacion getSalida(String direc)
    {
        //parte a�adida - 14/01/16
//         if(direccion.equals("norte")){  return (salidaNorte);}
//         if(direccion.equals("este")){  return (salidaEste);}
//         if(direccion.equals("sur")){  return (salidaSur);}
//         if(direccion.equals("oeste")){  return (salidaOeste);}
        return salidas.get(direc);
    }

    /**
     * @return La descripci�n de la habitaci�n.
     */
    public String getDescripcion()
    {
        return descripcion;
    }
    
    /**
     *  parte a�adida - 14/01/16  
     */
    public String getStringDeSalidas()
    {
        String resul = "Salidas: \n";
        if (getSalida("norte") != null)      resul += "norte";
        if (getSalida("este") != null)       resul += "este ";
        if (getSalida("oeste") != null)      resul += "oeste ";
        if (getSalida("sur") != null)        resul += "sur ";
        return resul;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
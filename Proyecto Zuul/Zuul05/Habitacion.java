import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
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
    private HashMap<String, Habitacion> salidas;
    private Elemento elem;
   
    /**
     * Crea una habitaci�n inicialmente sin salidas.
     * La descripci�n es algo as� como "laboratorio", "el bar"
     * @param descripcion La descripci�n de la habitaci�n
     */
    public Habitacion(String descripcion)
    {
        this.descripcion = descripcion;       
        salidas = new HashMap<String, Habitacion> ();
    }
    
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
     *  
     */
    public void setElemento(Elemento elem)
    {
        this.elem = elem;
    }
    
    /**
     * @return La descripci�n de la habitaci�n.
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
        //obteniro de apuntes p�gina 221
        String stringADevolver = "Salidas: ";
        Set<String> llaves = salidas.keySet();
        for(String salida : llaves)
            stringADevolver += " " + salida;
        return stringADevolver;
    }
    
    /**
     *  
     */
    public String getDescripcionLarga()
    {
        return "Estas en " + descripcion + "\n" + "Contenido: " + elem.toString() + "\n" + getStringDeSalidas();
    }

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
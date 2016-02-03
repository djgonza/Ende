import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
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
    private ArrayList <Elemento> elementos;

    /**
     * Crea una habitación inicialmente sin salidas.
     * La descripción es algo así como "laboratorio", "el bar"
     * @param descripcion La descripción de la habitación
     */
    public Habitacion(String descripcion)
    {
        this.descripcion = descripcion;       
        salidas = new HashMap<String, Habitacion> ();
        elementos = new ArrayList <Elemento> ();
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
    public void agregarElemento(Elemento elem)
    {
        elementos.add(elem);
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

    /**
     *  
     */
    public String getDescripcionLarga()
    {
        return "Estas en " + descripcion + "\n" 
        + getStringElementos() 
        + "\n" + getStringDeSalidas();
    }

    /**
     *  
     */
    public String getStringElementos()
    {
        String resul = "Contenido: \n";
        for(Elemento elem : elementos)
            resul += elem.toString() + "\n";
        return resul;
    }

    /**
     *  
     */
    public Elemento getElemento(String nombre)
    {
        for(Elemento elem : elementos)
        {
            if(elem.getNombre().equals(nombre))
                return elem;
        }
        return null;
    }
    
    /**
     *  
     */
    public void poner(Elemento elem)
    {
        elementos.add(elem);
    }

    /**
     *  
     */
    public void quitar(Elemento elem)
    {
        elementos.remove(elem);
    }
}
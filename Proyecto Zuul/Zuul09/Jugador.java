import java.util.Stack;
/**
 *  class Jugador  
 * 
 * @author  
 * @version  
 */
public class Jugador
{
    private String nombre;
    private Habitacion actual; 
    private Stack<Habitacion> anteriores;
    private Elemento elem;

    /**
     * Constructor de la clase Jugador
     */
    public Jugador(String nombre, Habitacion inicial)
    {
        this.nombre = nombre;
        actual = inicial;
        anteriores = new Stack<Habitacion>();
        elem = null;
    }

    /**
     *  
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     *  
     */
    public Habitacion getActual()
    {
        return actual;
    }


    /**
     *  
     */
    public String getStringDeElementosCargados()
    {
        String resul = "El jugador lleva: \n";
        //for(Elemento elem : elementos)
            resul += elem.toString() + "\n";
        return resul;
    }
    
    /**
     *  
     */
    public String getDescripcionLarga()
    {
        return "Jugador: " + nombre + "\n";
    } 
        
    /**
     *  
     */
    public void ver()
    {
        System.out.println(actual.getDescripcionLarga());
    }

    /**
     *  
     */
    public void comer()
    {
        System.out.println("Ya ha comido y no tiene más hambre");
    }

    /** 
     * Intentar ir en una dirección. Si hay una salida entrar en la nueva
     * habitación, sino escribir un mensaje de error.
     */
    public void irAHabitacion(Orden orden)
    {
        if (!orden.haySegundaPalabra()) 
        {   // si no hay segunda palabra no se sabe adónde ir
            System.out.println("¿Ir a dónde?");
            return;
        }

        String direc = orden.getSegundaPalabra();

        // intentar salir de la habitación actual
        Habitacion siguiente = actual.getSalida(direc);        
        if (siguiente == null)
            System.out.println("No hay salida por esa dirección");
        else
        {
            anteriores.push(actual);
            actual = siguiente;
            System.out.println(actual.getDescripcionLarga());
        }
    }

    /**
     *  
     */
    public void tomar(Orden orden)
    {
        if (!orden.haySegundaPalabra()) 
        {   // si no hay segunda palabra no se sabe adónde ir
            System.out.println("¿Tomar qué?");
            return;
        }

        String objeto = orden.getSegundaPalabra();
        Elemento tomado = actual.getElemento(objeto);
        // intentar salir de la habitación actual                
        if (tomado == null)
            System.out.println("El objeto no está en la habitación");
        else
        {
            elem = tomado;
            actual.quitar(tomado);
            System.out.println("He tomado el objeto: " + tomado.toString());
        }
    }
    
    /**
     *  
     */
    public void dejar(Orden orden)
    {
        if (!orden.haySegundaPalabra()) 
        {   // si no hay segunda palabra no se sabe adónde ir
            System.out.println("¿Dejar qué?");
            return;
        }

        String objeto = orden.getSegundaPalabra();
        Elemento dejado = actual.getElemento(objeto);
        // intentar salir de la habitación actual                
        if (dejado == null)
            System.out.println("No tienes ese objeto");
        else
        {
            elem = dejado;
            actual.poner(dejado);
            System.out.println("He dejado el objeto: " + dejado.toString());
        }
    }
    
    /**
     *  
     */
    public void volver()
    {
        if(!anteriores.isEmpty())
        {
            actual = anteriores.pop();
            System.out.println("Has vuelto a la habitación anterior");
            ver();
        }
        else
             System.out.println("Todo el camino ha sido desandado");    
    }
}


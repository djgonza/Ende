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
        System.out.println("Ya ha comido y no tiene m�s hambre");
    }

    /** 
     * Intentar ir en una direcci�n. Si hay una salida entrar en la nueva
     * habitaci�n, sino escribir un mensaje de error.
     */
    public void irAHabitacion(Orden orden)
    {
        if (!orden.haySegundaPalabra()) 
        {   // si no hay segunda palabra no se sabe ad�nde ir
            System.out.println("�Ir a d�nde?");
            return;
        }

        String direc = orden.getSegundaPalabra();

        // intentar salir de la habitaci�n actual
        Habitacion siguiente = actual.getSalida(direc);        
        if (siguiente == null)
            System.out.println("No hay salida por esa direcci�n");
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
    public void volver()
    {
        if(!anteriores.isEmpty())
        {
            actual = anteriores.pop();
            System.out.println("Has vuelto a la habitaci�n anterior");
            ver();
        }
        else
             System.out.println("Todo el camino ha sido desandado");    
    }
}


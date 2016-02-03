import java.util.Scanner;
import java.util.StringTokenizer; 
/**
 * Lee entrada de usuario e intenta interpretarlas como comandos del 
 * juego. Lee una linea de texto del terminal e intenta interpretar
 * la l�nea como una orden de dos palabras. Devuelve un objeto de la
 * clase Orden.
 *
 * El analizador reconoce un conjunto de �rdenes. Analiza la orden tecleada
 * por el usuario compar�ndola con el repertorio de �rdenes que �l
 * reconoce. Si la entrada no es una orden conocida devuelve un objeto
 * Orden que indica que el comando no se reconoce.
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */
public class Analizador 
{
    private RepertorioOrdenes ordenes;  // todos los comandos v�lidos
    private Scanner teclado;         // fuente para introdcir comandos

     /**
     * Crea el analizador para leer desde el terminal de texto.
     */
    public Analizador() 
    {
        ordenes = new RepertorioOrdenes();
        teclado = new Scanner(System.in);
    }
     /**
     * @return El siguiente comando del usuario.
     */
    public Orden getOrden() 
    {
        String lineaEntrada;  // almacena la l�nea completa de entrada
        String pal1 = null;
        String pal2 = null;
        System.out.print("> ");    
        lineaEntrada = teclado.nextLine();
        // Localizar dos palabras de la l�nea.
        Scanner tokenizer = new Scanner(lineaEntrada);
        if(tokenizer.hasNext()) 
        {   pal1 = tokenizer.next();      // obtener primera palabra
            if (tokenizer.hasNext())
                pal2 = tokenizer.next();  // obtener segunda palabra
                // nota: se ignora el resto de la l�nea de entrada.
        }
        // Verificar si la orden es conocida. Si es as� se crea un
        // objeto Orden con ella
        // Si no, se crea una orden "null" (para comando desconocido)
        if (ordenes.esOrden(pal1)) 
                    return new Orden(pal1, pal2);
             else   return new Orden(null, pal2); 
    }
    
    /**
     *  
     */
    public String mostrarComandos()
    {
        return ordenes.getListaComandos();
    }

}
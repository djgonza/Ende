/**
 * La clase guarda información sobre una orden que teclea el usuario.
 * 
 * Una orden consta de dos cadenas: "coger libro", "ir norte".
 * Si la orden solo consta de una palabra, la segunda cadena será null.
 * 
 * Realmente la primera palabra es la que representa el comando y habrá
 * que verificar que es una orden válida.
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class Orden 
{
      private String palabraOrden;
      private String segundaPalabra;
    
     /**
     * Crea un objeto orden.
     * Se proporciona la primera y segunda palabras del comando.
     * Una o las dos pueden ser null.
     * 
     * @param primeraPalabra   La primera palabra del comando.
     *                         Es null si no se reconoce
     * @param segundaPalabra  La segunda palabra del comando.
     */
      public Orden(String primeraPalabra, String segundaPalabra)
      {
          this.palabraOrden = primeraPalabra;
          this.segundaPalabra = segundaPalabra;
      }
    
     /**
     * Devuelve la orden (primera palabra). Si el comando no se
     * reconoce es null
     * @return  La palabra del comando.
     */
     public String getPalabraOrden()
     {
          return palabraOrden;
     }
     
     /**
     * @return La segunda palabra del comando.
     * Devuelve null si no hay segunda palabra.
     */
     public String getSegundaPalabra()
     {
         return segundaPalabra;
     }
     
     /**
     * @return true si la orden no se reconoce.
     */
     public boolean ordenDesconocida()
     {
          return (palabraOrden == null);
     }
     /**
     * @return true si la orden tiene segunda palabra
     */
     public boolean haySegundaPalabra()
     {
         return segundaPalabra != null;
     }
}
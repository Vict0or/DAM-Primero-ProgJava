package ActividadDNI;

public class DNIException extends Exception{
    /**
     * En esta clase crearemos una expcecion propia heredando de la clase Padre Exception
     * Creamos un constructor por parametros para enviar el mensaje de la excepcion
     * @param mensaje
     */
    public DNIException(String mensaje){
        super(mensaje);
    }
    
}

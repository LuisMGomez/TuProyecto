package sumador;

public class ASumar {

	/**
	 * Muestra el valor de la suma de todos y cada uno de los dígitos que componen un número.
	 * @param cad : cadena compuesta por digitos de (0-9).  
	 * @return  : los digitos de cad separados por el simbolo + y el valor de la suma de todos sus digitos, en caso de error devuelve cadena vacia.
	 */
	public String mostrar(String cad) {
        String numero = cad;
        char digito;
                
        // Compruebo que la longitud es correcta =1
        if (cad.length()==1) {
        	digito=cad.charAt(0);
        	
        	// Compruebo que es un digito numerico valido
        	if ( digito>='0' && digito<='9') {
        		// Respuesta 
                return (numero + " = " + numero);
            } 
        }
        // Respuesta por fallo de formato
        return "";
	}
}

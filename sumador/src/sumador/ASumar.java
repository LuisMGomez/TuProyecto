package sumador;
/**
 * @author Luis Manuel Gomez Gonzalez.
 * Calcula el valor de la suma de todos y cada uno de los dígitos que componen un número.
 */

public class ASumar {

	/**
	 * @author Luis Manuel Gomez Gonzalez.
	 * 
	 * Muestra el valor de la suma de todos y cada uno de los dígitos que componen un número.
	 * 
	 * @param cad  cadena compuesta por digitos de (0-9).  
	 * @return   los digitos de cad separados por el simbolo + y el valor de la suma de todos sus digitos, en caso de error devuelve cadena vacia.
	 */
	public String mostrar(String cad) {
        
        char digito;
        int longitud= cad.length();
        String respuesta="";
        int suma=0;
        boolean ok=true;
        int i=0;
        
        // Compruebo que no es un valor negativo
        if ( longitud>0 && cad.charAt(0)!='-' ) {
        	
	        while( i<longitud  && ok ) {
	        	digito=cad.charAt(i);
	       	
	        	// Compruebo que es un digito numerico valido
	        	if ( digito>='0' && digito<='9') {
	        		
	        		// Concateno la Respuesta 
	        		respuesta+= (i==0)?"":" + ";
	                respuesta+= (digito);
	                
	                // Calculo la suma
	                suma+=(digito-'0');
	                
	            }else {
	            	ok=false;
	            } 
	        	i++;
	        }
	        
        } else {
        	ok=false;
        }
        
        // Respuesta final
        if(ok) {
        	respuesta+=(" = " + suma); // Correcto
        } else {
        	respuesta=""; // Ha habido algun error
        }	
        
        return respuesta;
	}
}

package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Luis Manuel Gomez Gonzalez.
 * 
 * Pruebas para la clase ASumar.
 * 
 * 
 */
public class TestAsumar {

	/** Comprobacion para numeros una cifra */
	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        
        // Comprobar valor correcto rango
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
        
        // Comprobar valor correcto limite
        resultado = sumi.mostrar("0");
        assertEquals("0 = 0",resultado );
        
        // Comprobar valor correcto limite
        resultado = sumi.mostrar("9");
        assertEquals("9 = 9",resultado );
        
        // Comprobar valor no correcto
        resultado=sumi.mostrar("x");
        assertEquals("",resultado );
              
        // Comprobar valor no correcto 
        resultado=sumi.mostrar("");
        assertEquals("",resultado );
        
    }
	
	/** Comprobacion para numeros negativos */
	@Test
    public void testValorNegativo() {
        ASumar sumi = new ASumar();
        
        // Comprobar valor no correcto varias cifras
        String resultado = sumi.mostrar("-4575");
        assertEquals("",resultado );
        
        // Comprobar valor no correcto dos cifras
        resultado = sumi.mostrar("-54");
        assertEquals("",resultado );
        
        // Comprobar valor no correcto una cifra
        resultado = sumi.mostrar("-5");
        assertEquals("",resultado );
   
    }
	
	/** Comprobacion para numeros mayores de 9 */
	@Test
    public void testVariasCifras() {
        ASumar sumi = new ASumar();
        
        // Comprobar valor correcto varias cifras
        String resultado = sumi.mostrar("4575");
        assertEquals("4 + 5 + 7 + 5 = 21",resultado );
        
        // Comprobar valor correcto dos cifras
        resultado = sumi.mostrar("54");
        assertEquals("5 + 4 = 9",resultado );
        
        // Comprobar valor correcto una cifra
        resultado = sumi.mostrar("1234567");
        assertEquals("1 + 2 + 3 + 4 + 5 + 6 + 7 = 28",resultado );
   
    }
	

}

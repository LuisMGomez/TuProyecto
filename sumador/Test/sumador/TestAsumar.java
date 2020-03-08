package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsumar {

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
        resultado=sumi.mostrar("21");
        assertEquals("",resultado );
        
        // Comprobar valor no correcto 
        resultado=sumi.mostrar("");
        assertEquals("",resultado );
        
    }

}

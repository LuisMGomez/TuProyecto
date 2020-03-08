package sumador;

/**
 * 
 * @author Luis Manuel Gomez Gonzalez
 *
 */
public class LMGGFunciona {

	public static void main(String[] args) {
		
		ASumar suma=new ASumar();
		System.out.println("#####  A  S U M A R #####\n") ;
		
		// VALORES CORRECTOS
		System.out.println(suma.mostrar("2"));
		System.out.println(suma.mostrar("25"));
		System.out.println(suma.mostrar("1234"));
		System.out.println(suma.mostrar("12345"));
		
		// NO IMPRIME VALORES ERRONEOS
		System.out.println(suma.mostrar("X15"));
		System.out.println(suma.mostrar("-125"));
		System.out.println(suma.mostrar("-12345"));

	}

}

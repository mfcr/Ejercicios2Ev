package Unidad6;
import java.io.FileInputStream; 
import java.util.Scanner;
import java.io.FileNotFoundException;

public class pruebaexcepciones {

	/*CODIGO EJERCICIO 6 */
	pruebaexcepciones e = new pruebaexcepciones(); 
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		String opcion; 
		while (!(opcion = in.next()).equalsIgnoreCase("fin")) {
			try {
				lanzarExcepcion(Integer.parseInt(opcion));
			} catch (ArithmeticException e) {
				System.out.println("Error Arithmetico");
			} catch (FileNotFoundException e) {
				System.out.println("No existe el fichero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("El array no es tan grande"); //
			} catch (NullPointerException e) {
				System.out.println("El puntero apunta a null");
			} catch (ClassNotFoundException e) {
				System.out.println("No existe esa clase");
			} catch (StackOverflowError e) {
				System.out.println("Bucle infinito. ERROR");
			} catch (Exception e) {
				System.out.println (e);
			}
		}
		in.close(); 
	} 

	static void lanzarExcepcion(int opcion) throws Exception { 
		switch (opcion) { 
			case 1: 
				System.out.println(1 / 0); 
				break; 
			case 2: 
				int [] a = new int[10]; 
				a[a.length] = a.length; 
				break; 
			case 3: 
				FileInputStream in = new FileInputStream("este fichero no existe"); 
				break; 
			case 4: 
				Object o = null; 
				System.out.println(o.toString()); 
				break; 
			case 5: 
				pruebaexcepciones e = new pruebaexcepciones(); 
				break; 
			default: 
				Class.forName("UnaClase"); 
		} 
	} 
	
	
	
	/*CODIGO EJERCICIO 5
	StringBuilder cadena = new StringBuilder("a"); 
	void metodoA() { 
		try { 
			cadena.append("b"); 
			metodoB(); 
		} catch (Exception e) { 
			cadena.append("c"); 
		} finally { 
			cadena.append("2"); 
		} 
		cadena.append("3");	} 
	
	void metodoB() throws Exception { 
		try { 
			cadena.append("d"); 
			metodoC(); 
		} catch (Exception e) { 
			throw new Exception(); 
		} finally { 
			cadena.append("e"); 
		} 
		cadena.append("f"); 
	} 
	
	void metodoC() throws Exception { 
		throw new Exception(); 
	} 
	
	String getCadena() { 
		return cadena.toString(); 
	} 
	
	public static void main(String[] args) { 
		pruebaexcepciones e = new pruebaexcepciones(); 
		e.metodoA(); 
		System.out.println(e.getCadena()); 
	}*/
	
	/*CODIGO EJERCICIO 4
	public static void main(String[] args) { 
		try { 
			System.out.println("Antes de metodoA"); 
			metodoA(); 
			System.out.println("Despues de metodoA"); 
		} catch (NumberFormatException e) { //(Exception e) { 
			System.out.println("main: " + e); 
		} finally { 
			System.out.println("main: finally"); 
		} 
	} 
	
	public static void metodoA() { 
		try { 
			System.out.println("Antes de metodoB"); 
			metodoB(); 
			System.out.println("Despues de metodoB"); 
		} catch (NumberFormatException e) { //(Exception e) { 
			System.out.println("metodoA: " + e); 
		} finally { 
			System.out.println("metodoA: finally"); 
		} 
	} 
	
	public static void metodoB() { 
		try { 
			System.out.println("Antes de metodoC"); 
			metodoC(); 
			System.out.println("Despues de metodoC"); 
		} catch (NumberFormatException e) { //(ArrayIndexOutOfBoundsException e) { 
			System.out.println("metodoB: " + e); 
		} finally { 
			System.out.println("metodoB: finally"); 
		} 
	} 
	public static void metodoC() { 
		try { 
			System.out.println("Antes de metodoD"); 
			metodoD(); 
			System.out.println("Despues de metodoD"); 
		} catch (NumberFormatException e) { 
			System.out.println("metodoC: " + e); 
		} finally { 
			System.out.println("metodoC: finally");
		}
	}
	
	
	public static void metodoD() { 
		try { 
			int a[] = new int[4]; 
			a[a.length] = a.length; 
		} catch (ClassCastException e) { 
			System.out.println("metodoD: " + e); 
		} finally { 
			System.out.println("metodoD: finally"); 
		}
	}*/
	
}

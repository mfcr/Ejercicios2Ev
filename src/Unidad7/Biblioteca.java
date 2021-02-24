package Unidad7;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
	
	public static void main(String[] args) {
		ArrayList<Publicaciones> catalogo=new ArrayList<Publicaciones>();
		//Añadimos 1 libro/1 revista/1 otras publicaciones con cada constructor.
		//Le añadimos datos usando sus métodos.
		Libros libro1=new Libros();
		libro1.setCodigo("L21");
		libro1.setTitulo("La isla del tesoro");
		//No introducimos año en libro1;
		libro1.setAutores(new ArrayList<String>(Arrays.asList("R.S.Stevenson","su Primo")));
		catalogo.add(libro1);
		Libros libro2=new Libros(new ArrayList<String>(Arrays.asList("R.S.Stevenson","su Primo")));
		libro2.setCodigo("pdte");
		libro2.setTitulo("Aventuras de Tom Sawyer");
		libro2.setAnyo(1894);
		libro2.prestar();
		catalogo.add(libro2);
		catalogo.add(new Libros("e32","La isla del tesoro 2ªParte",2001,new ArrayList<String>(Arrays.asList("R.S.Stevenson","su otro Primo"))));

		Revistas rev1=new Revistas(345,2,21); //Nº,mes,dia.
		rev1.setCodigo("R78");
		rev1.setTitulo("Vogue");
		rev1.setAnyo(2020);
		catalogo.add(rev1);
		catalogo.add(new Revistas("R79","Vogue",2020,346,3,20)); //codigo,titulo,anyo,Nº,mes,dia.
		
		catalogo.add(new OtrasPublicaciones("o1","Tocata y fuga,Bach",1740,"CD"));
		catalogo.add(new OtrasPublicaciones("o2","La jungla de cristal",1740,"VHS"));
		
		//Invocamos a método toString.
		
		//EL POLIMORFISMO SE PONDE DE MANIFIESTO AL PODER REALIZAR UNA VARIABLE DE TIPO PUBLICACIONES QUE PUEDE RECOGER
		// VARIABLES DE TODAS SUS CLASES "HIJAS" YA QUE TANTO LIBRO COMO RESICTA O OTRASPUBLICACIONES TAMBIEN SON
		// PUBLICACIONES.
		//ASIMISMO AL LLAMAR AL MÉTODO TOSTRING --> SE LLAMA AL METODO PROPIO DE CADA CLASE Y NO AL GENERAL DE PUBLICACIONES.
		for (int i=0;i<catalogo.size();i++) {
			System.out.println(catalogo.get(i).toString());
		}
		System.out.println();
		//Prestamos todos los elemsntos prestables.
		for (int i=0;i<catalogo.size();i++) {
			
			if (catalogo.get(i) instanceof Prestables) {
				if (((Prestables)catalogo.get(i)).prestar()) {
					System.out.println("Prestado: "+catalogo.get(i).toString());
				} else {
					System.out.println("Ya estaba prestado: "+catalogo.get(i).toString());
				}
			} else {
				System.out.println("No se puede prestar: "+catalogo.get(i).toString());
			}
		}
		
		
	}

}

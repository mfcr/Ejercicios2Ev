package Unidad5;

import java.util.ArrayList;
import java.util.Collection;

public class PruebaLibro {

	public static void main(String[] args) {
		
		Collection<Autor> autores=new ArrayList<Autor>();
		
		Autor aut=new Autor("Luis","H","luis@hotmail.es");
		autores.add(aut);
		aut=new Autor("Luisa","M","luisa@yahooc.om");
		autores.add(aut);
		aut=new Autor("Maria","M","maria@gamil.om");
		autores.add(aut);

		Collection<Autor> autores2=new ArrayList<Autor>();		
		aut =new Autor("Luis","H","luis@hotmail.es");
		autores2.add(aut);
		
		Libro esteLibro=new Libro("Las aventuras dell pirata cojo",autores, (float)12.34,2);
		Libro otroLibro=new Libro("El ocho",autores2, (float)50.34);
		
		System.out.println(esteLibro.toString());
		System.out.println(otroLibro.toString());
		
		esteLibro.setPrecio((float)1.34);
		otroLibro.setStock(24);

		System.out.println(esteLibro.toString());
		System.out.println(otroLibro.toString());

		
	}

}

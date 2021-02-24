package Unidad7;


import java.util.List;
import java.util.Arrays;

public class Libros extends Prestables {
	private List<String> autores;
	
	public Libros() {
		super();
		autores=Arrays.asList(new String[] {});
	}
	public Libros(List<String> autores) {
		super();
		this.autores=autores;
	}

	public Libros(String codigo,String titulo,int anyo,List<String> autores) {
		super(codigo,titulo,anyo);
		this.autores=autores;
	}

	
	public List<String> getAutores() { return autores; }
	
	public void setAutores(List<String> autores) {
		this.autores=autores;
	}
	
	public void addAutor(String autor) {
		autores.add(autor);
		
	}
	public void delAutores() {autores.clear();}
	
	
	public String toString() {
		return("Libro "+super.toString());
	}

	
	
}

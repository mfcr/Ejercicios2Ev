package Unidad5;

import java.util.Collection;

public class Libro {
	private String titulo;
	private Collection<Autor> autores;
	private float precio;
	private int stock;
	//Constructores.
	public Libro(String titulo, Collection<Autor> autores, float precio) {
		this.titulo=titulo;
		this.autores=autores;
		this.precio=precio;
		this.stock=0; //Valor por defecto.
	}
	public Libro(String titulo, Collection<Autor> autores, float precio,int stock) {
		this.titulo=titulo;
		this.autores=autores;
		this.precio=precio;
		this.stock=stock; 
	}
	//Getters & setters
	public String getTitulo() { return (titulo);}
	public Collection<Autor> getAutores() { return(autores);}
	public float getPrecio() { return(precio);}
	public int getStock() { return(stock);}
	public void setPrecio(float precio) { this.precio=precio; }
	public void setStock(int stock) { this.stock=stock; }
	//toString
	public String toString() {
		String texto=titulo+". Autores: (";
		for (Autor aut : autores) {
			texto+=aut.getNombre()+", ";
		}
		texto=texto.substring(0,texto.length()-1)+") ";
		texto+=" Precio: "+precio+". Stock: "+stock;
		return texto;
	}
	
	
}

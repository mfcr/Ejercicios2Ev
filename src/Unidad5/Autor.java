package Unidad5;

public class Autor {
	private String nombre;
	private String email;
	private String genero;
	//Constructor.
	public Autor(String nombre, String email, String genero) {
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
	}
	//Getters & setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getGenero() {
		return genero;
	}
	//toString
	@Override
	public String toString() {
		return (nombre+" ("+genero+") "+email);
	}
	
	
}

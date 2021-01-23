package Unidad5;

public class Naipe {
	
	private String palo;
	private String nombre;
	private int valor;
	
	public Naipe(String palo,String nombre, int valor) {
		this.palo=palo;
		this.nombre=nombre;
		this.valor=valor;
	}
	public void setNombre(String nombre) {this.nombre=nombre;}
	public void setPalo(String palo) {this.palo=palo;}
	public void setValor(int valor) {this.valor=valor;}
	public String getNombre() {return(nombre);}
	public String getPalo() {return(palo);}
	public int getValor() {return(valor);}
	
	@Override public String toString() {
		return ("La carta es el "+nombre+"de "+palo+" y tiene el valor "+valor);
	}
	
}

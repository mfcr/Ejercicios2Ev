package Unidad5;

public class Pokemon {
	private String nombre;
	private String elemento;
	private int ptosSalud;
	
	public Pokemon (String nombre, String elemento, int ptosSalud) {
		this.nombre=nombre;
		this.elemento=elemento;
		this.ptosSalud=ptosSalud;
	}
	public String getElemento() {
		return elemento;
	}
	public boolean isAlive() {
		if (ptosSalud>0) {return true;} else {return false;}
	}
	
	public boolean cambiaVida(int cambiar) {
		ptosSalud+=cambiar;
		return (isAlive());
	}
	
	@Override
	public String toString() {
		return (nombre+" "+elemento+" "+ptosSalud);
	}
	
	
}

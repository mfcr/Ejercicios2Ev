package Unidad7;


public class Empleados {
	private String nombre;
	private String ctaBancaria;
	
	public Empleados(String nombre, String ctaBancaria) {
		this.nombre=nombre;
		this.ctaBancaria=ctaBancaria;
	}
	
	public String getNombre() {return nombre;}
	public String getCtaBancaria() {return ctaBancaria;}
	public void setCtaBancaria(String ctaBancaria) {this.ctaBancaria=ctaBancaria;}
	
	public String toString() {
		return "Nombre: "+nombre+", Cuenta:"+ctaBancaria;
	}
	
	public String pagar(double cantidad, String concepto) {
		return ("Pagados: "+cantidad+" €, al empleado: "+nombre+" por el concepto:"+concepto);
	}
	
	

}

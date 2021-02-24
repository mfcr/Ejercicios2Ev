package Unidad7;

import java.util.Date;

public class Asalariados extends Empleados {

	private String apellidos;
	private Date fechaContratacion;
	
	public Asalariados(String nombre, String apellidos, Date fechaContratacion, String ctaBancaria) {
		super(nombre,ctaBancaria);
		this.apellidos=apellidos;
		this.fechaContratacion=fechaContratacion;
	}
	
	public String getApellidos() {return apellidos;}
	public Date getFechaContratacion() {return fechaContratacion;}
	

	public String toString() {
		return "Nombre: "+getNombre()+", Apellidos:"+apellidos+", FechaContratacion:"+fechaContratacion+", Cuenta:"+getCtaBancaria();
	}
	
	public String pagar(double cantidad, String concepto) {
		return ("Pagados: "+cantidad+" €, al asalariado: "+getNombre()+", "+apellidos+" por el concepto:"+concepto);
	}
	
	

}

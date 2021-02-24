package Unidad7;

public class EmpServicios extends Empleados {
	private String servicio;
	
	public EmpServicios(String nombre,String servicio,String ctaBancaria) {
		super(nombre,ctaBancaria);
		this.servicio=servicio;
	}
	public String getServicio() {return servicio;}
	
	
	public String pagar(double cantidad, String concepto) {
		return ("Pagados: "+cantidad+" €, a la empresa de servicios: "+getNombre()+" servicio: "+servicio+" en la cuenta: "+getCtaBancaria()+" por el concepto:"+concepto);
	}
	
	
}

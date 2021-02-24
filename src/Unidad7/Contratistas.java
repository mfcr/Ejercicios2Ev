package Unidad7;

import java.util.ArrayList;

public class Contratistas extends Empleados{
	private ArrayList<SocAnonimas> sociedades;
	
	public Contratistas(String nombre, String ctaBancaria) {
		super(nombre,ctaBancaria);
		sociedades=new ArrayList<SocAnonimas>();
	}
	public Contratistas(String nombre, String ctaBancaria,ArrayList<SocAnonimas> sociedades) {
		super(nombre,ctaBancaria);
		this.sociedades=sociedades;
	}

	public String toString() {
		String aux="\nNombre: "+getNombre()+", Cuenta:"+getCtaBancaria();
		for (int i=0;i<sociedades.size();i++) {
			aux+="   - "+sociedades.get(i).toString()+"\n";
		}
		return aux;
	}
	
	public void addSociedad(SocAnonimas sociedad) {sociedades.add(sociedad);}
	public void delSociedades() {sociedades.clear();}

	public String pagar(double cantidad, String concepto) {
		return "Pago procesado al contratista: "+getNombre()+" de "+cantidad+" € por el servicio: "+concepto; 
	}

	
	
}

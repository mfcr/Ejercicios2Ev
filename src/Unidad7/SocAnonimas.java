package Unidad7;

import java.util.ArrayList;
import java.util.Iterator;

public class SocAnonimas {
	private String nombre;
	private ArrayList<String> trabajos;
	
	public SocAnonimas (String nombre) {
		this.nombre=nombre;
		trabajos=new ArrayList<String>();
	}
	
	public SocAnonimas (String nombre, ArrayList<String> trabajos) {
		this.nombre=nombre;
		this.trabajos=trabajos;
	}

	public void addTrabajo(String trabajo) {
		trabajos.add(trabajo);
	}
	
	public void borraTrabajos() {trabajos.clear();}
	
	public void borraTrabajos(String trab) {
		Iterator<String> it=trabajos.iterator();
		while(it.hasNext()) {
			if (it.next().equals(trab)) {
				it.remove();
			}
		}
	}
	
	public String toString() {
		String aux="Nombre: "+nombre+", Trabajos:";
		for (int i=0;i<trabajos.size();i++) {
			aux+=trabajos.get(i)+",";
		}
		return aux;
	}

}

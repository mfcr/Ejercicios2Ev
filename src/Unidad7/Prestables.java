package Unidad7;

import java.util.Date;

public class Prestables extends Publicaciones {
	private boolean prestado;
	private Date fechaprestamo;
	
	public  Prestables() {
		super();
		prestado=false;
	}
	
	public  Prestables(String codigo,String titulo,int anyo) {
		super(codigo,titulo,anyo);
		prestado=false;
	}


	public boolean prestar() {
		if (prestado) {return false;}
		prestado=true; 
		fechaprestamo=new Date();
		return true;
	}
	public boolean devolver() {
		if (!prestado) {return false;}
		prestado=false;
		fechaprestamo=null;
		return true;
	}
	public String toString() {
		return(super.toString()+" estado: "+ (prestado?"prestado":"libre"));
	}

	public boolean estaPrestado() {return prestado;}
	public Date getFechaPrestamo() {return fechaprestamo; }
	public void setFechaPrestamo(Date fecha) { this.fechaprestamo=fecha; }
	
}

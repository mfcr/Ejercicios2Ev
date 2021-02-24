package Unidad7;

public class OtrasPublicaciones extends Prestables{
	private String tipo;
	
	public OtrasPublicaciones () {
		super();
		tipo="Desconocido";
	}
	public OtrasPublicaciones (String codigo,String titulo,int anyo) {
		super(codigo,titulo,anyo);
		tipo="Desconocido";
	}
	

	public OtrasPublicaciones (String codigo,String titulo,int anyo,String tipo) {
		super(codigo,titulo,anyo);
		this.tipo=tipo;
	}

	public void setTipo(String tipo) { this.tipo=tipo;}
	public String getTipo() {return tipo;}

	public String toString() {
		return(tipo+" "+super.toString());
	}
	

}

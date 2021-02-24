package Unidad7;


public class Revistas extends Publicaciones {
	private int numero;
	private int mes;
	private int dia;
	
	
	public Revistas() {
		super();
		this.numero=0;
		this.mes=0;
		this.dia=0;
	}
	
	public Revistas(int numero, int mes, int dia) {
		super();
		this.numero=numero;
		this.mes=mes;
		this.dia=dia;
	}

	public Revistas(String codigo,String titulo,int anyo) {
		super(codigo,titulo,anyo);
		this.numero=0;
		this.mes=0;
		this.dia=0;
	}

	public Revistas(String codigo,String titulo,int anyo,int numero, int mes, int dia) {
		super(codigo,titulo,anyo);
		this.numero=numero;
		this.mes=mes;
		this.dia=dia;
	}
	
	public void setNumero(int numero) {this.numero=numero;}
	public void setMes(int mes) {this.mes=mes;}
	public void setDia(int dia) {this.dia=dia;}
	
	public int getNumero() {return numero;}
	public int getMes() {return mes;}
	public int getDia() {return dia;}
	
	public String toString() {
		return("Revista "+super.toString()+ "Num/Mes/Dia: "+numero+"/"+mes+"/"+dia);
	}
	

}

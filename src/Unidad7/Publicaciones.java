package Unidad7;

public class Publicaciones {
	private String codigo;
	private String titulo;
	private int anyo;
	private boolean prestable;
	
	public  Publicaciones() {
		this.codigo="";
		this.titulo="";
		this.anyo=0;
		this.prestable=true;
	}
	
	public  Publicaciones(String codigo) {
		this.codigo=codigo;
		this.titulo="";
		this.anyo=0;
		this.prestable=true;
	}
	public  Publicaciones(String codigo,String titulo) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anyo=0;
		this.prestable=true;
	}
	
	public  Publicaciones(String codigo,String titulo,int anyo) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anyo=anyo;
		this.prestable=true;
	}

	public void setCodigo(String codigo) { this.codigo=codigo;}
	public void setTitulo(String titulo) { this.titulo=titulo;}
	public void setAnyo(int anyo) { this.anyo=anyo;}
	public void setPrestable(boolean prestable) {this.prestable=prestable;}
	
	public String getCodigo() {return codigo;}
	public String getTitulo() {return titulo;}
	public int getAnyo() {return anyo;}
	public boolean getPrestable() {return prestable;}
	
	public String toString()  {
		return ("["+getCodigo()+","+getTitulo()+","+String.valueOf(getAnyo())+"]");
		
	}
}

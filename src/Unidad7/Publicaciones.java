package Unidad7;

public class Publicaciones {
	private String codigo;
	private String titulo;
	private int anyo;
	
	public  Publicaciones() {
		this.codigo="";
		this.titulo="";
		this.anyo=0;
	}
	
	/*public  Publicaciones(String codigo) {
		this.codigo=codigo;
		this.titulo="";
		this.anyo=0;
	}
	public  Publicaciones(String codigo,String titulo) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anyo=0;
	}*/
	
	public  Publicaciones(String codigo,String titulo,int anyo) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.anyo=anyo;
	}

	public void setCodigo(String codigo) { this.codigo=codigo;}
	public void setTitulo(String titulo) { this.titulo=titulo;}
	public void setAnyo(int anyo) { this.anyo=anyo;}
	
	public String getCodigo() {return codigo;}
	public String getTitulo() {return titulo;}
	public int getAnyo() {return anyo;}
	
	public String toString()  {
		return ("["+getCodigo()+","+getTitulo()+","+String.valueOf(getAnyo())+"]");
		
	}
}

package Unidad7;


public class Televisores extends Electrodomesticos{
	private int pulgadas;
	private String sintonizador;
	
	public Televisores() { super(); pulgadas=20; sintonizador="DVB-T";}
	
	public Televisores(int pulgadas,String sintonizador) {
		super();
		setSintonizador(sintonizador);
		this.pulgadas=pulgadas;
	}
	
	public Televisores(double precio,Color color,Consumo consumo,int peso) {
		super(precio,color,consumo,peso);
		pulgadas=20; sintonizador="DVB-T";
	}

	public Televisores(double precio,Color color,Consumo consumo,int peso,int pulgadas,String sintonizador) {
		super(precio,color,consumo,peso);
		setSintonizador(sintonizador);
		this.pulgadas=pulgadas;
	}

	
	public void setPulgadas(int pulgadas) {this.pulgadas=pulgadas;}
	public boolean setSintonizador(String sintonizador) {
		if (sintonizador.equals("DVB-T") || sintonizador.equals("DVB-T2")) { this.sintonizador=sintonizador; return true;}
		this.sintonizador="ERROR";
		return false;
	}
	public int getPulgadas() {return pulgadas;}
	public String getSintonizador() {return sintonizador;}
		
	public String toString() {
		return super.toString()+", pulgadas:"+pulgadas+", sintonizador:"+sintonizador;
	}

	
}

package Unidad7;


public class Lavadoras extends Electrodomesticos {
	public int carga;
	
	public Lavadoras() { super(); setCarga(5);}
	
	public Lavadoras(int carga) {
		super();
		setCarga(carga);
	}

	public Lavadoras(double precio,Color color,Consumo consumo,int peso,int carga) {
		super(precio,color,consumo,peso);
		setCarga(carga);
	}
	
	
	public boolean setCarga(int carga) {
		if (carga<4 || carga>13 || carga==12) {return false;}
		this.carga=carga;
		setPrecioFinal(calculaPorcentaje());
		return true;
	}
	
	protected int calculaPorcentaje() {
		int porcentaje=0;
		if (carga>8) {porcentaje=10;}
		return super.calculaPorcentaje()+porcentaje;
	}
	
	
	public String toString() {
		
		return super.toString()+", Carga maxima:"+carga;
	}
}

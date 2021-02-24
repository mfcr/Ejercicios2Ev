package Unidad7;

public class Electrodomesticos {
	enum Color {BLANCO,GRIS,NEGRO,ROJO,AZUL};
	enum Consumo {A,B,C,D,E,F};
	private double precioBase;
	private Color color;
	private Consumo consumo;
	private int peso;
	private double precioFinal;
	
	public Electrodomesticos() {
		precioBase=0;
		color=Color.BLANCO;
		consumo=Consumo.F;
		peso=5;
		setPrecioFinal(calculaPorcentaje());
	}
	
	public Electrodomesticos(double precio,Color color,Consumo consumo,int peso) {
		this.precioBase=precio;
		this.color=color;
		this.consumo=consumo;
		this.peso=peso;
		setPrecioFinal(calculaPorcentaje());
	}

	public double getPrecioBase() {return precioBase;}
	public double getPrecioFinal() {return precioFinal;}
	public Color getColor() {return color;}
	public Consumo getConsumo() {return consumo;}
	public int getPeso() {return peso;}
	
	public void setPrecioBase(double precio) {
		this.precioBase=precio;
		setPrecioFinal(calculaPorcentaje());
	}
	public void setPeso(int peso) {
		this.peso=peso;
		setPrecioFinal(calculaPorcentaje());
	}
	public void setConsumo(Consumo consumo) {
		this.consumo=consumo;
		setPrecioFinal(calculaPorcentaje());
	}
	public void setColor(Color color) {this.color=color;}
	
	protected void setPrecioFinal(int porcentaje) {
		this.precioFinal=precioBase*(1+porcentaje/100.0);
	}
	
	protected int calculaPorcentaje() {
		int porcentaje=0;
		switch (consumo) {
			case A: porcentaje+=30; break;
			case B: porcentaje+=25; break;
			case C: porcentaje+=20; break;
			case D: porcentaje+=15; break;
			case E: porcentaje+=10; break;
			default: porcentaje+=5; break;
		}
		if (peso>0 && peso<20) {
			porcentaje+=5;
		} else if (peso<50){
			porcentaje+=10;
		} else if (peso<80) {
			porcentaje+=15;
		} else {
			porcentaje+=20;
		}
		
		return porcentaje;
	}
	
	
	public String toString() {
		return "Color:"+color+", Peso:"+peso+", Etq.Energetica:"+consumo+", precioBase:"+precioBase+", precioFinal:"+precioFinal;
		
	}

}

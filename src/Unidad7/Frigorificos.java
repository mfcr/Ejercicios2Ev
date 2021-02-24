package Unidad7;


public class Frigorificos extends Electrodomesticos{
	private boolean noFrost;
	
	public Frigorificos() { super(); noFrost=false;}
	
	public Frigorificos(boolean noFrost) {
		super();
		this.noFrost=noFrost;
	}
	
	public Frigorificos(double precio,Color color,Consumo consumo,int peso,boolean noFrost) {
		super(precio,color,consumo,peso);
		this.noFrost=noFrost;
	}

	public void setNoFrost(boolean noFrost) {this.noFrost=noFrost;}
	
	public boolean getNoFrost() {return noFrost;}
	
	public String toString() {
		return super.toString()+", NoFrost:"+(noFrost?"SI":"NO");
	}


}

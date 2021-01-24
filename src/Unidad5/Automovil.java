package Unidad5;

public class Automovil {
	private String modelo;
	private double capacidad;
	private double combustible;
	private double consumo;
	private int kmTotales;
	private double consumoTotal;
	
	public Automovil (String modelo, double capacidad, double combustible, double consumo) {
		this.modelo=modelo;
		this.capacidad=capacidad;
		this.combustible=combustible;
		this.consumo=consumo;
		this.kmTotales=0;
		this.consumoTotal=0.0;
	}

	public Automovil (String modelo, double capacidad, double consumo) {
		this.modelo=modelo;
		this.capacidad=capacidad;
		this.combustible=capacidad;
		this.consumo=consumo;
		this.kmTotales=0;
		this.consumoTotal=0.0;
	}
	
	public void llenarDeposito() {
		this.combustible=this.capacidad;
	}
	
	public double llenarDeposito(double litros) {
		double sobrante=0;
		if ((capacidad-combustible)<litros) {
			sobrante=litros-(capacidad-combustible);
			combustible=capacidad;
		} else {
			combustible+=litros;
		}
		return sobrante;
	}
	

	public double desplazar(int kms) {
		double esteConsumo=(kms/100.0)*consumo;
		//Si no se peude hacer el desplazamiento por falta de combustible devolvemos -1
		if (esteConsumo>combustible) {
			return -1;
		}
		combustible-=esteConsumo;
		kmTotales+=kms;
		consumoTotal+=esteConsumo;
		return esteConsumo;
	}
	
	public String getModelo() { return modelo;}
	public double getCapacidad() { return capacidad;}
	public double getCombustible() { return combustible;}
	public double getConsumo() { return consumo;}
	public int getkmTotales() { return kmTotales;}
	public double getConsumoTotal() { return consumoTotal;}
	
}

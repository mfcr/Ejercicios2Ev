package Unidad7;

import Unidad5.Mazo;
import Unidad5.Naipe;

public class Mano extends Mazo{
	
	public Mano() {
		super(0); //Iniciamos mano con 0 cartas.
	}
	
	public void addCarta(Naipe carta) {
		getCartas().add(carta);
	}
	
	public int getValor() {
		int valor=0;
		for (int i=0;i<getCartas().size();i++) {
			valor+=getCartas().get(i).getValor();
		}
		return valor;
	}
	
	public String toString() {
		String aux="El jugador tiene las siguientes cartas: ";
		for (int i=0;i<getCartas().size();i++) {
			aux+="\n -  "+getCartas().get(i).toString();
		}
		return aux+"\n  Valor total de la mano:"+getValor();
	}
	
	public Naipe get(int orden) {
		return getCartas().get(orden);
	}
	

}

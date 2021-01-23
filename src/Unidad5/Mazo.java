package Unidad5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Mazo {
	private String nombres[]= {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
	private String palos[]= {"Diamantes","Picas","Rombos","Corazones"};
	private ArrayList<Naipe> cartas=new ArrayList<Naipe>();
	private Random rnd=new Random();
	
	public Mazo() {
		for (int i=0;i<palos.length;i++) {
			for (int j=0;j<nombres.length;j++) {
				cartas.add(new Naipe(palos[i],nombres[j]));
			}
		}
	}
	
	public Mazo(int barajas ) {
		for (int k=0;k<barajas;k++) {
			for (int i=0;i<palos.length;i++) {
				for (int j=0;j<nombres.length;j++) {
					cartas.add(new Naipe(palos[i],nombres[j]));
				}
			}
		}
	}
	//Otros 2 constructores útiles para diversos juegos-->envio de un array de integers con los valore sde cada carta.
	public Mazo(int[]  valores) {
		for (int i=0;i<palos.length;i++) {
			for (int j=0;j<nombres.length;j++) {
				cartas.add(new Naipe(palos[i],nombres[j],valores[j]));
			}
		}
	}
	
	public Mazo(int barajas,int[] valores ) {
		for (int k=0;k<barajas;k++) {
			for (int i=0;i<palos.length;i++) {
				for (int j=0;j<nombres.length;j++) {
					cartas.add(new Naipe(palos[i],nombres[j],valores[j]));
				}
			}
		}
	}

	
	
	/**DEvuelve un Naipe al azar del mazo sin eliminarlo del mazo
	 * @return Naipe
	 */
	public Naipe get() {
		return cartas.get(rnd.nextInt(cartas.size()));
	}
	/**DEvuelve un Naipe al azar del mazo quitandolo del mazo
	 * @return Naipe
	 */
	public Naipe remove() {
		return cartas.remove(rnd.nextInt(cartas.size()));
	}
	/**Añade un Naipe al mazo
	 */
	public void add(Naipe nuevoNaipe) {
		cartas.add(nuevoNaipe);
	}
	/**Añade un conjunto de  Naipe al mazo
	 */
	public void add(Collection<Naipe> nuevosNaipes) {
		//OPCION 1 USANDO UN ITARATOR
		Iterator<Naipe> it=nuevosNaipes.iterator();
		while(it.hasNext()) {
			cartas.add(it.next());
		}
		//OPCION 2 USANDO UN FOREACH
		//for (Naipe np:nuevosNaipes) {
		//	mazo.add(np);
		//}
	}
	
	
	public int size() {
		return cartas.size();
	}
	
	@Override public String toString() {
		String mensaje="El mazo contiene las siguientes cartas: ";
		for (int i=0;i<cartas.size();i++) {
			mensaje+=" -  "+cartas.get(i).toString();
		}
		return mensaje;
	}
}

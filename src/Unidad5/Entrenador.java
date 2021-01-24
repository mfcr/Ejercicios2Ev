package Unidad5;

import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador {

	private String nombre;
	private int insignias;
	private ArrayList<Pokemon> pokemons=new ArrayList<Pokemon>();
	
	public Entrenador(String nombre) {
		this.nombre=nombre;
		insignias=0;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPokemon(Pokemon nuevoPok) {
		pokemons.add(nuevoPok);
	}
	
	public int getInsignias() {
		return insignias;
	}
	public void setInsignias(int insignias) {
		this.insignias=insignias;
	}
	public void addInsignias(int add) {
		this.insignias+=add;
	}
	public void cambiaVidaPokemons(int cantidad) {

		Iterator<Pokemon> it=pokemons.iterator();
		
		while(it.hasNext()) {
			Pokemon pok=it.next();
			pok.cambiaVida(cantidad);
			if (!pok.isAlive()) { it.remove();}
		}
		
	}
	
	public boolean tieneElemento(String elem) {
		boolean tiene=false;
		for (Pokemon pok:pokemons) {
			if (elem.trim().toLowerCase().equals(pok.getElemento().toLowerCase())) { tiene=true; break;}
		}
		return tiene;
	}
	
	@Override 
	public String toString()  {
		String txt="Entrenador: "+nombre+" Insignias: "+insignias+", Pokemons: " +pokemons.size()+"\n";
		for (Pokemon pok:pokemons) {
			txt+="   - "+pok.toString()+"\n";
		}
		return txt;
	}
}

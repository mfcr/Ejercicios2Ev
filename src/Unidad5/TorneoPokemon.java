package Unidad5;

import java.util.ArrayList;
import java.util.Scanner;

public class TorneoPokemon {

	public static void main(String[] args) {
		ArrayList<Entrenador> entrenadores=new ArrayList<Entrenador>();
		
		Scanner teclado=new Scanner(System.in);
		String txtIn="";
		System.out.println("Introduzca <nombreEntrenador> <nombrepokemon> <elemento> <salud> o torneo para salir: ");
		txtIn=teclado.nextLine();
		//Introduccion de datos de pokemons y antrenadores
		while (!txtIn.toLowerCase().equals("torneo") ) {
			String partes[]=txtIn.split(" ");
			try {
				//Creamos el pokemon
				Pokemon nuevoPok=new Pokemon(partes[1].trim(),partes[2].trim(),Integer.parseInt(partes[3].trim()));
				//Nombre del entrenador. 1º comprobar que no exista ya.
				boolean existe=false;
				for (Entrenador ent:entrenadores) {
					if (ent.getNombre().toLowerCase().equals(partes[0].trim().toLowerCase())) {
						ent.setPokemon(nuevoPok);
						existe=true;
						break;
					}
				}
				if (!existe) {
					Entrenador ent=new Entrenador(partes[0]);
					ent.setPokemon(nuevoPok);
					entrenadores.add(ent);
				}
			} catch(Exception e) {
				System.out.println ("error al introducir los datos.");
			}

			System.out.println("Introduzca <nombreEntrenador> <nombrepokemon> <elemento> <salud> o torneo para salir: ");
			txtIn=teclado.nextLine();

		}
		//Comenzamos torneo si hay entrenadores.
		if (entrenadores.size()>0) {
			System.out.println("Introduzca un elemento para este turno o fin para salir: ");
			txtIn=teclado.nextLine();
			
			while (!txtIn.toLowerCase().equals("fin") ) {

				for (Entrenador ent:entrenadores) {
					if (ent.tieneElemento(txtIn.trim().toLowerCase())) {
						ent.setInsignias(ent.getInsignias()+1);
						//ent.addInsignias(1);
					} else {
						ent.cambiaVidaPokemons(-10);
						
					}
				}
				
				System.out.println("Introduzca un elemento para este turno o fin para salir: ");
				txtIn=teclado.nextLine();
			}
			
			for (Entrenador ent:entrenadores) {
				System.out.println(ent.toString());
			}
			
		} else {
			System.out.println("No hay entrenadores mi pokemons, no se puede hacer el torneo.");
		}
		
		
		teclado.close();
	}

}

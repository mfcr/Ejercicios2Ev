package Unidad7;

import java.util.ArrayList;
import java.util.Scanner;

import Unidad5.Mazo;
import Unidad5.Naipe;

public class BlackJack {
	
	public static void main(String[] args) {
		ArrayList<Mano> manos=new ArrayList<Mano>();
		int[] valores= {2,3,4,5,6,7,8,9,10,11,10,10,10};
		Scanner teclado=new Scanner(System.in);
		String txtIn="";
		
		do {
			System.out.println("Para comenzar el juego, escriba repartir");
			BK();
			txtIn=teclado.nextLine();
			if (!txtIn.trim().toLowerCase().equals("repartir")) {
				continue;
			}
			int jugadores=0;
			do {
				System.out.println("Comienza el juego, introduzca numero de jugadores o nada/'fin' para salir:");
				BK();
				
				txtIn=teclado.nextLine();
				if (txtIn.length()>0) {
					jugadores=0;
					try { 
						jugadores=Integer.parseInt(txtIn);
					} catch (Exception e) {
						
						System.out.println("Introduzca valor valido.");
						continue;
					}
				}
			} while (!txtIn.equals("") && jugadores==0); //txtIn.length>0
			//Comienza el juego:
			//Sacamos una baraja nueva
			Mazo cartas=new Mazo(1,valores); //get() saca una carta del mazo.
			//Creamos los jugadores(jugadores+1 que es el crupier).Y les damos 1 carta a cada uno.
			for (int i=0;i<jugadores;i++) { 
				manos.add(new Mano());
				Naipe cartaNueva=cartas.get();
				manos.get(i).addCarta(cartaNueva);
			}
			
			for (int i=0;i<manos.size();i++) {
				System.out.println("\nCARTAS VISTAS:");
				muestra1Carta(manos);
				do {
					System.out.println();
					System.out.println("  Comienza decidiendo el jugador "+(i+1)+": pedir/plantarse/fin(salir)");
					System.out.println("\n"+manos.get(i).toString()+"\n");
					BK();
					txtIn=teclado.nextLine();
					if (txtIn.trim().toLowerCase().equals("fin")) {
						System.out.println("Seguro que desea salir s/n:");
						txtIn=teclado.nextLine();
						if (txtIn.trim().toLowerCase().equals("s")) {
							txtIn="";
							break;
						} 
					} else if (txtIn.trim().toLowerCase().equals("pedir")) {
						manos.get(i).addCarta(cartas.get());
						//Comprobamos puntuación del jugador.
						int valorActual=manos.get(i).getValor();
						if (valorActual>21) {
							System.out.println("\nOHHH, SE HA PASADO.\n");
							txtIn="plantarse"; //break;
						}
					}
				} while (!txtIn.trim().toLowerCase().equals("plantarse"));
				
			}
			//Sa ha acabado la ronda: comprobamos valores y ganador.
			if (manos.size()>0) {
				int ganador=-1, mejor=0;
				System.out.println("FIN DE LA PARTIDA:");
				for (int i=0;i<manos.size();i++) {
					System.out.println("JUGADOR "+(i+1));
					System.out.println("\n"+manos.get(i).toString()+"\n");
					int puntuacion=manos.get(i).getValor();
					if (puntuacion<21 && mejor<puntuacion) {mejor=puntuacion; ganador=i;}
				}
				if (ganador<0) {
					System.out.println("SE HAN PASADO TODOS LOS JUGADORES\n");
				}else {
					System.out.println("HA GANADO EL JUGADOR "+(ganador+1)+"\n");
				}
			}
		
		} while (txtIn.length()>0 );

		teclado.close();
	}
	
	public static void BK() {
		System.out.print("BlackJack >");
	}

	public static void muestra1Carta(ArrayList<Mano> manos) {

		for (int i=0;i<manos.size();i++) { //Jugador 0 es el crupier.
			System.out.println("El jugador "+(i+1)+" tiene boca arriba: "+manos.get(i).get(0).toString());
		}
	}
	
	
}

package Unidad5;


import java.util.Random;
import java.util.Scanner;

public class CartaMasAlta {
	
	/** eljuego comienza con el pc sacando una carta de inicio.
	 * A partir de ah� el usuario dice si la siguiente carta es m�s alta mas baja
	 * mientras vaya acertando seguir� juagando, cuando pierda comienza el ordenador
	 * y la mecanica sigue as� hasta que se acaban las cartas de la baraja.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] valores= {1,2,3,4,5,6,7,8,9,10,14,11,12,13};
		Mazo baraja=new Mazo(valores);
		Random rnd=new Random();
		int ptosUser=0,ptosPC=0;
		Naipe cartaArriba;
		Naipe cartaSacada;
		Scanner teclado = new Scanner (System.in);
		boolean jugador=true;
		cartaArriba=baraja.remove();
		System.out.println("INICIO DEL JUEGO: ");
		
		while (baraja.size()>0) {
			//Sacamos carta de la baraja
			cartaSacada=baraja.remove();
			System.out.println("\n  La carta visible es "+cartaArriba.toString());
			
			if (jugador) { //Le toca jugar al juagador
				String eleccion="";
				while (!eleccion.equals("+")  && !eleccion.equals("-")) {
					System.out.println("    Pulse + si cree que la siguiente carta es mas alta o - si cree que va a ser m�s baja:");
					eleccion=teclado.nextLine();
				}
				if ((eleccion.equals("+") && cartaSacada.getValor()>=cartaArriba.getValor()) || (eleccion.equals("-") && cartaSacada.getValor()<=cartaArriba.getValor())) {
					System.out.println("      Ha sacado la carta "+cartaSacada.toString()+", ha ganado un punto.");
					ptosUser++;
				} else {
					System.out.println("      Ha sacado la carta "+cartaSacada.toString()+", ha perdido el turno.");
					jugador=false;
				}
			} else { //Le toca jugar al PC.
				//MODO ALEATORIO
				//boolean pcElijeMas=true;
				//if (rnd.nextInt(2)==0) {pcElijeMas=false;}
				//MODO LOGICO
				boolean pcElijeMas=true;
				if (cartaArriba.getValor()>5) {pcElijeMas=false;}
				
				System.out.println("      El PC ha elegido "+(pcElijeMas==true?"+":"-"));
				if ((pcElijeMas && cartaSacada.getValor()>=cartaArriba.getValor()) || (!pcElijeMas && cartaSacada.getValor()<=cartaArriba.getValor())) {
					System.out.println("      PC ha sacado la carta "+cartaSacada.toString()+", PC ha ganado un punto.");
					ptosPC++;
				} else {
					System.out.println("      PC ha sacado la carta "+cartaSacada.toString()+", PC ha perdido el turno.");
					jugador=true; 
				}
			}
			cartaArriba=cartaSacada; 
		}
		System.out.println("PARTIDA TERMINADA. PUNTOS DEL USUARIO: "+ptosUser+", PUNTOS DEL ORDENADOR: "+ptosPC+(ptosUser>ptosPC?" HA GANADO.":" HA PERDIDO."));
		teclado.close();
	}
}

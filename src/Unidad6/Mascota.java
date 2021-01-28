package Unidad6;

import java.util.Random;

public class Mascota {
	private String nombre;
	private int energia;
	private Random rnd=new Random();
	
	public Mascota(String nombre) {
		this.nombre=nombre;
		this.energia=20;
	}
	public String getNombre() { return nombre; }
	public String come() {
		if (estado()>1) {
			if (rnd.nextInt(11)<=3) {
				energia=10; //Le ha sentado mal la comida.
			} else {
				energia+=5;
			}
		} else {
			energia--;
			return mensaje(4); //@@@ aqui hay que pulir, si se muere no avisa, solo dice que no puede comer, dormir, ejericico..
		}
		return mensaje(estado());
	}
	
	public String duerme() {
		if (estado()>1) {
			energia+=2;
		} else {
			energia--;
			return mensaje(4); //@@@ aqui hay que pulir, si se muere no avisa, solo dice que no puede comer, dormir, ejericico..
								// variable string aux que acumule mensaje.
		}
		return mensaje(estado());
	}
	
	public String ejercicio() {
		if (estado()>1) {
			energia-=3;
		} else {
			energia--;
			return mensaje(4);
		}
		return mensaje(estado()); //@@@ aqui hay que pulir, si se muere no avisa, solo dice que no puede comer, dormir, ejericico..
	}
	public String medicina() {
		if (estado()>1) {
			return mensaje(6);
		} else {
			energia=20;
			return mensaje(5);
		}
	}
	
	public int estado() {
		if (energia>55 || energia<0) {  //Muerto
			return 0;
		} else if (energia>50 || energia<5) { //Enfermo
			return 1;
		} else if (energia>46 || energia<8) { //
			return 2;
		} else {
			return 3;
		}
	}
	
	public boolean isAlive() {
		return estado()>0;
	}
	
	public String mensaje(int estado) {
		switch (estado) {
			case (0):
				return ("Pobre mascota, ha muerto"+toString());
			case (1):
				return ("Ouch "+toString());
			case (2):
				return ("Buah "+toString());
			case (4):
				return ("No puedo hacer nada cuando estoy malito. "+toString());
			case (5): 
				return ("Ahora estoy bien, estoy curado!! "+toString());
			case (6):
				return ("No deberia tomar nada si no estoy malo "+toString());
			default:
				return ("Guau "+toString());
		}
	}
	@Override public String toString() {
		return nombre+": "+energia;
	}

}

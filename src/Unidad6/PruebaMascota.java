package Unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaMascota {

	public static void main(String[] args) {
		ArrayList<Mascota> mascotas=new ArrayList<Mascota>();
		Scanner teclado=new Scanner(System.in) ;
		String txtIn="";
		while (!txtIn.toLowerCase().trim().equals("salir")) {
			txtIn=teclado.nextLine().toLowerCase().trim();
			if (txtIn.length()==0) {
				System.out.print("Error, introduzca algo.");
				continue;
			}
			String intro[]=txtIn.split(" ");
			//localizamos a la mascota.
			int ms=-1;
			for (int i=0;i<mascotas.size();i++) {
				if (mascotas.get(i).getNombre().equals(intro[1])) {
					ms=i; break;
				}
			}
			//Vemos la accion.
			if (intro[0].equals("crear")) {
				if (ms>-1) {
					System.out.print("La mascota ya existe, cree otra con otro nombre");
				} else {
					ms=mascotas.size();
					mascotas.add(new Mascota(intro[1]));
					System.out.println("Bienvenido "+mascotas.get(ms).toString());
				}
			} else { 
				if (ms!=-1) {
					if (intro[0].equals("comer")) { //@@@ si se quisiese se podria meter todo esto dentro de la clase Mascota como método que acepta el String, discrimina qué hacer y devuelve String.
						System.out.println((mascotas.get(ms)).come());
					} else if (intro[0].equals("curar")) {
						System.out.println((mascotas.get(ms)).medicina());
					} else if (intro[0].equals("ejercicio")) {
						System.out.println((mascotas.get(ms)).ejercicio());
					} else if (intro[0].equals("dormir")) {
						System.out.println((mascotas.get(ms)).duerme());
					} else {
						System.out.println("Comando no reconocido");
					}
					if (!mascotas.get(ms).isAlive()) {
						mascotas.remove(ms);
					}
				} else {
					System.out.println("no Existe esa mascota");
				}
			}
		}
		teclado.close();
	}

}

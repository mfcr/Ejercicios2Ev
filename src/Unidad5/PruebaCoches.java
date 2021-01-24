package Unidad5;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCoches {

	public static void main(String[] args) {
		ArrayList<Automovil> coches=new ArrayList<Automovil>();
		Scanner teclado=new Scanner(System.in);
		String txtIn="";
		int altas=-1;
		//Primera linea = nº coches a introducir.
		do {
			System.out.println("Introduzca el numero de coches a dar de alta: ");
			txtIn=teclado.nextLine();
			try {
				altas=Integer.parseInt(txtIn);
			} catch (Exception e) {
				System.out.println("   HE DICHO UN NUMERO.");
			}
		} while (altas<=0);
		System.out.println("Muy bien, ahora introduzca los coches (1 de cada modelo) según el siguiente formato: ");
		System.out.println(" Modelo capacida_depodito litros_en_deposito consumo_cada_100km");
		while (coches.size()<altas) {
			txtIn=teclado.nextLine();
			try {
				String vars[]=txtIn.split(" ");
				coches.add(new Automovil(vars[0],Double.parseDouble(vars[1]),Double.parseDouble(vars[2]),Double.parseDouble(vars[3]))); 
			} catch (Exception e) {
				System.out.println("   ERROR de FORMATO, vuelva a intentarlo.");
			}
		}
		System.out.println("\n Los vehiculos han sido dados de alta. ");
		do {
			System.out.println("A continuación introduzca desplazar <modelo> <kilometros> o intro para salir.");
			txtIn=teclado.nextLine();
			try {
				String vars[]=txtIn.split(" ");
				if (vars[0].toLowerCase().equals("desplazar")) {
					//Localizamos el coche
					boolean encontrado=false;
					for (Automovil co:coches) {
						if (vars[1].toLowerCase().equals(co.getModelo().toLowerCase())) {
							encontrado=true;
							double consumido=co.desplazar(Integer.parseInt(vars[2]));
							if (consumido<0) {
								System.out.println("Combustible insuficiente para ese desplazamiento");
							} else {
								System.out.println(co.getModelo()+" "+co.getCombustible()+" "+consumido);
							}
						}
					}
					if (!encontrado) {System.out.println("Ese vehiculo no esta en stock");}
				}
			} catch (Exception e) {
				System.out.println("   ERROR de FORMATO, vuelva a intentarlo.");
			}
		} while (!txtIn.isEmpty());
		
		System.out.println("fin");
		System.out.println("\n Estado actual de los vehiculos: ");
		for (Automovil co:coches) {
			System.out.println(co.getModelo()+" "+co.getCombustible()+" "+co.getkmTotales()+" "+co.getConsumoTotal());
		}
		teclado.close();
	}

}

package Unidad5;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {

		Animal perro=new Animal("chucho",LocalDate.of(2012,2,23));
		Animal gato=new Animal("kitty");
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());
		perro.setNombre("pepe");
		gato.setFecha(LocalDate.of(1977,11,25));
		
		System.out.println("El nuevo nombre del perro es: "+perro.getNombre());
		System.out.println("La fecha de nacimiento del gato es: "+gato.getFecha().toString());

		System.out.println(perro.toString());
		System.out.println(gato.toString());
		
	}

}

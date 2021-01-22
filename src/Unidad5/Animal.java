package Unidad5;

import java.time.LocalDate;
import java.time.Period;

public class Animal {
	//Declaramos los atributos 
	private String nombre;
	private LocalDate fecha;

	//Constructor 1: recibe nombre y fecha
	public Animal (String nombre, LocalDate fecha) {
		this.nombre=nombre;
		this.fecha=fecha;
	}
	//Constructor 2: recibe nombre y en fecha pone la fecha actual
	public Animal (String nombre) {
		this.nombre=nombre;
		this.fecha=LocalDate.now();
	}
	//Getters y Setters
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha=fecha;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	//Método toString
	@Override
	public String toString() {
		int edad=Period.between(fecha,LocalDate.now()).getYears();
		return ("Nombre: "+nombre+" - Edad: "+edad+" años.");
	}
	
	
}

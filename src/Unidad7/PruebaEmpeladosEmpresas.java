package Unidad7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;


public class PruebaEmpeladosEmpresas {

	public static void main(String[] args) {
		Random rnd=new Random();
		// TODO Auto-generated method stub
		ArrayList<Empleados> empleados=new ArrayList<Empleados>();
		Asalariados asalariado=new Asalariados("Luis","Fdez Perez",new Date(),"ES34 3454 23 0000 0012");
		Contratistas contratista=new Contratistas("Josefa Hdez","de32 4533 12 0121 9999");
		contratista.addSociedad(new SocAnonimas("Regalos Perez",new ArrayList<String>(Arrays.asList("regalos","alicatados"))));
		EmpServicios empServicio=new EmpServicios("LimpiezasJB","limpieza","FR00 1234 56 7891 2345");
		
		
		
		empleados.add(asalariado);
		empleados.add(contratista);
		empleados.add(empServicio);
		for (int i=0;i<empleados.size();i++) {
			System.out.println(empleados.get(i).toString());
			System.out.println();
		}
		for (int i=0;i<empleados.size();i++) {
			if (empleados.get(i) instanceof EmpServicios) {
				System.out.println(empleados.get(i).pagar(rnd.nextInt(1300),"Servicios prestados en Enero"));
			} else {
				System.out.println(empleados.get(i).pagar(rnd.nextInt(3000),"Salario Enero"));
			}
			System.out.println();
		}

	}

}

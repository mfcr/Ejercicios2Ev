package Unidad5;

public class PruebaHucha {

	public static void main(String[] args) {
		Hucha juan=new Hucha(); //Hucha vacia
		System.out.println(juan.toString());
		Hucha maria=new Hucha(2,3,5,0,2,1); //Hucha vacia
		System.out.println(maria.toString());
		Hucha pep=new Hucha(228); //Hucha vacia
		System.out.println(pep.toString());

		
		//Alternativamente se podría introducir esto en la funcion cambiaContra y en lugar de devolver boolean que devuelva String con el mensaje 
		if (maria.cambiaContra("Root","maria")) {
			System.out.println("Contraseña modificada, nueva contraseña: "+maria.getContra());
		}  else {
			System.out.println("Error al cambiar la contraseña,");
		}
		
		if (pep.cambiaContra("pep","pep")) {
			System.out.println("Contraseña modificada, nueva contraseña: "+pep.getContra());
		}  else {
			System.out.println("Error al cambiar la contraseña.");
		}

		if (pep.estaAbierta()) {
			pep.cerrarHucha();
		} else  {
			pep.abrirHucha("Root");
		}

		int[] cantidadAIngresarArray= {2,3,0,0,1,4};
		pep.ingresa(cantidadAIngresarArray);
		System.out.println();
		System.out.println(pep.toString());

		int  cantidadASacar= 455;
		int sacado=pep.saca(cantidadASacar);
		System.out.println(pep.toString()+" Se intentaron sacar "+cantidadASacar+", se sacaron: "+sacado);

		int cantidadAIngresar= 1121;
		maria.ingresa(cantidadAIngresar);
		System.out.println();
		System.out.println(maria.toString());
		
		int [] cantidadASacarArray= {25,1,2,4,5,110};
		sacado=maria.saca(cantidadASacarArray);
		System.out.println(maria.toString()+" Se intentaron sacar "+Hucha.totalEuros(cantidadASacarArray)+", se sacaron: "+sacado);
		
		
	}

}

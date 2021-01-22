package Unidad5;

public class Hucha {
	private int[] monedas_Y_Billetes= {0,0,0,0,0,0};
	private static int[] cuantias= {1,2,5,10,20,50};
	private boolean abierta=false;
	private String contra="Root";
	
	/**Constructor 1: Hucha Vacia
	 */
	public Hucha() {	}
	/**Constructor 2: Se proporciona el numero de billetes de cada tipo.
	 */
	public Hucha(int m1, int m2, int b5,int b10,int b20,int b50) {
		monedas_Y_Billetes[0]=m1;
		monedas_Y_Billetes[1]=m2;
		monedas_Y_Billetes[2]=b5;
		monedas_Y_Billetes[3]=b10;
		monedas_Y_Billetes[4]=b20;
		monedas_Y_Billetes[5]=b50;
	}
	/**Constructor3: Se proporciona una cantidad de euros y se guarda la mínima cantidad de monedas y billetes
	 */
	public Hucha(int euros) {
		ingresa(minEuros(euros));
	}
	
	/**Esta funcion recibe una cantidad de euros y devuelve el numero minimo de 
	 * monedas y billetes para esa cuantia.
	 * @param euros
	 * @return
	 */
	public static int[] minEuros(int euros) {
		int cantidades[]= {0,0,0,0,0,0};
		for (int i=(cantidades.length-1);i>=0;i--) {
			cantidades[i]=euros/cuantias[i];
			euros=euros%cuantias[i];
		}
		return cantidades;
	}
	/**Esta funcion recibe un array de monedas y devuelve el total
	 */
	public static int totalEuros(int[] euros) {
		int total= 0;
		for (int i=(cuantias.length-1);i>=0;i--) {
			total+=euros[i]*cuantias[i];
		}
		return total;
	}

	
	/**Abrir hucha
	 */
	public boolean abrirHucha(String contra) {
		if (this.contra.equals(contra)) {
			abierta=true;
			return true;
		}
		return false;
	}
	/**Cerrar hucha
	 */
	public void cerrarHucha() {
		abierta=false;
	}
	/**
	 * Cambiar contraseña
	 */
	public boolean cambiaContra(String vieja, String nueva) {
		if (vieja.equals(contra)) {
			contra=nueva;
			return true;
		} 
		return false;
	}
	/**
	 * DEvolvemos estado de la hucha
	 */
	public boolean estaAbierta() {
		return abierta;
	}
	/**
	 * DEvolvemos contraseña
	 */
	public String getContra() {
		return contra;
	}
	/**
	 * Metodo toString
	 * @return
	 */
	@Override 
	public String toString() {
		String mensaje="La hucha tiene las siguientes monedas y billetes: \n";
		for (int i=0;i<cuantias.length;i++) {
			mensaje+="  De "+cuantias[i]+" euros hay --> "+monedas_Y_Billetes[i]+". \n";
		}
		mensaje+="En total hay "+cuantoHay()+" Euros en la hucha. \n";
		mensaje+=" La contraseña es: "+contra+"\n\n";
		return mensaje;
	}
	
	
	
	
	
	private int cuantoHay() {
		int total=0;
		for (int i=0;i<cuantias.length;i++) {
			total+=cuantias[i]*monedas_Y_Billetes[i];
		}
		return total;
	}
	/**Recibe un array con monedas y billetes y lo ingresa en la hucha
	 * @param cantidades
	 */
	public void ingresa(int[] cantidades) {
		for (int i=0;i<cantidades.length;i++) {
			monedas_Y_Billetes[i]+=cantidades[i];
		}
	}
	/**Recibe un array con monedas y billetes y lo saca de la hucha
	 * @param cantidades
	 */
	public int saca(int[] cantidades) {
		int sacado=0;
		for (int i=0;i<cantidades.length;i++) {
			int saca_de_este=Math.min(cantidades[i],monedas_Y_Billetes[i]);
			monedas_Y_Billetes[i]-=saca_de_este;
			sacado+=saca_de_este*cuantias[i];
		}
		return sacado;
	}
	/**Recibe una cantidad de euros y las  ingresa en la hucha
	 * @param cantidades
	 */
	public void ingresa(int cantidad) {
		ingresa(minEuros(cantidad));
	}
	
	/**Recibe una cantidad de dinero y las saca de la hucha
	 * @param cantidad
	 */
	public int saca(int cantidad) {
		int sacado=0;
		for (int i=(cuantias.length-1);i>=0;i--) {
			int saca_de_este=Math.min(cantidad/cuantias[i],monedas_Y_Billetes[i]);
			monedas_Y_Billetes[i]-=saca_de_este;
			sacado+=saca_de_este*cuantias[i];
			cantidad-=saca_de_este*cuantias[i];
		}
		return sacado;
	}
	

}

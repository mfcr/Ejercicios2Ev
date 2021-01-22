package Unidad5;


public class PruebaAutor {
	public static void main(String[] args) {
		Autor autora=new Autor("Luisa Fdez","fl34@gmail.com","F");
		Autor autor=new Autor("Luis Fdez","lf34@gmail.com","M");

		System.out.println(autora.toString());
		System.out.println(autor.toString());

		autora.setNombre("Marta Gutierrez");
		autor.setEmail("lf44@yahoo.es");
		autora.setGenero("No define");
		
		System.out.println(autora.toString());
		System.out.println(autor.toString());
		
		String sms="El autor tiene como nombre "+autor.getNombre()+" cómo género "+autor.getGenero() +" y su email es "+autor.getEmail();
		System.out.println(sms);
		sms="La autora tiene como nombre "+autora.getNombre()+" cómo género "+autora.getGenero() +" y su email es "+autora.getEmail();
		System.out.println(sms);
		
	}
	
}

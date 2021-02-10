package starWars;


/*
 * 
 * Falta meter en el setPoder y en el cosntructor la restriccion 1-100
 * Ver si se puede implementar que automaticamente cree el objeto p1 con la pelicula mas reciente que tenga asociado.
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {

		Pelicula peli1= new Pelicula();
		Pelicula peli2= new Pelicula();
		Pelicula peli3= new Pelicula();
		Personaje p1=new Personaje("Casado", 55, 1.70, 80.0, peli1, "bovino");
		Personaje p2=new Personaje("Sanchez", 55, 1.70, 80.0, peli1, "bovino");
		Personaje p3=new Personaje("Iglesias", 55, 1.70, 80.0, peli1, "bovino");
		peli1 =new Pelicula("Mentiras", 1998, p1, p2, p3);
		peli3 =new Pelicula("Mentiras", 2000, p1, p2, p3);
		peli2 =new Pelicula("Mentiras", 2001, p1, p2, p3);
		
		
	}

}


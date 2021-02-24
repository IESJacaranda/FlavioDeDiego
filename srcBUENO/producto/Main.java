package producto;

public class Main {

	public static void main(String[] args) {
		
		
		Producto p1 = new Producto("1a","Xbox",100);
		
		System.out.println(p1.precioFinal());

		System.out.println(p1.getCodigo());
		
		System.out.println(p1);
	}

}
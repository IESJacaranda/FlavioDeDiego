package probandoAbstracts;

public class Main {

	public static void main(String[] args) {

		
		
		Cubo cubito = new Cubo(3.0, 5.0);
		CuboEsfera esferaRara = new CuboEsfera(3.0, 5.0, 4.0);
		
		System.out.println(cubito.calcularDensidad());
		System.out.println(cubito.flotaEnAgua());
		System.out.println(cubito.calcularVolumen());
		
		
		System.out.println(esferaRara.calcularDensidad());
		System.out.println(esferaRara.flotaEnAgua());
		System.out.println(esferaRara.calcularVolumen());
		
	}

}

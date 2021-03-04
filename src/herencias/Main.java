package herencias;

public class Main {

	
	public static void main(String[]args) {
		
		
		Vehiculo generico= new Vehiculo();
		generico.acelerar();
		generico.frenar();
		
		Vehiculo coche=new Turismo();
		((Turismo)coche).abrirMaletero();
		
		Turismo coche2=new Turismo(2,200,5);
		coche2.getMarcha();
		
	}
	
	
	
}

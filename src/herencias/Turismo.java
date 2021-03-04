package herencias;

public class Turismo extends Vehiculo{

	
	private int marcha;
	
	
	public Turismo() {
		super();
	}
	
	
	public Turismo(int numRuedas, double peso, int marcha) {
		super(numRuedas, peso);
		this.marcha=marcha;
	}
	
	public void cambiarMarcha() {
		System.out.println("Cambiando marcha");
	}
	
	
	public void abrirMaletero() {
		System.out.println("Maletero abierto");
	}


	public int getMarcha() {
		return marcha;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}

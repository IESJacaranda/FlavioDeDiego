package herencias;

public class Ciclomotor extends Vehiculo {

	
	
	private String estadoPataCabra;
	
	
	public Ciclomotor() {
		super();
	}
	
	public Ciclomotor(String estadoPataCabra) {
		super();
		this.estadoPataCabra=estadoPataCabra;
	}
	
	
	public void bajarPatacabra() {
		System.out.println("pata bajada");
	}
}

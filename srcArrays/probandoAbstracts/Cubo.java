package probandoAbstracts;

public class Cubo extends AbstractFiguraEspacio {

	
	public Cubo() {
		super();
	}
	
	public Cubo(Double lado, Double peso) {
		super();
		this.lado=lado;
		this.peso=peso;
	}
	
	@Override
	public Double calcularVolumen() {
		
		return Math.pow(this.lado, 3);
	}

	

}

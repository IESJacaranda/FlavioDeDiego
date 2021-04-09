package probandoAbstracts;

public class CuboEsfera extends AbstractFiguraEspacio {
	
	
	
	
	public CuboEsfera() {
		super();
	}
	
	
	public CuboEsfera(Double lado, Double peso,  Double radio) {
		super();
		this.lado=lado;
		this.peso=peso;
		this.radio=radio;
	}
	
	@Override
	public Double calcularVolumen() {
		
		return Math.pow(this.lado, 3)+((3/4*Math.PI*Math.pow(this.radio, 3)/2));
	}
	
	
	

}

package probandoAbstracts;

public abstract class AbstractFiguraEspacio {

	
	protected Double radio;
	protected Double lado;
	protected Double peso;
	protected final Double DENSIDAD_AGUA=1.0;
	
	
	
	public abstract  Double calcularVolumen();
	
	public  Double calcularDensidad() {
		
		return this.peso/calcularVolumen();
	};
	
	public   boolean flotaEnAgua() {
		
		return calcularDensidad()<DENSIDAD_AGUA ? true : false;
	};
	
	
	
}

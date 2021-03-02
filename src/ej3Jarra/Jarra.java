package ej3Jarra;

public class Jarra {

	
	
	private double capacidad;
	private double estado=0.0;
	private double aguaTotal;
	
	
	
	
	public Jarra(double capacidad) {
		this.capacidad=capacidad;
		
		}


	
	public void llenarJarra() {

		if (this.estado<this.capacidad){
			this.aguaTotal+=capacidad-this.estado;
			this.estado=capacidad;
		} else {
			System.out.println("La jarra ya está a tope");
		}
		
		
		
	}
	
	public void vaciarJarra() {
		this.estado=0.0;
	}
	
	public void volcarEnJarra(Jarra j2) {
		
		if (j2.getEstado()==j2.getCapacidad() || this.estado<=0){
			
			System.out.println("No se puede hacer volcado");
			
			
		}
		else if (this.estado<=(j2.getCapacidad()-j2.getEstado())){
				
				j2.setEstado(j2.getEstado()+this.estado);
				this.estado=0;
		} else{
			double auxiliar=0;
			auxiliar = this.estado-(j2.getCapacidad()-j2.getEstado());
			j2.setEstado(j2.capacidad);
			this.estado=auxiliar;

		}
	}
	
	public double calcularAguaGastada(Jarra j2) {
		return this.aguaTotal+j2.getAguaTotal();
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getEstado() {
		return estado;
	}

	public void setEstado(double estado) {
		this.estado = estado;
	}

	public double getAguaTotal() {
		return aguaTotal;
	}

	public void setAguaTotal(double aguaTotal) {
		this.aguaTotal = aguaTotal;
	}
}

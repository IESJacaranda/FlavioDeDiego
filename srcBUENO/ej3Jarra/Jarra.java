package ej3Jarra;

public class Jarra {

	
	
	private double capacidad;
	private double estado=0.0;
	private double aguaTotal;
	
	
	
	
	public Jarra(double capacidad) {
		this.capacidad=capacidad;
		
		}


	
	public void llenarJarra() {

		aguaTotal+=capacidad-this.estado;
		this.estado=capacidad;
		
		
	}
	
	public void vaciarJarra() {
		this.estado=0.0;
	}
	
	public void volcarEnJarra(Jarra j2) {
			while (j2.getEstado()<j2.getCapacidad() && this.estado>0){
				this.estado-=1;
				j2.setEstado(j2.getEstado()+1);	
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
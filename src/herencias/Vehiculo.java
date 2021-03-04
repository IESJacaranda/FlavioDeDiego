package herencias;

public class Vehiculo {

	
	private int numRuedas;
	private double peso;
	private double velocidadMaxima;
	private int capacidad;
	
	
	
	
	
	public Vehiculo() {
		
	}
	
	
	public Vehiculo(int numRuedas, double peso) {
		this.numRuedas=numRuedas;
		this.peso=peso;
		
	}
	
	public Vehiculo(int numRuedas, double peso, double velocidadMaxima, int capacidad) {
		this(numRuedas, peso);
		this.velocidadMaxima=velocidadMaxima;
		this.capacidad=capacidad;
	}
	
	
	public void acelerar() {
		System.out.println("bobobooooooo");
	}
	
	public void frenar() {
		System.out.println("Frenazo");
		
	}


	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}

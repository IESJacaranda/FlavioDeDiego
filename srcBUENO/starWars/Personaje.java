package starWars;

public class Personaje {


	
	private String nombre;
	private double poder;
	private double estatura;
	private double peso;
	private Pelicula pelicula;
	private String especie;
	
	
	

	
	public Personaje() {
		
	}
	
	
public Personaje(String nombre, double poder, double estatura, double peso, 
		Pelicula pelicula, String especie) {
	
	if(poder>=1 && poder<=100) {
		this.poder=poder;
	} //else {
		//throw new Exception("El poder debe estar entre 1 y 100");
	//}
	
	
	this.nombre=nombre;
	this.estatura=estatura;
	this.peso=peso;
	this.pelicula=pelicula;
	this.especie=especie;
		
	}
	
	
//El   método   toString   del   personaje   debe   mostrar   el   nombre,   
//la   estatura,   la   especie,   y   acontinuación lo que 
//sea mayor, la capacidad de destrucción o el peso
	
	@Override
	public String toString() {
		
		double poderPeso;
		if(this.getPeso()>=this.getPoder()) {
			
			poderPeso=this.getPeso();
			
		}else {
			poderPeso=this.getPoder();
		}
		return this.getNombre()+" "+this.getEstatura()+" "+this.getEspecie()+" "+poderPeso;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public double getPoder() {
		return poder;
	}





	public void setPoder(double poder) {
		if(poder>=1 && poder<=100) {
			this.poder=poder;
		} //else {
			//throw new Exception("El poder debe estar entre 1 y 100");
		//}
	}





	public double getEstatura() {
		return estatura;
	}





	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}





	public double getPeso() {
		return peso;
	}





	public void setPeso(double peso) {
		this.peso = peso;
	}





	public Pelicula getPelicula() {
		return pelicula;
	}





	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}





	public String getEspecie() {
		return especie;
	}





	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
	
	
}
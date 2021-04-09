package alumnoClase;

public class Alumno extends Persona implements Comparable<Alumno>{
	
	
	private Double nota;
	
	
	public Alumno() {
		super();
		
	}
	
	
	public Alumno( String nombre, String apellido1, String apellido2, Double nota) {
		super(nombre, apellido1, apellido2);
		this.nota=nota;
		
	}
	
	


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return super.toString()+nota;
	}


	/*@Override
	public int compareTo(Alumno o) {
		int compareResult =0;
		if(this.nota>o.getNota()) {
			compareResult=1;
		}else if(this.nota<o.getNota()) {
			compareResult=-1;}else {
				compareResult=0;
			}
			
		return 0;
	}*/

	
	@Override
	public int compareTo(Alumno o) {
		
			
		return this.getNombre().compareTo(o.getNombre());
	}
	
}

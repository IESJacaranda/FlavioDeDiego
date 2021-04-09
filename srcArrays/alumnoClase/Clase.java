package alumnoClase;

import java.util.ArrayList;
import java.util.List;

public class Clase {

	
	private List<Alumno> alumnos;
	private final double APROBADO=5;
	
	
	public Clase() {
		super();
		this.alumnos=new ArrayList<Alumno>();
	}
	
	
	public void addAlumno(Alumno alumno) {
		(this.alumnos).add(alumno);
		
	}


	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public String getAlumnosAprobados() {
		
		StringBuilder aprobados = new StringBuilder("Aprobados: \n");
		
		
		for(int i =0;i<alumnos.size() ;i++) {
			
			Alumno al= alumnos.get(i);
			
			
			if (al.getNota()>=APROBADO){
				
				aprobados.append(al.toString() + "\n");
				
			}
		}
		return aprobados.toString();
		
	}
	
	public double getNotaMedia() {
		
		
		
		double suma=0;
		for(int i =0;i<alumnos.size() ;i++) {
			
			
			
			suma=suma+(alumnos.get(i)).getNota();
		
		}
		
		
		
		return suma/alumnos.size();
	}
	
}

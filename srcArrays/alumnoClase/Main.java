package alumnoClase;

import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		
		
		Alumno flavio = new Alumno("Flavio", "Diego", "Montes", 5.5);
		//System.out.println(flavio);
		Clase primeroB = new Clase();
		
		primeroB.addAlumno(flavio);
		primeroB.addAlumno(new Alumno("Xion", "Diego", "Yo", 8.5));
		primeroB.addAlumno(new Alumno("a", "s", "v", 6.5));
		primeroB.addAlumno(new Alumno("s", "s", "v", 6.5));
		primeroB.addAlumno(new Alumno("c", "a", "v", 4.5));
		primeroB.addAlumno(new Alumno("v", "v", "v", 2.5));
		
		
		
		
		System.out.println(primeroB.getAlumnosAprobados());
		
		Collections.sort(primeroB.getAlumnos());
		
		
	}

}

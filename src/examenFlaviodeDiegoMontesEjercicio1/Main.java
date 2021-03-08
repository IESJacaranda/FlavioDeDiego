package examenFlaviodeDiegoMontes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//LOS OBJETOS TIENEN QUE CUMPLIR LOS REQUISITOS DE RESTRICCION, O SALTARA LA EXCEPCION CORRESPONDIENTE. 3 EJEMPLOS DONDE NO LOS CUMPLE CON CADA OBJETO
		/*
		try {	
			Empleado paco = new Empleado("paco", 23, "hombre", "mañana", "102", "olaasdasdasdAA13"); //PASS INCORRECTA
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
	
		
		try {
			Profesor paquito=new Profesor("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA12", "lengua", "primero", "B"); //PASS INCORRECTA
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
		
	
		
		try {
			PersonalDireccion juan=new PersonalDireccion("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA123", "lengua", "primero", "B", "Sevilla", "Jacarandá", "SE");//COMPETENCIAS INCORRECTAS
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		try {
			PersonalAdministracion paquita=new PersonalAdministracion("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMN");//AREA INCORRECTA
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		//VAMOS A CREARLOS BIEN PARA PROBAR LOS toString()
		
		
		
		try {	
			Empleado paco2 = new Empleado("paco", 23, "hombre", "mañana", "102", "olaasdasdasdAA123"); 
			System.out.println(paco2);
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}

	
		try {
			Profesor paquito2=new Profesor("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA122", "lengua", "primero", "B");
			System.out.println(paquito2);
		} catch (PassIncorrectaException e) {
			
			System.out.println(e.getMessage());
		}
		
	
		
		try {
			PersonalDireccion juan2=new PersonalDireccion("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA123", "lengua", "primero", "B", "Sevilla", "Jacarandá", "SEC");
			System.out.println(juan2);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
	
	try {
		PersonalAdministracion paquita2=new PersonalAdministracion("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMNADO");//AREA INCORRECTA
		System.out.println(paquita2);
		
		//paquita2.setPassword("1234444444");
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	
	try {
		PersonalAdministracion paquita3=new PersonalAdministracion("paco", 23, "hombre", "mañana", "102", "oasdasdasdasdlaAA123", "Jacaranda",954414986,"ALUMNADO");//AREA INCORRECTA
		System.out.println(paquita3);
		
		paquita3.setPassword("1234444444"); //Los sets funcionan igual que el constructor probamos...
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	*/
		
		//String nombre, int edad, String genero, String horario, String codigoId, String password
		try {
		
			final	Empleado yo=new Empleado("Flavio",24, "Masculino", "Mañana" ,"holacaracolaAA123");
			final	Empleado yo2=new Empleado("Flavio",24, "Masculino", "Mañana","holacaracolaAA123");
			final	Empleado yo3=new Empleado("Flavia",24, "Femenino", "Mañana" ,"holacaracolaAA123");
			final	Empleado yo4=new Empleado("Juan",24, "Masculino", "Mañana" ,"holacaracolaAA123");
			
			
			
			System.out.println(yo.hashCode());
			
			System.out.println(yo.equals(yo)+","+yo.equals(yo2)+","+yo3.equals(yo4)+","+yo.equals(yo2)+",");
			System.out.println(yo);
			System.out.println(yo2);
			System.out.println(yo3);
			System.out.println(yo4);
		} catch (PassIncorrectaException e) {
			e.getMessage();
		}
		
		
	
	
	
	}
	
}
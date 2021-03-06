package examenFlaviodeDiegoMontes;

public class Empleado {

	//su información personal básica (nombre, edad, género, horario,
	//código de identificación y contraseña)
	
	
	private String nombre;
	private int edad;
	private String genero;
	private String horario;
	private int codigoId;
	private String password;
	
	
	
	public Empleado(){
		
	}
	
	
	//Constructor con todos los atributos
	
public Empleado(String nombre, int edad, String genero, String horario, String password) throws PassIncorrectaException{
		
	this.nombre=nombre;
	this.edad=edad;
	this.genero=genero;
	this.horario=horario;
	this.codigoId=this.hashCode();
	
	
	
	
	
	
	
	
	int contaMayus=0;
	int contaNumero=0;

	
	
	//Restricciones en la contraseña
	if(password.length()<10) {
		
		throw new PassIncorrectaException();
		
	} else {
		
		//Recorremos cadena para haacer comprobacion de mayus y numeros, en su defecto lanzamos excepcion
		for(int i=0;i<password.length();i++) {
			
				if(Character.isDigit(password.charAt(i))) {
					contaNumero+=1;
				}else if (Character.isUpperCase(password.charAt(i))) {
					contaMayus+=1;
				}
		}
		
			if (contaNumero==3 && contaMayus==2){
				this.password=password;
			}else {
				throw new PassIncorrectaException();
			}
		
	}
	
	
	
	
	
	
	
	
	}


public String getNombre() {
	return nombre;
}


public int getEdad() {
	return edad;
}


public String getGenero() {
	return genero;
}


public String getHorario() {
	return horario;
}


public int getCodigoId() {
	return codigoId;
}


public String getPassword() {
	return password;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public void setGenero(String genero) {
	this.genero = genero;
}


public void setHorario(String horario) {
	this.horario = horario;
}


public void setCodigoId() {
	this.codigoId=this.hashCode();
}


public void setPassword(String password) throws PassIncorrectaException {
	//Restricciones en la contraseña
		if(password.length()<10) {
			
			throw new PassIncorrectaException();
			
		} else {
			int contaMayus=0;
			int contaNumero=0;
			//Recorremos cadena para haacer comprobacion de mayus y numeros, en su defecto lanzamos excepcion
			for(int i=0;i<password.length();i++) {
				
					if(Character.isDigit(password.charAt(i))) {
						contaNumero+=1;
					}else if (Character.isUpperCase(password.charAt(i))) {
						contaMayus+=1;
					}
			}
			
				if (contaNumero==3 && contaMayus==2){
					this.password=password;
				}else {
					throw new PassIncorrectaException();
				}
			
		}
}


@Override
public String toString() {
	return this.nombre+" , "+this.edad+" , "+this.genero+" , "+
this.horario+" , "+this.codigoId+" , "+this.password;
}


@Override
public boolean equals(Object obj) {
	boolean sonIguales=false;
	if (obj==this) {sonIguales=true;
	}else if(obj==null) {sonIguales=false;
	}else if(obj instanceof Empleado) {
		if(((Empleado)obj).getNombre()==this.getNombre() && ((Empleado)obj).getEdad()==this.getEdad() && 
				((Empleado)obj).getGenero()==this.getGenero() && 
				((Empleado)obj).getHorario()==this.getHorario()) {
			sonIguales=true;
		}
				
		
	}
	
	return sonIguales;
}


@Override
public int hashCode() {
	
	
	int codigo;
	codigo=this.nombre.hashCode()+this.edad+this.genero.hashCode();
	
	return codigo;
			
			
	
	
}
	


	
	
	
}
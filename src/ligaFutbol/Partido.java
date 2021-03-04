package ligaFutbol;

public class Partido {

	
	
	private int jornada;
	private String equipoVisitante;
	private String equipoLocal;
	private char quiniela;
	private int golesLocal;
	private int golesVisitante;
	
	
	public Partido() {
		
	}
	
	
	public Partido(int jornada, String equipoVisitante, String equipoLocal, int golesLocal, int golesVisitante, char quiniela) throws Exception {
		
		if(equipoLocal.equals(equipoVisitante)) {
			
			throw new EquiposIgualesException();
			}else {
				
			
		
		this.equipoLocal=equipoLocal;
		this.jornada=jornada;
		this.equipoVisitante=equipoVisitante;
		this.golesVisitante=golesVisitante;
		this.golesLocal=golesLocal;
		this.quiniela=quiniela;
			
			}
	}
	
	
	//y actualizará losatributos goles local y visitante y el resultado de la quiniela, 
	//así como el número departidos ganados   de los equipos. 
	//Deben tratarse todos los posibles errores conexcepciones.
	
	public void ponerResultado(String resultado) {
		
		char gol1=resultado.charAt(0);
		((String)gol1)
		this.golesLocal=Integer.parseInt(gol1);
		
		
	}
	
	
	
	public int getJornada() {
		return jornada;
	}
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	public String getEquipoLocal() {
		return equipoLocal;
	}
	public char getQuiniela() {
		return quiniela;
	}
	public void setQuiniela(char quiniela) {
		this.quiniela = quiniela;
	}


	public int getGolesLocal() {
		return golesLocal;
	}


	public int getGolesVisitante() {
		return golesVisitante;
	}


	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}


	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
	
	
}

package jaca;

import static utiles.Constantes.BARRA;
import static utiles.Constantes.LINEA;

import utiles.Constantes;

public class Tablero {

	
	
	public final static int LONGITUD=10;
	
	
	private Elemento[][] tablero;
	
	public Tablero() {
		super();
		tablero= new Elemento[LONGITUD][LONGITUD];
	}
	
	public void imprimirTablero() {
		StringBuilder sb= new StringBuilder("");
		
		System.out.println("\n"+LINEA);
		for(int i =0; i<tablero.length; i++) {
			sb.append("| ");
			for(int j =0; j<tablero[0].length; j++) {
				
				
				
				sb.append((tablero[i][j]==null ? " ":tablero[i][j])+BARRA);
			}
			
			sb.append("\n"+LINEA+"\n");
			
		}
		
		System.out.println(sb.toString());
	}
	
	
	/*public void addRoca() {
		
		//Vamos a asignar aleatoriamente la posicion de las rocas en el mapa. 
		
		
		int valorI;
		int valorJ;
		Elemento roca=new Roca();
		int contador=0;
		
		
		while(contador<5) {
			valorI = (int)(Math.random()*LONGITUD+1);
			valorJ = (int)(Math.random()*LONGITUD+1);
			
			if(this.tablero[valorI][valorJ]==null) {
				
				
				this.tablero[valorI][valorJ]=roca;
				contador++;
			}
			
			
		}
		
			
		
	}*/
	
	
public void addElemento(Elemento obj, int cantidad) {
		
		//Vamos a asignar aleatoriamente la posicion de las rocas en el mapa. 
		
		
		int valorI;
		int valorJ;
		int contador=0;
		
		
		while(contador<cantidad) {
			valorI = (int)(Math.random()*LONGITUD);
			valorJ = (int)(Math.random()*LONGITUD);
			
			if(this.tablero[valorI][valorJ]==null) {
				
				
				this.tablero[valorI][valorJ]=obj;
				contador++;
			}
			
			
		}
		
			
		
	}


	public void crearTablero() {
		Elemento roca=new Roca();
		Elemento arbol= new Arbol();
		Elemento dinero= new Dinero();
		Elemento pocion= new Pocion();
		Elemento gema= new Gema();
		
		
		addElemento(roca , Constantes.NUMERO_ROCA);
		addElemento(arbol, Constantes.NUMERO_ARBOL);
		addElemento(gema, Constantes.NUMERO_GEMA);
		addElemento(dinero, Constantes.NUMERO_DINERO);
		addElemento(pocion, Constantes.NUMERO_POCION);
	}
	
}

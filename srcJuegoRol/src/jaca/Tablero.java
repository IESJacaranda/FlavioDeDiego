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
	
}

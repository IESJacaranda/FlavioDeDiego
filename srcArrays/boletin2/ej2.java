package boletin2;

import java.util.Scanner;

import boletin1.Matriz;

public class ej2 {

	
	
	/*
	 * Realiza un programa que cargue un vector  de 10 números enteros.
	 * El   programa   debe   imprimir   los   elementos   del   vector  
	 *  y   después desplazarlos una posición, de tal forma que el último
	 *   pase a la primeraposición,   el   primero   a   la   segunda,  
	 *    el   segundo   a   la   tercera,   y   asísucesivamente. 
	 *    Introduce el número en la posición (1/10): 5Introduce el 
	 *    número en la posición (2/10): 10...Introduce el número en 
	 *    la posición (10/10): 9 Vector original:   
	 *      5 10 2 30 4 15 6 88 3 9Vector después de desplazar: 
	 *       9 5 10 2 30 4 15 6 88 3NOTA: Sólo debe usarse un vector, 
	 *       no crear vectores auxiliares.
	 *       
	 */
	
	
	public static int[] crearVectorInverso(int numerosPedidos) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int[] lista=new int[numerosPedidos];
		
		for(int i=0;i<numerosPedidos;i++) {
			
			
			System.out.println("Introduce numero \n");
			lista[numerosPedidos-i-1]=Integer.parseInt(sc.nextLine());
		}
		
		
		
		
		return lista;
		
	}
	
	/**
	 * 
	 * @param vector
	 * @return
	 *
	 */
	public static int[] rotaVectorDerecha(int[] vector) {
		
		
		int aux=vector[vector.length-1];
		
		for(int i=0;i<vector.length;i++) {
			
			if(i!=vector.length-1) {
				vector[vector.length-1-i]=vector[vector.length-2-i];
				
			}
			
		}
		
		vector[0]=aux;
		
		return vector;
		
	}
	
	public static void main(String[] args) {
	
		int[] vector= {1,2,3,4,5};
		System.out.println(Matriz.imprimirMatriz(vector));
		System.out.println(Matriz.imprimirMatriz(rotaVectorDerecha(vector)));
	}

}

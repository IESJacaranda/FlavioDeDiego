package boletin2;

import java.util.Scanner;

import boletin1.Matriz;

public class ej1 {
	
	
	//RELACIÓN DE PROBLEMAS 8ARRAYS I1.Realizar   un   programa   que 
	//solicite   diez   números   enteros   y   cuando   setermine
	//de introducir el último los muestre en el orden inverso al que 
	//se introdujeron
  
	
	public static int[] crearVectorInverso(int numerosPedidos) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int[] lista=new int[numerosPedidos];
		
		for(int i=0;i<numerosPedidos;i++) {
			
			
			System.out.println("Introduce numero \n");
			lista[numerosPedidos-i-1]=Integer.parseInt(sc.nextLine());
		}
		
		
		
		
		return lista;
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Matriz.imprimirMatriz(crearVectorInverso(10)));
	}
}

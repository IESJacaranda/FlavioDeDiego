package boletin2;

import java.util.ArrayList;
import java.util.Scanner;

import boletin1.Matriz;

public class IntroduceNumeros {
	/*
	public static ArrayList<String> pedirNumeros() {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> vector=new ArrayList<String>();
		
		
		System.out.println("Introduce numero / 0=FIN");
		String i=sc.nextLine();

		while(!i.equals("0")) {
			
			
			System.out.println("Introduce numero / 0=FIN");
			vector.add(i);
			i=sc.nextLine();
		}
		
		
			return vector;
		
		
	}
	
	
	
	public static double mediaList(ArrayList<String> vector) {
		
		double media=0;
		for(int i=0;i<vector.size();i++) {
			
			media=media+Integer.parseInt(vector.get(i));
			
		}
		media=media/vector.size();
		
		
		return media;
	}
	
	
	
	
	public static int cuantosTerminanEnCadaNumero(ArrayList<String> vector) {
		
		
			for(int i=0;i<vector.size();i++) {
			
			Integer.parseInt(vector.get(i));
			
		}
		
		return 0;
		
	}
	
	*/
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroIntroducido=1;
		int sumaNumeros=0;
		int contadorNumeros=0;
		int[] terminaciones= new int[10];
		
		
		
		System.out.println("Introduce numeros, cuando quieras parar pulsa 0");
		numeroIntroducido=Integer.parseInt(sc.nextLine());
		
		while(numeroIntroducido!=0) {
		
			
			contadorNumeros++;
			sumaNumeros=sumaNumeros+numeroIntroducido;
		
			
			
			terminaciones[calculaTerminacion(numeroIntroducido)]++;
			
			System.out.println("Introduce numeros, cuando quieras parar pulsa 0");
			numeroIntroducido=Integer.parseInt(sc.nextLine());
			
		}
		System.out.println(Matriz.imprimirMatriz(terminaciones));
		System.out.println("La media es " +calculaMedia(sumaNumeros, contadorNumeros));
		System.out.println("El numero mas acabdo es " +calculaTerminacionMayor(terminaciones));
		
		
		
	}
	
	public static double calculaMedia(int numero, int contador) {
		double media=0;
		media=media+numero;
		return media/contador;
		
	}
	
	public static int calculaTerminacion(int terminaciones) {
		
		
		return terminaciones%10;
		
	}
	
	
	public static int calculaTerminacionMayor(int[] vector) {
		
		int mayor=0;
		
		for(int i=0; i<vector.length;i++) {
			
			if(vector[i]>mayor) {
				mayor=i;
				
			}
			
		}
		
		
		return mayor;
		
	}
	
	
	
}
	


package boletin1;

public class ej5 {

	
	//Crea un programa que reciba dos matrices y nos indique 
	//si son la misma matriz, pero rotadas
	
	
	
	
	public static boolean rotarMatrizDerecha(int[][] matrizA, int[][] matrizB){
		boolean result1=true;
		boolean result2=true;
		boolean result3=true;
		
		for(int i=0;i<matrizA.length;i++) {
			for(int j=0;j<matrizA[0].length;j++) {
				
				
				if(matrizA[j][i]!=matrizB[i][matrizA.length-1-j]) {
					result1 = false;
				}
				
				if(matrizA[j][i]!=
						matrizB[matrizB.length-1-j][matrizA.length-1-i]) {
					result2 = false;
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		return (result1||result2);
		
	}
	
	/*
	
	public static boolean rotarMatrizDerecha(int[][] matrizA, int[][] matrizB){
		boolean result1=true;
		boolean result2=true;
		boolean result3=true;
		
		for(int i=0;i<matrizA.length;i++) {
			for(int j=0;j<matrizA[0].length;j++) {
				
				
				if(matrizA[j][i]!=matrizB[i][matrizB.length-1-j]) {
					result1 = false;
				}
				
				if(matrizA[j][i]!=
						matrizB[matrizB.length-1-j][matrizB.length-1-i]) {
					result2 = false;
				}
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		return (result1||result2);
		
	}*/
	
	public static boolean rotarMatriz(int[][] matrizA, int[][] matrizB) {
		
		return (rotarMatrizDerecha(matrizB, matrizA)||
				rotarMatrizDerecha(matrizA, matrizB));
	}
	
	public static void main(String[] args) {
		
		int[][] matrizA= {{0,0},{1,0}};
		int[][] matrizB= {{1,0},{0,0}};
		
		int[][] matrizC= {{1,0},{0,0}};
		int[][] matrizD= {{0,0},{0,1}};
		
		
		int[][] matrizK= {{1,0},{0,0},{1,1}};
		int[][] matrizL= {{1,0,1},{1,0,0}};
		
		
		int[][] matrizM= {{1,0},{0,0}};
		int[][] matrizN= {{2,0},{3,0}};
		
		//System.out.println(rotarMatriz(matrizA, matrizB));
		//System.out.println(rotarMatriz(matrizC, matrizD));
		System.out.println(rotarMatriz(matrizK, matrizL));
		System.out.println(rotarMatriz(matrizN, matrizM));
	}
	
}

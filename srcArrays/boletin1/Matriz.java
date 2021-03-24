package boletin1;

public class Matriz {

	
	
	
public static String imprimirMatriz(int matriz[]) {
		
		
		String print2="\n[";
		
		
		
		for(int i=0;i<matriz.length;i++) {
			
			
			
				
				if(i!=matriz.length-1) {
					print2+=matriz[i] + ", ";
				}else {
					print2+= matriz[i]+"]";
				
		}
			
		
	}
		return print2; 
		
	
}


public static String imprimirMatriz(int matriz[][]) {
	
	
	
	StringBuilder print2= new StringBuilder();
	
	
	
	for(int i=0;i<matriz.length;i++) {
		
		print2.append("\n [");
		
		
		
		for (int j=0;j<matriz[i].length;j++) {
			
			if(j!=matriz[i].length-1) {
				print2.append(matriz[i][j] + ", ");
			}else {
				print2.append(matriz[i][j]+"]");
			}
	}
	
	
			
	
	
}
	return print2.toString(); 
	

}
	
	
	public static int[][] crearMatriz5conDiagonal1() {
		
		int[][] matriz= new int[5][5];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				
			
				if(i==j) {

					matriz[i][j]=1;
					
				}
				
				
				
			}
			
		}
		return matriz;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		int[][] prueba=crearMatriz5conDiagonal1();
		
		System.out.println(imprimirMatriz(prueba));
		
	}

}
	


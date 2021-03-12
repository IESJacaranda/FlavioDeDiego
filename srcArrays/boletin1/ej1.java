package boletin1;

public class ej1 {
public static String imprimirMatriz(int matriz[][]) {
		
		String print2="";
		
		for(int i=0;i<matriz.length;i++) {
			
			print2=print2+"\n [";
			
			
			
			for (int j=0;j<matriz[i].length;j++) {
				
				if(j!=matriz[j].length-1) {
					print2+=matriz[i][j] + ", ";
				}else {
					print2+= matriz[i][j]+"]";
				}
		}
		
		
				
		
		
	}
		return print2; 
		
	
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


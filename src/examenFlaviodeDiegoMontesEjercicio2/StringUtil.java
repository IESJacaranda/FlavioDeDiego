package ejercicio2;

public class StringUtil {

	
	
	
	//aññadimos static para poder llamar al metodo
	
	
	/**
	 * Este método devuelve true si la subcadena se encuentra dentro de la cadena
	 * @param cadena
	 * @param subcadena
	 * @return
	 */
	public static  boolean compruebaCadena(String cadena, String subcadena) {
		
		//Si los tamaños estan al revés de como he pensado, los invierto. El resultado será el mismo.
		if (cadena.length()<subcadena.length()){
			String aux=cadena;
			cadena=subcadena;
			subcadena=aux;
			
		}
		
		int j=0;
		boolean result=false;
		cadena=cadena+" ";   //añadimos espacio para evitar que se salga de rango el bucle
		for(int i=0;i<cadena.length();i++) {
			
			while(j<subcadena.length() && cadena.charAt(i)==subcadena.charAt(j)) {
				i++;
				j++;
				
				//va comparando letra a letra y sumando para ir a la siguiente
				
			}
			//si coinciden los tamaños, es true
			if (j==subcadena.length()) {
				result=true;
				
			
			
			}
			
		}
		return result;
	}
	
}

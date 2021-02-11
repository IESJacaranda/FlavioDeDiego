package productos;

public class Categoria {

	
	private String codigoCat;
	
	

	public Categoria() {
		
	}
	
	public Categoria(String codigoCat) {
		
		this.codigoCat=codigoCat;
		
	}
	
	
	
	public void checkCategoria(Categoria c1){ 
		
		
		if(c1.getCodigoCat().length()<2 || c1.getCodigoCat().length()>5) {
			
			System.out.println("La categoría "+c1.getCodigoCat()+" no es correcta");
		} else {
			
			if (codigoCat.charAt(0)=='C'){
				System.out.println("La categoría "+c1.getCodigoCat()+" no es correcta");

			}else {
				
				String cadenaLower = codigoCat.toLowerCase();
				for(int i=1;i<codigoCat.length();i++) {
					if (Character.isLetter(cadenaLower.charAt(i)) && 
							cadenaLower.charAt(i)!='a' &&
							cadenaLower.charAt(i)!='e' &&
							cadenaLower.charAt(i)!='i' &&
							cadenaLower.charAt(i)!='o' &&
							cadenaLower.charAt(i)!='u'){
						System.out.println("La categoría "+
							c1.getCodigoCat()+" no es correcta");
					}
				}
			}
			
			
		}
		

	

	}
	
	
	


	public String getCodigoCat() {
		return codigoCat;
	}

	public void setCodigoCat(String codigoCat) {
		this.codigoCat = codigoCat;
	}
	
}

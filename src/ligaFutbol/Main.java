package ligaFutbol;

public class Main {

	
	
	public static void main(String[] args) {
	
		
		
		
		try {
			Partido partido1=new Partido(1,"Betis","Betis",2,2,'X');
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

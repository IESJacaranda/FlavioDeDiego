package ligaFutbol;

public class EquiposIgualesException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3363602887860359558L;
	
	

	public EquiposIgualesException() {
		super("Los equipos rivales son el mismo");
	}

}

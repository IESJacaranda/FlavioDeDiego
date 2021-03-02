package lineaPunto;

public class Linea {

	private Punto a;
	private Punto b;
	
	public Linea() {
		
		this.a= new Punto(0.0,0.0);
		this.b= new Punto(0.0,0.0);
		
		
	}
	
	
	
	public Linea(Punto a, Punto b) {
		
		this.a= a;
		this.b= b;
		
		
	}



	public Punto getA() {
		return a;
	}



	public void setA(Punto a) {
		this.a = a;
	}



	public Punto getB() {
		return b;
	}



	public void setB(Punto b) {
		this.b = b;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		
		if (this==obj ){
			result=true;
		}else if( obj!=null && obj instanceof Linea && ((Linea)obj).getA().equals(this.a) &&
		((Linea)obj).getB().equals(this.b)) {
			((Linea)obj).getA().equals(this.a);
			((Linea)obj).getB().equals(this.b);
			
	
			
		}
		
		
		
		
		
		return result;
	}



	@Override
	public String toString() {
		return "Linea [a=" + a + ", b=" + b + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}

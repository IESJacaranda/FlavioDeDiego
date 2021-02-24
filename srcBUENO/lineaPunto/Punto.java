package lineaPunto;

public class Punto {

	
	private double  x;

	private double y;

	
	public Punto() {
		
	}
	
	
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj) {
			
			result=true;
			
		} else if(obj!=null && obj instanceof Punto && ((Punto)obj).getX()==this.x &&
			((Punto)obj).getY()==this.y) {
			result=true;
		}
		
		
		return super.equals(obj);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
	
}

package producto;

public class Producto {

		
	
	private String codigo;
	private String descripcion;
	private double precioSinIva;
	private static double IVA = 0.20;

	
	//•Método para calcular el precio de venta del producto que se 
	//obtiene sumándole alprecio el IVA correspondiente.Realiza un programa principal que 
	//pruebe la clase anteri


	
	
	public Producto(String codigo, String descripcion, double precioSinIva) {
		
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precioSinIva=precioSinIva;
		
	}
	
	
	public Producto() {
		
	}
	
	
	
	
	public double precioFinal() {
		return (this.precioSinIva*this.IVA)+this.precioSinIva;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}


	@Override
	public int hashCode() {
		return this.descripcion.hashCode() + 
				(String.valueOf(this.precioSinIva)).hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= false;
		if(this==obj) {
			
			sonIguales=true;
			
		} else if(obj!=null && obj instanceof Producto && ((Producto)obj).hashCode()==this.hashCode()) {
			
			sonIguales=true;
			
			
			
		}
		return true;
	}


	@Override
	public String toString() {
		return this.getDescripcion() + " Tiene un precio final  de " + this.precioFinal();
	}
	
	
}



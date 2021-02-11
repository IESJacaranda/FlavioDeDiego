package productos;

public class Producto {
	
	private Categoria categoria;
	private String codigo;
	
	
	
	
	public Producto() {
		
	}
	
	
	public Producto(Categoria categoria, String codigo) {
		
		this.categoria=categoria;
		this.codigo=codigo;
	}
	
	public void checkCodigo(Producto p1){ 
		int contaNumero=0;
		if(p1.getCodigo()==null || p1.getCodigo().length()<5 || p1.getCodigo().length()>12) {
			
			System.out.println("El codigo "+p1.getCodigo()+" no es correcto");
		} else {
			
			for (int i=0; i<p1.getCodigo().length();i++) {
				
				if(Character.isDigit(codigo.charAt(i))) {
					contaNumero++;
				}
			}
			
			if (contaNumero<3) {
				System.out.println("El codigo "+p1.getCodigo()+" no es correcto");
			}else {
				System.out.println("El codigo "+p1.getCodigo()+"  es correcto");

			}	
		}
	}
	
	

	
	
	
	
	
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	}


	


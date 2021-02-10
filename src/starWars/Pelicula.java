package starWars;

public class Pelicula {

	
		private String nombre;
		private int year;
		private Personaje p1;
		private Personaje p2;
		private Personaje p3;
		
	

		
		
		public Pelicula() {
			
		}
		
		public Pelicula(String nombre, int year, Personaje p1, Personaje p2, Personaje p3) {
			this.nombre=nombre;
			this.year=year;
			this.p1=p1;
			this.p2=p2;
			this.p3=p3;
			
			
		}
		
		
		/**
		 * Compara con una pelicula. Si el parametro es más viejo devuelve -1,
		 * 0 en caso de igualdad, 1 en caso de ser más moderno
		 * @param peli
		 * @return
		 */
		public int compararFecha(Pelicula peli) {
				
			int result=0;
			
			if (this.year == peli.getYear()) {
				
				result = 0;
			}else if(this.year>peli.getYear()) {
				result=1;
			}else {
				result=-1;
			}

			return result;
		}
		
		public int poderPelicula(Pelicula peli) {
			
			
			
			return peli.getP1().getPoder() + peli.getP2().getPoder() + peli.getP3().getPoder();
		}
		
		public int poderMaximo(Pelicula peli) {
			
			int result;
			if (peli.getP1().getPoder()>=peli.getP2().getPoder()){
				if (peli.getP1().getPoder()>=peli.getP3().getPoder()){
					result=peli.getP1().getPoder();
				}else {
					
					result=peli.getP3().getPoder();
				}
				
			}else if(peli.getP1().getPoder()<=peli.getP2().getPoder()){
				
				if (peli.getP2().getPoder()>=peli.getP3().getPoder()){
					result=peli.getP2().getPoder();
				}else {
					
					result=peli.getP3().getPoder();
				}
				
				
			}else {
				result=peli.getP3().getPoder();
			}
			
			
			return peli.getP1().getPoder() + peli.getP2().getPoder() + peli.getP3().getPoder();
		}
		
		
		/*
		 * 
		 * El método toString de la película debe mostrar el nombre de la película, 
		 * a continuación elaño del estreno entre paréntesis y a continuación separados 
		 * por comas los nombres de lospersonajes de la película, ordenados alfabéticamente.
		 * 
		 */
		
		@Override
		public String toString() {
			
			String nombres=this.getP1().getNombre();
			
			if(nombres.compareTo(this.getP2().getNombre())>=0){
				
				nombres=this.getP2().getNombre()+","+ nombres;
				
			}else {
				nombres=nombres +","+this.getP2().getNombre();
						
			}
			
			if(nombres.compareTo(this.getP3().getNombre())>=0){
				
				nombres=this.getP3().getNombre()+","+nombres;
				
			}else {
				nombres=nombres +","+ this.getP3().getNombre();
						
			}
			
			
			return this.getNombre()+"("+this.getYear()+")"+nombres;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public Personaje getP1() {
			return p1;
		}

		public void setP1(Personaje p1) {
			this.p1 = p1;
		}

		public Personaje getP2() {
			return p2;
		}

		public void setP2(Personaje p2) {
			this.p2 = p2;
		}

		public Personaje getP3() {
			return p3;
		}

		public void setP3(Personaje p3) {
			this.p3 = p3;
		}
		
}


public class Libro {
	private String titulo;
	private String autor;
	private int ISBN;
	
	public Libro(String titulo, String autor, int ISBN){
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	public String getDatos(){
		return  "El titulo es " +titulo+ ". El autor es "+autor+". Y el ISBN es "+ISBN;
		}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

	/*public boolean equals(Object e){
		if(e instanceof Libro){
			Libro otro = (Libro)e;
			if (this.ISBN==otro.ISBN){
				return true;
			} else{
				return false;
			}
		} else {
			return false;
		}
	}*/
	
	
	
	

}

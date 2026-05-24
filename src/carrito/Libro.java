package carrito;
import java.util.ArrayList;
public class Libro {
	private int isbn;
	ArrayList<Autor> autores;
	private Formato formato;
	private double precioNominal;
	
	public Libro(int isbn, ArrayList<Autor> autores, Formato formato, double precioNominal ) {
		this.isbn = isbn;
		this.autores = autores;
		this.formato = formato;
		this.precioNominal = precioNominal;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public ArrayList<Autor> getAutore(){
		return autores;
	}
	
	public Formato getFormato() {
		return formato;
	}
	
	
	//Precio segun el formato
	public double getPrecio() {
		String tipo = formato.getTipo();
		if(tipo.equals("tapa dura")) {
			return precioNominal + 0.2*precioNominal; 
		}
		else if(tipo.equals("tapa blanda")) {
			return precioNominal;
		}
		else if(tipo.equals("mobi")) {
			return precioNominal - 0.05*precioNominal;
		}
		else return precioNominal - 0.15*precioNominal;
	}
	
	@Override
	public boolean equals(Object libro) {
		if(this == libro) {
			return true;
		}
		if(libro == null || getClass() != libro.getClass()) {
			return false;
		}
		Libro otroLibro = (Libro)libro;
		return(this.isbn == otroLibro.getIsbn());
	}
}

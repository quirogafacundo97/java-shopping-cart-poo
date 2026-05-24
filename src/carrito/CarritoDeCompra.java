package carrito;
import java.util.ArrayList;

public class CarritoDeCompra {
	private ArrayList<Libro> carrito;
	
	public CarritoDeCompra() {
		this.carrito = new ArrayList<>();
	}
	
	public void agregarLibro(Libro libro) {
		carrito.add(libro);
	}
	
	public void eliminarLibro(Libro libro) {
		carrito.remove(libro);
	}
	
	//Metodo para calcular el precio total neto
	public double calcularTotal() {
		double total = 0;
		for(Libro libro : carrito) {
			total+= libro.getPrecio();
		}
		return total;
	}
	
	//Metodo para pagar segun el tipo de pago
	public void pagar(TipoDePago tipoDePago) {
		double total = calcularTotal();
		System.out.println("Monto total a pagar: " + total);
		System.out.println("Monto efectivamente pagado: " + tipoDePago.pagar(total));
		
	}
}

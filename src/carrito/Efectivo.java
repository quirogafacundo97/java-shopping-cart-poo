package carrito;

public class Efectivo extends TipoDePago{
	
	@Override
	public double pagar(double monto) {
		return monto - 0.1*monto;
	}
}

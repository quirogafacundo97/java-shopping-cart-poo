package carrito;

public class MercadoPago extends TipoDePago{

	@Override
	public double pagar(double monto) {
		return monto + 0.15*monto;
	}
}

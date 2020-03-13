package factory_method_pedidos_clientes;

public class PedidoCredito extends Pedido {

	public PedidoCredito(double importe) {
		super(importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean valida() {
		return (importe >= 1000.0) && (importe <= 5000.0);
	}

	@Override
	public void paga() {
		System.out.println("Recibido pago a crédito por importe de " + importe + " euros.");

	}

}

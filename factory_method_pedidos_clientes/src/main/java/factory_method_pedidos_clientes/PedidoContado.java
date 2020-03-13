package factory_method_pedidos_clientes;

public class PedidoContado extends Pedido {

	public PedidoContado(double importe) {
		super(importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean valida() {
		return true;
	}

	@Override
	public void paga() {
		System.out.println("Recibido pago al contado por importe de " + importe + " euros.");

	}

}

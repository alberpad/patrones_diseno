package factory_method_pedidos_clientes;

public class ClienteCredito extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		return new PedidoCredito(importe);
	}

}

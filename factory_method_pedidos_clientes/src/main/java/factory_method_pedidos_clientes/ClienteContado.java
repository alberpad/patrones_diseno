package factory_method_pedidos_clientes;

public class ClienteContado extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		return new PedidoContado(importe);
	}

}

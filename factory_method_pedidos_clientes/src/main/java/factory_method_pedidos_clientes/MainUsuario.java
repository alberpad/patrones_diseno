package factory_method_pedidos_clientes;

public class MainUsuario {

	public static void main(String[] args) {
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0);
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000.50);
		cliente.nuevoPedido(10000.0);

	}

}

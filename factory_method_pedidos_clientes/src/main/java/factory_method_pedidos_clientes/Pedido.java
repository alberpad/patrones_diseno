package factory_method_pedidos_clientes;

public abstract class Pedido {

	protected double importe;

	public Pedido(double importe) {
		this.importe = importe;
	}

	public abstract boolean valida();

	public abstract void paga();

}

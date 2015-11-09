import java.util.ArrayList;

class Queue {
	private ArrayList cola = new ArrayList();

	public void add(Order p) {
		this.cola.add(p);
	}

	public Order GetPrimerPedido() {
		if (this.cola.size() == 0)
			return null;
		return (Order) this.cola.get(0);
	}

	public Order Siguiente() // Desencolar()
	{
		if (this.cola.size() == 0)
			return null;
		Order pedido = GetPrimerPedido();
		this.cola.remove(pedido);
		return pedido;
	}

	public int getLength() {
		return this.cola.size();
	}

	public boolean getEstaVacia() {
		return (this.cola.size() == 0);
	}
}

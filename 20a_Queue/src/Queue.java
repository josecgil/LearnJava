import java.util.ArrayList;

class Queue {
	private ArrayList<Order> _queue = new ArrayList<Order>();

	public void add(Order p) {
		this._queue.add(p);
	}

	public Order getFirstOrder() {
		if (this._queue.size() == 0)
			return null;
		return (Order) this._queue.get(0);
	}

	public Order next()
	{
		if (this._queue.size() == 0)
			return null;
		Order order = getFirstOrder();
		this._queue.remove(order);
		return order;
	}

	public int getLength() {
		return this._queue.size();
	}

	public boolean isEmpty() {
		return (this._queue.size() == 0);
	}
}

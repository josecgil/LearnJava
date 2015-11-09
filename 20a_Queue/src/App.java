import java.text.ParseException;

public class App {

	public static void main(String[] args) throws ParseException {
		/* 
		 * To complete some logistics program
		 * we are asked to implement some classes
		 * to manage some orders in a way that ensures
		 * orders are stored and processed in strict 
		 * order of arrival
		 * 
		 * For each Order we need to store the ID 
		 * (an internal number that you will generate: 
		 * first will be 1, second 2...) and the 
		 * Date of arrival (if the user of the class
		 * doesn't say the Date, you will assign the current
		 * Date.
		 * 
		 * Your order Queue will provide methods to add
		 * an Order at the end, to get the next Order to
		 * process (strict order of arrival, 
		 * when you get an Order, it gets removed from the
		 * queue), to know how many orders are in a Queue
		 * and to know if a Queue is empty.
		 * 
		 */
		
		//An example
		
        Queue queue=new Queue();
        
        Order order1=new Order(); //creates an order with id=1 and date=now
        int orderId = order1.getId(); 
        System.out.print("Created order with ID="+orderId); 
        System.out.println(" and date="+order1.getDate()); 
        
        queue.add(order1);
        System.out.println("Enqueued Order with Id" + orderId);
        //Creates an Order with ID=2 and the stated date
        Order pedido2=new Order("10/10/2010"); 

        
        System.out.print("Creado pedido con ID=" + pedido2.getId()); //da el ID del pedido
        System.out.println(" y fecha=" + pedido2.getDate()); //da la fecha en la que hizo el pedido

        queue.add(pedido2); //lo pone en la cola, detrás de p2
        System.out.println("Encolado pedido " + pedido2.getId());

        boolean estaVacia = queue.getEstaVacia();
        Order pedido=queue.Siguiente(); //da el primer pedido de la cola, quitándolo entonces de la cola
        System.out.println("Desencolado pedido " + pedido.getId());

        Order pedidoEspera = queue.GetPrimerPedido();
        System.out.println("Ahora el primer pedido en espera en la cola es el pedido con ID=" + pedidoEspera.getId());

        int longCola = queue.getLength(); //indica la longitud de la cola
	}

}

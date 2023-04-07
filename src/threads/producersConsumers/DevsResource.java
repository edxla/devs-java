package threads.producersConsumers;

import java.util.LinkedList;

public class DevsResource {
	private LinkedList<Integer> resources=new LinkedList<>();
	//Solo un hilo puede acceder con syncronized
	public synchronized int consume() throws InterruptedException 
	{
		//ciclo WHile
		while(resources.size()<=0) 
		{
			wait();
		}
		
		//Poll obtiene y remueve de la lista
		return resources.poll();
	}
	
	public synchronized void produce(int value) 
	{
		//offer usado con colas
		resources.offer(value);
		//notificar para poder consumir
		notifyAll();
	}

}

package threads.producersConsumers;

import java.util.Random;

public class DevsConsumer extends Thread {
	private DevsResource resource;
	
	public DevsConsumer(DevsResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		//ciclo infinito
		while(true) {
			try {
				int value = resource.consume();
				System.out.printf("%s consumed %d \n",getName(), value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}

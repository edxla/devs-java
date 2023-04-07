package threads;

class DevsThread extends Thread
{

	public DevsThread(String name) {
		super(name);
		
	}
	
	//Sobribiendo el metodo RUN

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			System.out.printf("Hilo %s indice %d \n", getName(),i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
}

public class ConstruccionDeHilos {
	
	public static void main(String[] args) {
		DevsThread hilo1 = new DevsThread("Hilo 1");
		DevsThread hilo2 = new DevsThread("Hilo 2");
		hilo1.start();
		hilo2.start();
		
	}

}

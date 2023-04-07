package threads;

import java.util.Iterator;

@SuppressWarnings("unused")
class Counter implements Runnable
{
	private int valor;
	public Counter(int valor) {
		this.valor = valor;
		 
	}

	@Override
	public void run() {
		System.out.printf("Estado metodo RUN %s \n ",Thread.currentThread().getState());
		for (int i = valor; i >= 0; i--) {
			System.out.printf("%s Valor %d \n",Thread.currentThread().getName(),i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		 
		
	}
	
}

public class DevCounter {
	public static void main(String[] args) throws InterruptedException {
		//Se crea hilo pero no se ejecuta
		Thread hilo = new Thread(new Counter(10),"Hilo 1");
		Thread hilo2 = new Thread(new Counter(20),"Hilo 2");
		//Estado del hilo
		System.out.printf("Estado %s \n ",hilo.getState());
		//Se Programa ejecuacion del hilo para asignarle un determinado tiempo
		hilo.start();
		hilo2.start();
		System.out.println("Se lanzaron los hilos");
		//Metodó Join permite pausar la ejecucion hasta que el otro termine y puede tener excepciones
		hilo.join();
		hilo2.join();
		System.out.println("Fin del Programa");
		System.out.printf("Estado Fin %s \n",hilo.getState());
		//Un hilo ejecutado no se puede ejecutar nuevamente
		//una vez que un hilo se muere no se pude ejecutar
	}

}

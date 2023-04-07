package lambdas.hilos;

public class PruebaHiloContador {
	public static void main(String[] args) {
		Thread hilo = new Thread(new HiloContador());
		hilo.start();
		
		
		//referencia con expresiones lambas
		
//		Runnable runnable2=()->{
//			
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};
		//Metodos sin nombre Definiendo bloques
		//Funciona a tra vez de funciones terminables
		//Runable y Thread es decir solo tiene un Metodo
		Thread hilo2 = new Thread(()->{
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		hilo2.start();
		
		
	}

}

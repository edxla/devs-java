package colecciones;

import java.util.Vector;

public class EjemploVector {

	public static void main(String[] args) {
		Vector<String> list = new Vector<>();
		//Diferencia Sincronizada en hilos para que no batallen al acceder a un elemento x [Controlando el accesso]
		list.add("Alex");
		System.out.println(list);

	}

}

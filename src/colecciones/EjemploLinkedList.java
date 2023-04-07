package colecciones;

import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Raidertrance");
		lista.add("devs");
		lista.add("devs2");
		
		//eliminar 1 elemento
		System.out.println(lista.poll());
		//Mostrar el prier valor en entrar [Cola]
		System.out.println(lista.peek());
		
		//Imprimr lista completa
		System.out.println(lista);
		
		//Accesp getFirts y get last
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());

	}

}

package colecciones;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {

	public static void main(String[] args) {
		//Siempre trabaja con Objetetos [Wrapper class]
		PriorityQueue<Integer> queue= new PriorityQueue<>();
		queue.add(1000);
		queue.add(2000);
		queue.offer(5);
		queue.offer(100);
		//Imprime de acuerdo a un orden nautural
		System.out.println(queue);
//		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}

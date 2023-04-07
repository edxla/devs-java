package lambdas.streams;

import java.util.stream.IntStream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		//Forma Imperativa
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Programacion Funcional");
		//Programacion Funcional
		
		//int String diferentes tipos de datos primitivos ejecutando accion funcional
		IntStream.range(0, 10).forEach(i->System.out.println(i));
		
	}

}

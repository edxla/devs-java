package lambdas.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximosYMinimos {
	public static void main(String[] args) {
		//soucion imperativa
		List<Integer> numbers = Arrays.asList(5,6,89,90,88,56,100);
		int min=numbers.get(0);
		for (Integer number : numbers) {
			if (number<min) {
				min=number;
			}
		}
		System.out.println("El valor menor es : " + min);
		
		//usando Streams
		//del todo el conjunto loq uiero ordenaado de forma naatural y devuelvemelo
		Integer minimo = Arrays.asList(5,6,89,90,88,56,100).stream().min(Comparator.naturalOrder()).get();
		System.out.println("El valor Menor es : "+minimo);
		
		
	}

}

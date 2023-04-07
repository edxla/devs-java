package lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDatosDuplicados {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,6,89,90,88,56,100,6,89,90);
		
		//Mantener la misma coleccion es mas 
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		
		//Utilizando Set (colleccion que no permite datos duplicados
		
		System.out.println(numbers.stream().collect(Collectors.toSet()));
	
	}

}

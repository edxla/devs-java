package colecciones;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericosMetodos {
	
	//metodo con Wildcard[<?] o fijo como Double que herada de Number
	static double sumarValores(List<? extends Number>valores) 
	{
		double suma=0.0;
		for (Number valor : valores) {
			suma+=valor.doubleValue();
		}
		return suma;
	}
	public static void main(String[] args) {
		double sumarValores = sumarValores(Arrays.asList(10.45,11.45,10,new Float(10.5)));
		System.out.println("Suma : "+ sumarValores);
	
	}

}

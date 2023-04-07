package arreglos;

import java.util.Iterator;

@SuppressWarnings("unused")
public class EjemploInicializacionDeArreglos {
	
	static void imprimirArreglo(String arreglo[]) 
	{
		for (String valor : arreglo) {
			System.out.println(valor);
			
		}
	}
	public static void main(String[] args) {
		//Inicializacion Explicita
		//Leer parametro cuando se desconoce los valores a asignar
		String nombres[]=new String [2];
		nombres[0]="raidentrace";
		nombres[1]="Devs";
//		imprimirArreglo(nombres);
		
		//Inicializacion Implicita
		//Se que datos me asignan
		String nombres2[] = {"Raidentrace","Devs"};
//		imprimirArreglo(nombres2);
		
		//Inicializacion Anonima
		
		String nombres3[]=new String [] {"Raidentrace","Devs"};
		imprimirArreglo(new String [] {"Raidentrace","Devs"});
		
	}

}

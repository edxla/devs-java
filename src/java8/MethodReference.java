package java8;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
class StringUtils
{
	static boolean isUpperCase(String cad) 
	{
		return cad.toUpperCase().equals(cad);
	}
}
class Persona
{
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
}

public class MethodReference {
	public static void main(String[] args) {
		//List<String> names = Arrays.asList("ALICE","Alex","Juan","Pedro");
		
//		//programacion imperativa
//		System.out.println("Forma imperativa");
//		for (String name : names) {
//			System.out.println(name);
//		}
		
//		//COn Lamdas dos puntos para indicar el metodo como (Parametro)referencia
//		System.out.println("Forma funcional usando references");
//		names.stream().forEach(System.out::println);
		
		//utilizando filtro
		//Si esa en mayuscula lo imprimira (Inovacion de forma manuak)
//		names.stream()
//		.filter(n->StringUtils.isUpperCase(n))
//		.forEach(System.out::println);
//		
//		//Filtro de forma funcional
//		System.out.println("Filtro Funcional");
//		names.stream()
//		//pasar como parametro el metodo para hacer el filtado
//		//pasar metodo como una referencia
//		.filter(StringUtils::isUpperCase)
//		.forEach(System.out::println);
//	
		//transformar objeto tipo perosona y no stream
		
		System.out.println("Transformacion de obj a Tipo Persona");
//		names.stream()
//		.filter(StringUtils::isUpperCase).
//		//caso 1 : Forma tradicional (vieja)
//		//	map(p->new Persona(p)).
//		//caso 2 Usando MethRefrence para usar el contructor, construir el obj y asigarlo
//		map(Persona::new).
//		forEach(System.out::println);
		
		//FOrma funcional
		Arrays.asList("ALICE","Alex","Juan","Pedro").stream().
		filter(StringUtils::isUpperCase).map(Persona::new).forEach(System.out::println);
		
		
	}

}

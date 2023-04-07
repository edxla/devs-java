package lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Personas
{
	private String nombre;
	private int edad;
	
	public Personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	 
	
}
//clases anonimos
public class PruebaSoloConStreams {
	public static void main(String[] args) {
		List<Personas> person = Arrays.asList(new Personas("Juan", 10),
				new Personas("Pepe", 30), 
				new Personas("Osbaldo", 32),new Personas("Maria", 18 ), new Personas("Martin", 52));
		//usando Lampdan Puedo poner Parenteis o no variable p ->
		List<Personas> result = person.stream().filter(p-> p.getEdad() >= 18).limit(3).collect(Collectors.toList());
		System.out.println(result);
		
		
		
		
		
//		//clases anonimos funciona pero en java 8 no tiene sentido
//		List<Personas> result = person.stream().filter(new Predicate<Personas>() {
//
//			@Override
//			public boolean test(Personas p) {
//				// TODO Auto-generated method stub
//				
//				return p.getEdad()>18;
//			}
//		}).limit(3).collect(Collectors.toList());
//		System.out.println(result);
		
		
	}

}

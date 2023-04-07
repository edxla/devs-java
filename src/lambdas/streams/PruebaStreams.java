package lambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Programacion Imperati
class Persona
{
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
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

public class PruebaStreams {
	public static void main(String[] args) {
		//Conversion liasta a arrays
		List<Persona> personas =  Arrays.asList(new Persona("Juan", 10),new Persona("Pepe", 30), 
				new Persona("Osbaldo", 32),new Persona("Maria", 18 ), new Persona("Martin", 52));
		List<Persona> resul= new ArrayList<>();
		int count=0;
		for (Persona persona : personas) {
			if(persona.getEdad()>=18) 
			{
				resul.add(persona);
				count++;
			}
			if (count==3) {
				break;
			}
			
		}
		System.out.println(resul);
		
		
	}

}

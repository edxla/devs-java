package lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Alumno 
{
	private String nombre;

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
public class EjemploStreamMap {
	public static void main(String[] args) {
		//Lista de Alumnos a Strinngs
		List<Alumno> alumnos = Arrays.asList(new Alumno("Juan"), new Alumno("Pedro"), new Alumno("Juan"));
		List<String> nombres = alumnos.stream().map(a->a.getNombre()).collect(Collectors.toList());
		System.out.println(nombres);
		
		//Lista String a Lumnos  Data Tranfer object
		List<Alumno> alumnos2 = nombres.stream().map(n->new Alumno(n)).collect(Collectors.toList());
		System.out.println(alumnos2);
		
	}

}

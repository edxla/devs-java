package colecciones;

import java.util.TreeSet;


class Perro implements Comparable<Perro>
{
	private String nombre;
	

	public Perro(String nombre) {
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
		return "Perro [nombre=" + nombre + "]";
	}

	
	
	//SobreEscribirMEtodo
	
	@Override
	public int compareTo(Perro p) {
//		Perro p =(Perro)p;  cast modo adcendente
//		return nombre.compareTo(p.getNombre());
		//Decendenete
		return p.getNombre().compareTo(nombre);
	}
	
	
	
}

public class EjemploComparables {

	public static void main(String[] args) {
		//Set de Objetos tipo Perro
		TreeSet<Perro> set = new TreeSet<>();
		set.add(new Perro("Zhabelita"));
		set.add(new Perro("Chabelita"));
		set.add(new Perro("Rocky"));
		System.out.println(set);
		
	}

}

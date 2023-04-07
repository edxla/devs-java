package colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Gato
{
	private String nombre;
	private String apellido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Gato(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
//ctl+1 imprmenetar metodos
class OrdenamientoPorNombre implements Comparator<Gato> 
{

	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
	
}

class OrdenamientoPorApellido implements Comparator<Gato>
{

	@Override
	public int compare(Gato o1, Gato o2) {
		// TODO Auto-generated method stub
		return o1.getApellido().compareTo(o2.getApellido());
	}

}

public class EjemploComparador {

	public static void main(String[] args) {
		//solo se pude tener un ordenamiento com comparable
		Set<Gato> gatos=new TreeSet<>(new OrdenamientoPorApellido());
		gatos.add(new Gato("Bequer", "Chucho"));
		gatos.add(new Gato("Ozzy", "Lopez"));
		gatos.add(new Gato("Pili", "Kiniki"));
		System.out.println(gatos);
	}

}

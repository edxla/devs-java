package lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {
	public static void main(String[] args) {
		
		//Obj de tipo compator				//expresion lamda
		@SuppressWarnings("unused")
		Comparator<Persona> comparator = (Persona p1, Persona p2)->p1.getApellido().compareTo(p2.getApellido());
		Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
			
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};
		
		Set<Persona> personas = new TreeSet<>(comparadorPorEdad);
		
		personas.add(new Persona("Alex", "Gonzales",32));
		personas.add(new Persona("Juan", "Lopez",32));
		personas.add(new Persona("Zizu", "Mendez",32));
		personas.add(new Persona("Arturo", "Sanchez",32));
		
		System.out.println(personas);
	}

}

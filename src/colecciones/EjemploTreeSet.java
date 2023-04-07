package colecciones;

import java.util.TreeSet;

public class EjemploTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Ulises");
		set.add("Ulises");
		set.add("Ziliban");
		set.add("Alex");
		set.add("Jaime");
		//al ser un Set no debe existir duplicados y ordena naturalmente
		System.out.println(set);

	}

}

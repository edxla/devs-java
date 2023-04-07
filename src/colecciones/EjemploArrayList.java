package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		//Default 10
		ArrayList<String> array = new ArrayList<>();
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		array.add("RaidenTrace");
		array.add("Devs");
		
		array.add(5,"edxda");

		System.out.println(array.size());
		System.out.println(array);

	}

}

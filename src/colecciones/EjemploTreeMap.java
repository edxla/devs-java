package colecciones;

import java.util.TreeMap;

public class EjemploTreeMap {

	public static void main(String[] args) {
		//Valores llave valor  ordenadas al orden natural lave
		TreeMap<String, String> map = new TreeMap<>();
		map.put("Zu su", "Futbolista");
		map.put("Alex", "Progrmador");
		map.put("Juan", "Payaso");
		
		System.out.println(map);

	}

}

package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollectios {

	public static void main(String[] args) {
		List<String> nombres=new ArrayList<>();
		nombres.add("Chabelita");
		nombres.add("Rocky");
		nombres.add("Alex");
		//ordenar con collections forma Asc
		Collections.sort(nombres);
		//buscar en especifico con coleccion ordenada para qur funcione correctamente
		//ctl+1 asignar variable
		int index = Collections.binarySearch(nombres, "Rocky");
	
		
		System.out.println(nombres);
		System.out.println(nombres.get(index));

	}

}

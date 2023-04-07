package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		HashSet<String> nombres=new HashSet<>();
		//Al poner doble pondra false porque la manera de comprobar es atravez de boleanos
		nombres.add("Uises");
		nombres.add("Uises");
		nombres.add("Devs");
		nombres.add(null);
		//IMprimir datos no repetidos sin orden
		System.out.println(nombres);
		

	}

}

package Java9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Foo<t>
{
	
	
}
public class OperadorDiamante {
	public static void main(String[] args) {
		//operador DIamante
		//Definir tipo en la Referencia y poner el tipo en la lista
		List<String> lista = new ArrayList<String>();
		lista.add("raiden");
		System.out.println(lista);
		
		//Tambien puede ser un mapa
		System.out.println("Mapa");
		//mapa vs Map s                                        HashMap<String, Map<String, List<String>>>
		@SuppressWarnings("unused")
		Map<String, Map<String, List<String>>> collection = new HashMap<>();
		
		//tipo de dato anonimo
		//error de compilacion porque es funcion de haa
		//                     Foo<Integer>
		//Foo<Integer> foo=new Foo<>() {};
				
	}

}

package colecciones;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Llave - valor
public class EjemploHashMap {

	public static void main(String[] args) {
		Map<String, String> diccionario = new HashMap<>();
		//valores pares put solo agrega llave y valor
		//Metodo put en vez de add
		diccionario.put("raidentrace", "Es la cuenta de Instagram");
		diccionario.put("Java", "Es el lenguaje que etsamos practicando");
		diccionario.put(null, "Represneta la ausencia de un ojeto");
		
		//valor de bucket del 1 al 15 almacenan listas ligadas
		
		//No deben existir 2 llaver si no sobreescribira la ya ecistente
//		diccionario.put("Java", "Es el lenguaje mas padre");
		
				
		// HashCode internamnete determin la posiicon
		
//		System.out.println(diccionario);
//		
//		//iterara con for
		for (String llave: diccionario.keySet()) 
		{
			System.out.println(llave+"="+diccionario.get(llave));
		}
//		//Entry set devuele un entry tipo de tado Valor [] []
		for(Entry<String, String> entry: diccionario.entrySet()) 
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
//		//COnt shif + o importat

	}

}

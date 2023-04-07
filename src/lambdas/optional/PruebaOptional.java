package lambdas.optional;

import java.util.Optional;

public class PruebaOptional {
	private static String[] nombre= {"Alex","Nora","devs"};
	
	public static Optional <String>  buscarPorNombre(String n) 
	{
		for (String nombre : nombre) {
			if(nombre.equals(n)) 
			{
				return Optional.of(nombre);
			}
			
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		Optional<String> result = buscarPorNombre("Alex");
		if(result.isPresent()) 
		{
			System.out.println(result.get().toUpperCase());
		}else 
		{
			System.out.println("No se encontro el nombre");
		}
		
		//obtener strng para no resivir optional
		
		String nombre = buscarPorNombre("Pepe").orElse("Nombre default");
		System.out.println(nombre);
		
		//Excpcion Ilegal
		String value = buscarPorNombre("Alexa").orElseThrow(()-> new IllegalAccessException("No se encontro el nombre"));
		System.out.println(value);
	}

}

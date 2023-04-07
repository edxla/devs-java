package statics;

class SerVivo
{
	public SerVivo() 
	{
		System.out.println("Constructor ser vivo");
	}
}

class Humano
{
	//no necesita un objeto creado
	static int numeroDeHumanos=0;
	String nombre;
	
	public Humano() {
		//numeroDeHumanos++;
		System.out.println("Constructor");
		
	}
	
	//Bloques Anonimos

	public Humano(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor sobrecargado");
		
	}
	
	/* bloque ANONIMO y despues constructor se ejecuta
	 * 
	 * 
	 * */
	{
		numeroDeHumanos++;
		System.out.println("Bloque anonimo");
		
	}
	{
		System.out.println("Bloque Anonimo 2");
	}
	
	
	
}

public class EjemploStaticEnVariables {

	public static void main(String[] args) {
		System.out.println(Humano.numeroDeHumanos);
		new Humano();
		new Humano();
		new Humano("Alex");
		new Humano();
		System.out.println(Humano.numeroDeHumanos);

	}

}

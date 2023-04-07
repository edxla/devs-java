package exceptions;

class RecursosDevs implements AutoCloseable  
{
	void foo() 
	{
		System.out.println("Foo");
	}

	@Override
	public void close() {
		System.out.println("Liverando Recursos");
		
	}
	
}

public class EjemploTryWithResources {
	public static void main(String[] args) 
	{
		try(RecursosDevs recurso = new RecursosDevs())
		{
			recurso.foo();
		}
		
	}

}

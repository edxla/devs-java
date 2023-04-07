package Java9;
interface Bar
{
	//Los metodos deben ser Publicos en java menores a 9
	default void foo()
	{
		foo();
		//metodo con cuerpo
		//Necesita detalles de implementacion
	}
	//Detalle de Implemnetacion
	//no se puede poner privado
	default void foo2() 
	{
		
	}
}
public class PrivateMethodsInterfaces {
	public static void main(String[] args) {
		
	}

}

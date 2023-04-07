package java8;

import java.util.Comparator;

@SuppressWarnings("unused")
interface Follower
{
	//Abstracto si no se conoce el comportamiento
	void unfollow();
	//si se sabe el ccomportamiento para que las clases puedan sobreescribirlas
	default void follow() 
	{
		System.out.println("Metodo generico para seguir a alguien");
	}
	//Saber COmportamiento y decidir que no se sobrescriba
	static void println() {
		System.out.println("Metodo estatic en una interfcae");
	}
}

class TwitterFollower implements Follower
{

	@Override
	public void unfollow() {
		System.out.println("Unfollow i Twitter");
		
	}
	//Al Sobre escribir solo se puede sobrescribir Follow de l interface 
	//No puedo sobrescribir el medoto print
	//el metodo print es estatic y el follow es un metodo defaul que se peude sobrescirbir

//	@Override
//	public void follow() {
//		System.out.println("UnFollow de Twiter");
//	}
	
}

public class MetodosStaticEnInterfaces {
	public static void main(String[] args) {
		Follower.println();
		//Para invocar follo necesitamos un obbjeto que implemente follower
		new TwitterFollower().follow();
		/// SIn neceididad de tener un objeto creado
//		Comparator<?> reverseOrder = Comparator.reverseOrder();
		
	}

}

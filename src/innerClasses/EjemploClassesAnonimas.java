package innerClasses;

class EjempoAnonima
{
	void foo() 
	{
		System.out.println("foo");
	}
	}

public class EjemploClassesAnonimas {
	public static void main(String[] args) {
		//Clase anonima al agregr {}
		EjempoAnonima obj = new EjempoAnonima() {
			//Sobreescribir foo para ese metodo en especifico
			//Ereda de la clase anima y en el cuerpo se pone
			//lo que este en el bloque
			//Implica herencia
			@Override
			void foo() 
			{
				System.out.println("Bar");
			}
			
			
		};
		obj.foo();
		
	}
}

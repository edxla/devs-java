package innerClasses;
abstract class FiguraAnonima
{
	abstract void foo();
	
}

public class EjemploAnonimasAbstractas {
	public static void main (String [] args) {
		FiguraAnonima figura = new FiguraAnonima() {
			//Sobrescribir metodos abstractos
			@Override
			void foo() {
				System.out.println("Foo");
				
			}
		};
		figura.foo();

	}
}

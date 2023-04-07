package innerClasses;

class External
{
	void foo() 
	{
		System.out.println("Foo");
	}
	
	class Internal
	{
		void bar() 
		{
			System.out.println("Bar");
		}
	}
	
}

public class ClasesInternasRegulares {
	public static void main(String[] args) {
		External ex=new External();
		ex.foo();
		External.Internal interna=ex.new Internal();
		interna.bar();
		
	}

}

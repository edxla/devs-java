package statics;
//La invocacion no depende de la creacion del OB
//Al poner static la invocacion depende de la Clase Referenciada
class A
{
	static void foo()
	{
		System.out.println("Foo");
	}
}

class B extends A
{
	static void foo() {
		System.out.println("Foo2");
	}
	
}

public class StaticYPolimorfismo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		
		A a=new B();
		a.foo();

	}

}

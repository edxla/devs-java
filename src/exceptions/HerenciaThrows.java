package exceptions;
// throw debe ser throwable
class Foo
{
	void print() throws Exception
	{
		
	}
}

class Bar extends Foo
{
	//Hereda la misma expeciones no puede heredar otras
	@Override
	void print() throws Exception
	{
		
	}
	
}

public class HerenciaThrows {

}

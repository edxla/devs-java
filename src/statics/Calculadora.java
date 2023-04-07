package statics;

public class Calculadora {
	
	
	static int suma(int x, int y) 
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(suma(5,5));
	}

}


//Metodos estaticos no dependen de un objeto para poder existir.
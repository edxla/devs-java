package exceptions;

/*
 * Manjear Excepciones sera una de dos cosas
 * Atrapar la excepcion try catch
 * propagar a quien invoco al metodo
 * @throws Exception
 * Unchech no se ponen bloques try ni Throws
 */


public class EjemploThrow {
	//Metodo puede producir una excepcion del tipo Chech
	static double dividir(int a, int b) throws Exception 
	{
		if(b!=0) 
		{
			return a/b;
		}else 
		{
			throw new Exception("No se peude dividir entre 0");
		}
	}
	
	public static void main(String[] args) {
		
		double resultado;
		try {
			resultado = dividir(10,0);
			System.out.println("Resultado : "+resultado);
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
			
		}
		
		
	}

}

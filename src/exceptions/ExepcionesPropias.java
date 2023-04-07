package exceptions;

//TIPO UNCHECK CON RUNTIME

//CHECK se cambio por Exception o bloque trycat
class TituloIncorrectoException extends Exception
{
	private static final long serialVersionUID = 4037539706838423051L;
	
	public TituloIncorrectoException(String error) {
		super(error);
	}
	
}

public class ExepcionesPropias {
	/*
	 *Si el nombre del curso esta en mayusculas esta uncorrecto
	 *
	 *
	 *@param titulo
	 */

	//CHech se pone throws
	static void crearCurso(String titulo) throws TituloIncorrectoException
	{
		if(!titulo.toUpperCase().equals(titulo)) 
		{
			//Tipo Chech da error asi que se debe poner trows
//			throw new TituloIncorrectoException("EL titulo debe estar en mayusculas");
			throw new TituloIncorrectoException("EL titulo debe estar en mayusculas");
			
		}
		System.out.println("Titulo Correcto");
		
	}
	
	public static void main(String[] args) {
		//throws o try catch
//		crearCurso("JAVA DESDE CERO A PROFUNDIDAD");
		try {
			crearCurso("JAVA DESDE CERO A PROFUNDIDAD");
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		
	}

}

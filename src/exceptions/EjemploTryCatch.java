package exceptions;

public class EjemploTryCatch {
	public static void main(String[] args) {
		try {
			int x=10;
			int y=10/x;
			System.out.println(" Valor de la division: "+y);
			String nombre="s";
			System.out.println(nombre.toString());
			
			String arr[]= {"RaidenTrace","devs"};
			//Genera error por indiice
			System.out.println(arr[3]);
			
			
		} catch (ArithmeticException | NullPointerException e) {
			//Metodo permimite imprimir el datalle del error
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			
			System.err.printf("Aritmethic y Null ecepction %s \n", e.getMessage());
			
			
		}catch (Exception e) {
			System.err.printf("Exception %s \n", e.getMessage());
		} finally {
			System.out.println("Siempre se ejecuta");
		}
	}

}

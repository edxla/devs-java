package exceptions;

public class ReglasTryCatchFinallly {
	
	static void test() 
	{
		//EL Fainaly siempre se ejecutara aun con un return
		//A menos que se le coloque un system.ecxit(Terminar un programa)
		try {
			System.out.println("Bloque Try");
			return;
		} finally {
			System.out.println("Bloque Fnallu");
		}
	}

	public static void main(String[] args) {
		//1 .- Bloque con try y catch
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//2 Bloque con Try y Finally sin catch
		try {
			
		} finally {
			// TODO: handle finally clause
		}
		
		//3 Bloque Try, Catch y FInally
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
		//Bloque con multiples catch solo una se ejecutaa menos que sean especificas
		try {
			
		} catch (NullPointerException e) {
			// TODO: handle exception
		}catch (RuntimeException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}catch (Throwable e) {
			// TODO: handle exception
		}
		

	}

}

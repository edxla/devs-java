package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDeTeclado {
	
	public static String readMessage(String prompt) throws IOException 
	{
		System.out.println(prompt);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int ReadInteger(String promp) throws NumberFormatException, IOException 
	{
		//propagar la excpecio
		return Integer.parseInt(readMessage(promp));
	}
	
	
	
	public static void main(String[] args) throws IOException {
		//leer datos de la consola
		String mensaje=readMessage("Como te llamas? ");
		System.out.println("Te llamas : "+mensaje);
		int edad= ReadInteger("Cuantos años tienes");
		System.out.println("Tienes : "+edad);
		
	}

}

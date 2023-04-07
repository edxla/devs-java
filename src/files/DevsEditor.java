package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DevsEditor {
	//contante
	public static final String BASE_PATH = "C:\\Users\\Amazarashi\\Documents\\Curso Java a Profundidad\\blogDeNotas";
	
	public static String readMessage() throws IOException 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Indica el nombre del archivo");
		String fileName=readMessage();
		//Separtor variable para representar un separador de archivos
		File f = new File(BASE_PATH.concat(File.separator).concat(fileName));
		System.out.println("Empiez a escirbir y escribe salir par terminar");
		String cadena=null;
		try(PrintWriter pw = new PrintWriter(f))
		{
			do {
				cadena=readMessage();
				
				if(!"salir".equals(cadena)) 
				{
					pw.println(cadena);
				}
				
			} while (!"salir".equals(cadena));
		
		}
	
	}

}

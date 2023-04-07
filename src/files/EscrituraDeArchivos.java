package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivos {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\Amazarashi\\Documents\\Curso Java a Profundidad\\texto.txt");
		try(PrintWriter pw=new PrintWriter(f)) {
			pw.println("Hola");
			pw.println("Sganme en ");
			pw.println("@ Todos lados ");
		} 
	}

}

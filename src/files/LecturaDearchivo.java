package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

@SuppressWarnings("unused")
public class LecturaDearchivo {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\\\Users\\\\Amazarashi\\\\Documents\\\\Curso Java a Profundidad\\\\texto.txt");
		if(f.exists()) 
		{
			try( FileReader fr=new  FileReader(f); 
			BufferedReader br=new BufferedReader(fr);)
			{
				String cadena=null;
				do {
					cadena=br.readLine();
					System.out.println(cadena);
				} while (cadena!=null);
				
				
			}
		}else 
		{
			System.out.println("El archivo no existe");
		}
	}

}

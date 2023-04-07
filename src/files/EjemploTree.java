package files;

import java.io.File;

public class EjemploTree {
	//metodo estatico que recibe una lista y una tabulacion
	public static void print(File [] files, String tabs) 
	{
		//Espacio a tener
		String spaces=tabs.concat("-");
		if(files!=null) 
		{
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s %s \n",spaces,file,file.getName());
				}else {
					System.out.printf("%s %s \n",spaces,file,file.getName());
					//llamada recursiva - Imprime lista de archivos del directrio 
					print(file.listFiles(), spaces);
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Amazarashi");
		System.out.println(f.getName());
		print(f.listFiles(),"-");
	}

}

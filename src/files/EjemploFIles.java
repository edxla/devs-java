package files;

import java.io.File;

public class EjemploFIles {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Amazarashi\\Documents\\Curso Java a Profundidad\\Files");
		System.out.println("Is file :"+f.isFile());
		System.out.println("Is directory: "+f.getName());
		System.out.println("Name :"+f.getName());
		System.out.println("Can read : "+f.canRead());
		File[] content = f.listFiles();
		for (File file : content) {
			System.out.println("Content - Is file :"+file.isFile());
			System.out.println("Content - Is directory: "+file.getName());
			System.out.println("Content - Name :"+file.getName());
			System.out.println("Content - Can read : "+file.canRead());
			System.out.println();
		}
	}

}

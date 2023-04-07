package files.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraDeObjectos {
	public static void main(String[] args) throws  IOException {
		Programador programadores[]= { new Programador("Alex", "Python"),
				new Programador("Paco", "Python"),
				new Programador("Juan", "Python"),null};
		File file = new File("C:\\Users\\Amazarashi\\Documents\\Curso Java a Profundidad\\blogDeNotas\\programadores.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		//cerrar flujo
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for (Programador programador : programadores) {
					oos.writeObject(programador);
					
				}
			}
		}
	}


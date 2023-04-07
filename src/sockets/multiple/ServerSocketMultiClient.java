package sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//creacion de un hilo
class WorkerSocket extends Thread
{
	
	private Socket client;
	//atributo llamado socket. Inicializa cuando cse crea al objeto
	public WorkerSocket(Socket client) {
		super();
		this.client = client;
	}

	@Override
	public void run() {
		try (DataInputStream dis=new DataInputStream(client.getInputStream());)  {
			String mensaje=null;
			do {
				 mensaje = dis.readUTF();
				 System.out.printf("%s Dice : %s \n", client.getInetAddress().getHostName(),mensaje);
			} while (!"salir".equals(mensaje));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
	}
	
	
}

public class ServerSocketMultiClient {
	public static void main(String[] args) throws IOException {
		try (ServerSocket ss= new ServerSocket(8090);) {
			while (true) {
				System.out.println("Escuchando Clientes");
				Socket client = ss.accept();
				System.out.println(" Cliente Conectado :  "+client.getInetAddress().getHostName());
				new WorkerSocket(client).start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

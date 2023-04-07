package sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	 public static String readMessage() throws IOException 
	 {
		 System.out.println("\n ->");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 return br.readLine();
	 
	 }
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//Creamos el socket
		try (Socket socket=new Socket("localhost",8090);
				//Mnadamos a un FLujo dentro del soque
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())
				){
			String mesaje = null;
			do {
				mesaje = readMessage();
				//escribirmos el mensaje
				dos.writeUTF(mesaje);
			} while (!"salir".equals(mesaje));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

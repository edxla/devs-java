package sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DevsClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//try withot rresourse
		try(Socket socket=new Socket("localhost",8090);
				DataOutputStream dos=new DataOutputStream(socket.getOutputStream()))
		{
			dos.writeUTF("Hola soy un cliente del socket \n");
			dos.writeUTF("salir");
		}
		
	}

}

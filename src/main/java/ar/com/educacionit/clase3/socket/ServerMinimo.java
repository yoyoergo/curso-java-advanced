package ar.com.educacionit.clase3.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimo {

	public static void main(String[] args) {
		
		//crea un server socket que atiende clientes
		String mensaje ="<h1>server de carlos!</h1>" ; //mensaje a enviar al cliente
		mensaje = "HTTP/1.1 200 OK\n" +
//				"Content-Type: text/html\n" +
				"Content-Type: text/plain\n" +
				"Content-Length: "+mensaje.length()+"\n\n"
				+ mensaje;
		
		//quiero que mi server escuche en el puerto 5000
		try(ServerSocket ss = new ServerSocket(5000)) {
			while(true) {
				System.out.println("Esperando conexion de clientes!!!");
				
				try(Socket so = ss.accept()) {
					
					//debo crear el OutputStream para poder enviar datos al cliente
					OutputStream out = so.getOutputStream();
					
					//auditar quien se esta conectando
					//filtros!!
					
					System.out.println(so.getInetAddress());
					
					//envio un mensaje
					out.write(mensaje.getBytes());
				}
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

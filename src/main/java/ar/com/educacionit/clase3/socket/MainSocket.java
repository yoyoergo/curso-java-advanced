package ar.com.educacionit.clase3.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class MainSocket {

	public static void main(String[] args) {
		
		/**
		  Socket
		 
		 SERVER														CLIENTE
		 ---------------										-------------
		 ServerSocket ss = new ServerSocket(int port)			Socket s = new Socket(String ip,int port);
		 65535 ports
		 3306 ? 														
		 80
		 8081 ? web spring mvc/rest
		 < 1000 los SO
		 
		 ss.accept()
		 
		 PUEDO ENVIAR DATOS:
		 OutputStream ---------------------------------->		InputStream
		 
		 PUEDO RECIBIR DATOS:
		 InputStream <-----------------------------------		OutputStream
		 
		 - si quiero enviar y recibir abrir dos ServerSocket
		 
		 ----------------------									---------------
		 ss.close()												s.close()
		 
		 
		 CUANDO EL CLIENTE ES JAVA Y EL SERVER ES JAVA
		 BufferReader / BufferWriter : transportar buffer de bytes
		 DataInputStream / DataOutputStream: transportar tipos de datos primitivos
		 ObjectinputStream / ObjectOutputStream: transportar objeto de java 
		 */
		
		// ejercicio de deteccion de puertos
		List<Integer> libres = new ArrayList<>();
		List<Integer> ocupados = new ArrayList<>();
		
		for(int i=0; i<= 1500; i++) {
			try {
				ServerSocket s = new ServerSocket(i);				
				s.close();
				libres.add(i);
			} catch (IOException e) {
				ocupados.add(i);
			}
		}
		
		System.out.println("Libres:");
		for(int i : libres) {
			System.out.println(i);
		}
		
		System.out.println("Ocupados:");
		for(int i : ocupados) {
			System.out.println(i);
		}
	}

}

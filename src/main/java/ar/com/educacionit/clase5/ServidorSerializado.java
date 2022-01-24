package ar.com.educacionit.clase5;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSerializado {

	public static void main(String[] args) {
		try(	
				ServerSocket ss = new ServerSocket(7000);				
			) {			
			while(true) {				
				System.out.println("Esperando conexion de cliente");
				
				try(
						Socket so = ss.accept();
						ObjectInputStream in = new ObjectInputStream(so.getInputStream());
						ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
					) {
					
					try {
						//recibir del cliente un objeto Persona
						Persona persona = (Persona)in.readObject(); //> ClassCastException
						
						//grabar en la db
						//enviarlo aun servicio REST
						
						System.out.println("Se ha recibido una persona!");
						
						//responder al cliente por medio del out
						out.writeUTF("Se ha recibido la persona...");
					}catch (ClassCastException cce) {
						//aca si el cliente envia algo que no es una persona
						out.writeUTF("El objeto recibido NO es una persona");
					}catch (Exception e) {
						out.writeUTF("Error desconocido en la entrada de datos");
					}
				}
			}						
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

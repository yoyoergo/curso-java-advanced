package ar.com.educacionit.clase5.clientenuevo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ClienteSerializado {

	public static void main(String[] args) {
		
		try(
				Socket so = new Socket("localhost",7000);
				ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
				ObjectInputStream in = new ObjectInputStream(so.getInputStream());
			) {
			
			//cliente crea la persona
			Persona persona = new Persona("carlos","lopez",83f);
			
			//envia al servidor
			out.writeObject(persona);

			//leer lo que envia el server
			String respuestsa = in.readUTF();
			
			System.out.println(respuestsa);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

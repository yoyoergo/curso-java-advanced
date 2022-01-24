package ar.com.educacionit.clase3.socket;

import java.io.InputStream;
import java.net.Socket;

public class ClienteMinimo {

	public static void main(String[] args) {
		
		System.out.println("Conectando al servidor...");
		
		int car;
		try(
				Socket so = new Socket("localhost",5000);
				InputStream is = so.getInputStream();
			) {
			
			//acá va el codigo: lo que me mando el server
			while((car = is.read()) != -1) {
				System.out.print((char)car);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fin de la conexion");
		}

	}

}

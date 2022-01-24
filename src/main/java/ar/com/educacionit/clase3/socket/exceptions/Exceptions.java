package ar.com.educacionit.clase3.socket.exceptions;

import java.io.IOException;
import java.net.ServerSocket;

import ar.com.educacionit.clase3.senderreceiver.Data;
import ar.com.educacionit.clase3.senderreceiver.Sender;
import ar.com.educacionit.clase3.socket.exceptions.Calculadora.MiExeption;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {
		
		//Exception que maneja la jvm
		//errores 	> unchecked > RuntimeException
		//			> checked   > Exception
		
		int a = 10;
		int b = 1; 					//java.lang.ArithmeticException log(0) raiz(-1) /0 etc
		int c = a/b;	// no pasa nada jvm me deja seguir.	 
		System.out.println(c);
		
		/*Object data = new Data();
		//casteo					// java.lang.ClassCastException
		Sender sender = (Sender)data; // no pasa nada!!!! en tiempo de compilacion
		*/	
		//en runtime : da un error
		
		Data data2 = new Data();
		//data2.send("hola");			// java.lang.NullPointerException
		//-----------------------------------------------------------------------------//
		
		
		//como programador debo controlar las que son checked exception extends Exception
		
		//Thread.sleep(1000);
		
		Calculadora calc = new Calculadora();
		try {
			calc.dividir(100, 100);
		} catch (MiExeption e) {
			e.printStackTrace();
		} finally {
			//se ejecuta siempre
			//cerrar el recurso
		}
		
		//try with resources: cierra automaticamente el server socket
		try( 
				ServerSocket ss = new ServerSocket(1000);
				ServerSocket ss2 = new ServerSocket(2000);
				Calculadora calc3 = new Calculadora();
			) {
			//aca va la magia!!!
			System.out.println("Ejecutando magia!!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

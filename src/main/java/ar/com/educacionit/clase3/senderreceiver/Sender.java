package ar.com.educacionit.clase3.senderreceiver;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable{

	private Data data;

	public Sender(Data data) {
		this.data = data;
	}

	public void run() {
		//aca puedo obtener datos de una db
		//un archivo, un servicio externo 
		//etc etc
		
		//File -> leer 
		
		String packets[] = {
				"FIRT PACKET",
				"SOCOND PACKET",
				"THIRD PACKET",
				"FOURTH PACKET",
				"END"
		};
		
		for(String packet : packets) {
			//envio el packet
			this.data.send(packet);
			
			//simulo una espera por tráfico
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("thread interrupted" + e.getMessage());
				//Log.error();
			}
			
		}
	}
	
}

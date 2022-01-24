package ar.com.educacionit.clase3.senderreceiver;

import java.util.concurrent.ThreadLocalRandom;

import ar.com.educacionit.clase3.socket.exceptions.MiRuntimeException;

public class Receiver implements Runnable{

	private Data load;
	
	public Receiver(Data load) {
		this.load = load;
	}

	public void run() {
		
		for(
			String receivedMessage = load.recive() ;
			!"END".equals(receivedMessage); 
			receivedMessage = load.recive() ) {
			/*
			if(receivedMessage == null) {
				throw new MiRuntimeException();
			}
			*/
			System.out.println("Received:" + receivedMessage);
			
			//simular trafico de red
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println("All packet has been recived");
	}
}

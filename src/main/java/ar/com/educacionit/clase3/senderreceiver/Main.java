package ar.com.educacionit.clase3.senderreceiver;

public class Main {

	public static void main(String[] args) {
		
		Data data = new Data(); 
		
		Thread receiver = new Thread(new Receiver(data));
		Thread sender = new Thread(new Sender(data));
		
		receiver.start();
		sender.start();
	}

}

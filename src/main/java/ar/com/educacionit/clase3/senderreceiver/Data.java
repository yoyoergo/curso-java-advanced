package ar.com.educacionit.clase3.senderreceiver;

public class Data {

	//informacion
	private String packet;
	
	//true  si en receiver debe esperar
	//false si el sender debe esperar
	private boolean transfer;
	
	public synchronized void send(String packet) {
		while(!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		transfer = false;
		this.packet = packet;
		notifyAll();
	}
	
	public synchronized String recive() {
		while(transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		transfer = true;
		notifyAll();
		return packet;
	}
}

package ar.com.educacionit.clase2.cuenta;

public class AppBanco {

	/**
	 * Sincronizacion de hilos
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(2000);
		
		//cuenta compartida 
		Cliente cliente1 = new Cliente(cuenta,"juan");
		Cliente cliente2 = new Cliente(cuenta,"maria");
		
		cliente1.start();
		cliente2.start();
	}
}

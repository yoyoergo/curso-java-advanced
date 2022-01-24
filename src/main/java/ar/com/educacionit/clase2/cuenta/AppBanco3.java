package ar.com.educacionit.clase2.cuenta;

public class AppBanco3 {

	/**
	 * Sincronizacion de hilos
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(2000);
		
		//cuenta compartida 
		Cliente cliente1 = new Cliente(cuenta,"juan");
		Cliente cliente2 = new Cliente(cuenta,"maria");
		
		Thread tDeb = new Thread(new Debitar(cliente1, 1000));
		Thread tCred = new Thread(new Acreditar(cliente2, 500));
		
		tDeb.start();
		tCred.start();
		
		try {
			tDeb.join();
			tCred.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("saldo final: "+cuenta.getSaldo());
		System.out.println("Fin");
	}
}

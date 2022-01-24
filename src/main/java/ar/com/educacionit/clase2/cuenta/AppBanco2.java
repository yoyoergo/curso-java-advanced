package ar.com.educacionit.clase2.cuenta;

public class AppBanco2 {

	/**
	 * Sincronizacion de hilos
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(2000);
		
		//cuenta compartida 
		Cliente cliente1 = new Cliente(cuenta,"juan");
		Cliente cliente2 = new Cliente(cuenta,"maria");
		
		new Thread(new Debitar(cliente1, 2000)).start();
		new Thread(new Acreditar(cliente2, 2000)).start();

		System.out.println("saldo final: "+cuenta.getSaldo());
		System.out.println("Fin");
		
	}
}

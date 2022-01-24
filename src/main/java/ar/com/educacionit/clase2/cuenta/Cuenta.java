package ar.com.educacionit.clase2.cuenta;

public class Cuenta {

	private double saldo;
	//private tipoCuenta TipoCuenta;
	
	public Cuenta(double saldo) {
		/*
		if(tipoCuenta.equals(CA)) { 
			if(saldo<0) {
				throw ""
			}
		}*/
		this.saldo = saldo;
		
	}
	
	/*
	 * Si dos consumen el mismo metodo podran extraer 2000 
	public void debitar(double monto) {
		System.out.println(" - Iniciando operacion debitar - ");
		
		if(monto <= saldo) {
			//acá generalmente se invoca a un DB
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			saldo -=monto;
		}else {
			System.out.println("- Saldo insuficiente -");
		}
		
		System.out.println(" - Finaliza operacion debitar -");
	}
	*/
	/**
	 * Semaforo: synchronized
	 * El primero que llega entra al metodo toma la plata
	 * El segundo espera, y no puede sacar
	 * desde java 7: sincronizacion parcial 
	 * @param monto
	 */
	/*
	public synchronized void debitar(double monto) {
		System.out.println(" - Iniciando operacion debitar - ");
		
		if(monto <= saldo) {
			//acá generalmente se invoca a un DB
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			saldo -=monto;
		}else {
			System.out.println("- Saldo insuficiente -");
		}
		
		System.out.println(" - Finaliza operacion debitar -");
	}
	*/
	
	public void debitar(double monto) {
		System.out.println(" - Iniciando operacion debitar - ");
		
		synchronized (this) {
			if(monto <= saldo) {
				//acá generalmente se invoca a un DB
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				saldo -=monto;
			}else {
				System.out.println("- Saldo insuficiente -");
			}
		}
		
		System.out.println(" - Finaliza operacion debitar -");
	}
	
	public void acreditar(double monto) {
		this.saldo+=monto;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}

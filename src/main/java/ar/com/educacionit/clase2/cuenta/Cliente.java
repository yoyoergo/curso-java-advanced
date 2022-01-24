package ar.com.educacionit.clase2.cuenta;

public class Cliente extends Thread {

	private Cuenta cuenta;
	
	public Cliente(Cuenta cuenta ) {
		if(cuenta == null) {
			throw new RuntimeException("La cuenta es nula");
		}
		this.cuenta = cuenta;
	}
	
	public Cliente(Cuenta cuenta,String nombre ) {
		super(nombre);
		if(cuenta == null) {
			throw new RuntimeException("La cuenta es nula");
		}
		this.cuenta = cuenta;
	}
	
	@Override
	public void run() {
		cuenta.debitar(2000);
		System.out.println("saldo "+  cuenta.getSaldo());
	}
	
	public Cuenta getCuenta() {
		return this.cuenta;
	}
}

package ar.com.educacionit.clase2.cuenta;

public class Acreditar extends Operacion {

	public Acreditar(Cliente cliente,double monto) {
		super(cliente,monto);
	}

	@Override
	public void ejecutar() {
		cliente.getCuenta().acreditar(monto);
	}

}

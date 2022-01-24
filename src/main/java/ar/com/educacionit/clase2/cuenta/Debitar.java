package ar.com.educacionit.clase2.cuenta;

public class Debitar extends Operacion {

	public Debitar(Cliente cliente,double monto) {
		super(cliente,monto);
	}

	@Override
	public void ejecutar() {
		cliente.getCuenta().debitar(monto);
	}

}

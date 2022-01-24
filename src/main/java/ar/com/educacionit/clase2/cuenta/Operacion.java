package ar.com.educacionit.clase2.cuenta;

public abstract class Operacion implements Runnable {

	protected Cliente cliente;
	protected double monto;
	
	public Operacion(Cliente cliente, double monto) {
		this.cliente = cliente;
		this.monto = monto;
	}

	public abstract void ejecutar();
	
	@Override
	public void run() {
		ejecutar();//esto lo hacen los hijos
	}
}

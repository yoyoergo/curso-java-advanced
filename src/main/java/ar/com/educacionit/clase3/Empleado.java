package ar.com.educacionit.clase3;

public class Empleado extends Thread {

	private String nombre;
	private boolean esJefe;
	
	private Saludo saludo;

	public Empleado(String nombre, boolean esJefe, Saludo saludo) {
		super(nombre);
		this.nombre = nombre;
		this.esJefe = esJefe;
		this.saludo = saludo;
	}
	
	@Override
	public void run() {
		this.saludo.saludar(this.nombre, this.esJefe);
	}

	public boolean isEsJefe() {
		return esJefe;
	}
	
}

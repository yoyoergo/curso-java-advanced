package ar.com.educacionit.clase1.runnables;

public class Proceso1 extends ProcesoBase implements Runnable {

	public Proceso1(String nombre, boolean auditable) {
		super(nombre, auditable);
	}

	public void run() {
		if(auditable) {
			System.out.println(this.nombre + " es auditable");
		}
		System.out.println("realizando tarea...." + this.nombre);
	}

}

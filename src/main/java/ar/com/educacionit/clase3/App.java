package ar.com.educacionit.clase3;

public class App {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Empleados: jefe / comun
		 */
		
		Saludo saludo = new Saludo();
		
		Empleado juan = new Empleado("juan", false, saludo);
		Empleado carlos = new Empleado("carlos", false, saludo);
		Empleado martin = new Empleado("martin", false, saludo);
		Empleado jefe = new Empleado("soy jefe", true, saludo);
		
		//pongo a correr todos los hilos
		juan.start();
		carlos.start();
		martin.start();
		
		Thread.sleep(1000);
		jefe.start();
	}

}

package ar.com.educacionit.clase3;

public class Saludo {
	
	public synchronized void saludar(String nombre, boolean esJefe) {
		
		if(!esJefe) {
			System.out.println(" Hola llegué : " + nombre);
			try { wait(); } catch (InterruptedException e) { e.printStackTrace();}
			System.out.println("Hola jefe!!!");
		}else {
			System.out.println("Hola muchachos a trabajar!!!");
			notifyAll();
		}
		
	}	

}

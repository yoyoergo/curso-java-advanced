package ar.com.educacionit.clase1;

public class Hilo1 extends Thread{

	// private String nombre;
	
	public Hilo1(String nombre) {
		//this.nombre = nombre;
		//super(nombre);
	}
	
	@Override
	public void run() {
		int[] edades = new int[10];
		//edades[0] = 1;
		for(int i=0;i<10;i++) {
			edades[i] = i+1;
			System.out.println(edades[i] + ":" + this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

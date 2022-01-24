package ar.com.educacionit.clase1.runnables;

public class MainProcesosRunnables {

	public static void main(String[] args) {
		
		//venir de afuera ej: db
		Runnable[] runnables = new Runnable[4];
		runnables[0] = new Proceso1("lector de cds", false);
		runnables[1] = new Proceso2();
		runnables[2] = new Proceso3();
		runnables[3] = new Proceso4();
		
		Thread[] threads = new Thread[runnables.length];
		
		for(int i=0;i<threads.length;i++) {
			// r.start(); X
			Runnable r = runnables[i];
			threads[i] = new Thread(r);
		}
		
		for(Thread t : threads) {
			t.start();
		}
		
	}

}

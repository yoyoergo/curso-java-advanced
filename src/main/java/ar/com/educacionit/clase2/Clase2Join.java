package ar.com.educacionit.clase2;

class Clase2Join {

	public static void main(String[] args) {
		/**
		 * hilo main ----------------------|
		 * 			thread t ------------->-------------------|
		 * 				t.join()
		 * 		thread t1------------------|------------------>|------->
		 * 				t1.join()
 				thread t2------------------------------------>|------->		 *
 						t2.join();
 				 
		 * 
		 * JOIN
		 */
		
		HiloT hiloT1 = new HiloT("Hilot1");
		HiloT hiloT2 = new HiloT("Hilot2");
		HiloT hiloT3 = new HiloT("Hilot3");
		HiloT hiloT4 = new HiloT("Hilot4");
		try {
			
			System.out.println(hiloT1.getState());
			System.out.println(hiloT1.isAlive());
			
			hiloT1.start();			
			hiloT2.start();			
			hiloT3.start();			
			hiloT4.start();
			
			hiloT1.join();
			hiloT2.join();
			hiloT3.join();
			hiloT4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(hiloT1.getState());
		System.out.println(hiloT1.isAlive());
		System.out.println("Fin aplicacion");
	}
}

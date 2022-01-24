package ar.com.educacionit.clase1;

public class Clase1 {

	public static void main(String[] args) {
		/*
			- vector 10: Tarea1 > 10s
			
			- leer un archivo nube > Tarea2 > 10s
			
			- leer archivo hd > Tarea3 > 2s
		
			- grabar en db
		
				TAREA1 		TAREA2
			|-----------|-----------|
			   10S			10S
									TAREA3
									|----|
									  2S	
			TOTAL = 22S
			
			¿ES NECESARIO EN SERIE? 
			
			TAREA 1
			|--------|
			    10S
			
			TAREA 2
			|--------|
				10S
			un quantum 
					TAREA3	
					|----|
					  2S
			Total: 12s
			
			TAREA 1
			|--------|
			    10S
			
			TAREA 2
			|--------|
				10S
			TAREA 3
			|----|
			  2S
			
			TOTAL 10S
		*/
		
		/*
		int[] edades = new int[10];
		//edades[0] = 1;
		for(int i=0;i<10;i++) {
			edades[i] = i+1;
			System.out.println(edades[i]);
		}		
		*/
		//CREAMOS UN HILO
		Hilo1 hilo1 = new Hilo1("Hilo-1");		
		Hilo1 hilo2 = new Hilo1("Hilo-2");
		
		HiloR hilor1 = new HiloR("HiloR-1");
		HiloR hilor2 = new HiloR("HiloR-2");
		
		//necesito la clase Thread y "pasarle" el Runnable que quiero ejectutar
		Thread tHiloR1 = new Thread(hilor1);
		Thread tHiloR2 = new Thread(hilor2);
		
		Thread t = new Thread(
				new Runnable() {				
					public void run() {
						System.out.println("Thread anónimo + runnable anónimo");
					}
				}
		);
		
		hilo1.start();		
		hilo2.start();		
		
		tHiloR1.start();
		//hilo anónimo
		new Thread() {
			public void run() {
				System.out.println("ejecutando hilo anónimo");
			};
		}.start();
		
		tHiloR2.start();
		t.start();
		
		//hilor2.run();
		//hilor1.run();
		
	}	

}

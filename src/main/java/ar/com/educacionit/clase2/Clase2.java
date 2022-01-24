package ar.com.educacionit.clase2;

class Clase2 {

	public static void main(String[] args) {
		/**
		 
		 Ciclo de vida
		 
		 NEW			RUNNABLE		TIMEWAITING			BLOQUED		TERMINATED
		 new Thread()	.start()		.sleep()			I/O			muete natural
		 								.wait()							asesinato: .stop()
		 								.suspend()
		 ---------------------------------------------------------------------------------- 
		 
		 JVM		WINDOW		LINUX		MacOs
		 1			1			1			-10
		 2
		 3
		 4
		 5			50			10			0
		 6
		 7
		 8
		 9
		 10			100			20			10
		 
		 */
		HiloT hiloT1 = new HiloT("hilot1");
		
		System.out.println(hiloT1.getState());
		System.out.println(hiloT1.isAlive());
		
		HiloT hiloT2 = new HiloT("hilot2",800);
		HiloT hiloT3 = new HiloT("hilot3",600);
		HiloT hiloT4 = new HiloT("hilot4",400);
		
		/*asignamos prioridad*/
		hiloT1.setPriority(Thread.MAX_PRIORITY);
		hiloT2.setPriority(Thread.NORM_PRIORITY);
		hiloT3.setPriority(Thread.NORM_PRIORITY);
		hiloT4.setPriority(Thread.MIN_PRIORITY);
		
		hiloT1.start();//cada 1sg > 10
		hiloT2.start();//cada 1sg > 10
		hiloT3.start();//cada 1sg > 10
		hiloT4.start();//cada 1sg > 10
		/*total = 10*/
		
		//saber el estado del hiloT1
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hiloT1.getState());
		System.out.println(hiloT1.isAlive());
		
		System.out.println("Fin del programa");
	}
}

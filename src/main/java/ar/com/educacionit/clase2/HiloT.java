package ar.com.educacionit.clase2;

public class HiloT extends Thread{

	private int time = 1000;
	
	public HiloT(String nombre) {
		super(nombre);
	}
	
	public HiloT(String nombre, int time) {
		super(nombre);
		if(time <= 0) {
			//crear nuetra exception
			//tipo no chequeada
			throw new RuntimeException("Time es menor a 0");
		}
		this.time = time;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(this.getName() + ": " + i);
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

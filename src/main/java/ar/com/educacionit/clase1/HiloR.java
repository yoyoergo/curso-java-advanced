package ar.com.educacionit.clase1;

public class HiloR implements Runnable{

	private String name;
	
	public HiloR(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {		
		for(int i=0;i<2;i++) {
			System.out.println(i + ":" +this.getName() );
		}				
	}

	private String getName() {
		return this.name;
	}
}

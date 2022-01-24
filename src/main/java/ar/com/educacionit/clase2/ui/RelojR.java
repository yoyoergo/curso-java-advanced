package ar.com.educacionit.clase2.ui;

import java.text.DecimalFormat;
import java.time.LocalTime;

import javax.swing.JTextField;

public class RelojR implements Runnable {

	//acoplado depende del "host"
	private JTextField text; 
	private final static DecimalFormat df = new DecimalFormat("00");
	
	public RelojR(JTextField text) {
		this.text = text;
	}

	@Override
	public void run() {

		//actualizar el atributo text.text
		//text.setText("21:02");
		while(true) {//ciclo infinito
			LocalTime lt = LocalTime.now();
			//hh:mm:ss
			String hora = df.format(lt.getHour());//09:05:01
			String minuto = df.format(lt.getMinute());
			String segundo = df.format(lt.getSecond());
			text.setText(hora+":"+minuto+":"+segundo);
	
			//cada 1 segundo 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

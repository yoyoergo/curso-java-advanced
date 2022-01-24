package ar.com.educacionit.clase2.ui;

import java.text.DecimalFormat;

import javax.swing.JTextField;

public class CronometroR implements Runnable {

	private JTextField text;
	private int cont = 0;
	private boolean correr;
	private final static DecimalFormat df = new DecimalFormat("000000");
	
	public CronometroR(JTextField text) {
		this.text = text;
	}

	@Override
	public void run() {
		
		while(true) {
			if(correr) {
				cont++;
				text.setText(df.format(cont));
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void start() {
		this.correr = true;		
	}
	public void pause() {
		this.correr = false;
	}
	public void stop() {
		this.cont = 0;
		this.correr = false;
		this.text.setText("000000");
	}
}

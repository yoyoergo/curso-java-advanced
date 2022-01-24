package ar.com.educacionit.clase2.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ar.com.educacionit.clase1.runnables.ReproductoR;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planel {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblCronometro;
	private JTextField textCronometro;
	
	private CronometroR cronometroR;
	
	private Thread reproductoR;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planel window = new Planel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Planel() {
		initialize();
		
		/*RelojR rejoj = new RelojR(textField);
		Thread tReloj = new Thread(rejoj);
		tReloj.start();*/
		
		new Thread(new RelojR(textField)).start();
		
		cronometroR = new CronometroR(textCronometro);
		
		JButton btnPlayMusic = new JButton("Start");
		btnPlayMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Evento btnPlayMusica > play al reproducto*/
				
				if(reproductoR == null || !reproductoR.isAlive()) {
					reproductoR = new Thread(new ReproductoR());
					reproductoR.start();
				}else {
					reproductoR.resume();
				}
				
			}
		});
		btnPlayMusic.setBounds(14, 144, 89, 23);
		frame.getContentPane().add(btnPlayMusic);
		
		JButton btnPauseMusic = new JButton("Pause");
		btnPauseMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Evento btnPauseMusic > pause  del hilo reproductoR*/
				if(reproductoR != null && reproductoR.isAlive()) {
					reproductoR.suspend();
				}
			}
		});
		btnPauseMusic.setBounds(113, 144, 89, 23);
		frame.getContentPane().add(btnPauseMusic);
		
		JButton btnStopMusic = new JButton("Stop");
		btnStopMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Evento btnStopMusic > stop del hilo reproductoR*/
				if(reproductoR !=null && reproductoR.isAlive()) {
					reproductoR.stop();
				}
			}
		});
		btnStopMusic.setBounds(209, 144, 89, 23);
		frame.getContentPane().add(btnStopMusic);
		new Thread(cronometroR).start();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblReloj = new JLabel("Hora:");
		lblReloj.setBounds(30, 11, 73, 30);
		frame.getContentPane().add(lblReloj);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(113, 16, 174, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblCronometro = new JLabel("Cronometro");
		lblCronometro.setBounds(23, 52, 49, 14);
		frame.getContentPane().add(lblCronometro);
		
		textCronometro = new JTextField();
		textCronometro.setText("000000");
		textCronometro.setBounds(113, 49, 174, 20);
		frame.getContentPane().add(textCronometro);
		textCronometro.setColumns(10);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ACCCION START
				cronometroR.start();
			}
		});
		btnNewButton.setBounds(14, 99, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pause");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cronometroR.pause();
			}
		});
		btnNewButton_1.setBounds(110, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stop");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cronometroR.stop();
			}
		});
		btnNewButton_2.setBounds(209, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
